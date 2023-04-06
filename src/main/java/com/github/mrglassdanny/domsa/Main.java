package com.github.mrglassdanny.domsa;


import com.github.mrglassdanny.domsa.lang.ds.DsRepository;
import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.client.SqlClient;
import com.github.mrglassdanny.domsa.lang.fn.FnRepository;
import com.github.mrglassdanny.domsa.util.FileUtil;
import com.google.gson.*;
import io.javalin.Javalin;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) throws Exception {

        init();

        var app = Javalin.create()
                .get("/", ctx -> ctx.result("domsa v0.0.1"))
                .post("/", ctx -> {
                    ctx.contentType("application/json");

                    String script = ctx.body();

                    var res = DomsaScriptInterpreter.exec(script, new JsonObject());

                    ctx.result(res == null ? JsonNull.INSTANCE.toString() : res.toString());
                    ctx.status(200);
                })
                .start(Integer.parseInt(Environment.properties.get("port")));

        try {
            registerApis(app);
        } catch (Exception e) {
            System.out.println("Failure to register apis: " + e.getMessage());
        }

        try {
            registerKafkaListeners();
        } catch (Exception e) {
            System.out.println("Failure to register kafka listeners: " + e.getMessage());
        }
    }

    private static void init() throws Exception {
        Environment.init();
        FnRepository.init();
        DsRepository.init();
        SqlClient.init(Environment.properties.get("databaseUrl"));
    }

    private static void cleanup() throws Exception {
        SqlClient.close();
    }

    private static void registerApis(Javalin app) throws Exception {

        JsonArray configArr = JsonParser.parseString(FileUtil.readFile("../config/api.json")).getAsJsonArray();

        final String basePath = "ds/api/";

        for (var config : configArr) {

            var configObj = config.getAsJsonObject();

            var ds = configObj.get("ds").getAsString();
            ds = ds.substring(0, ds.lastIndexOf('.'));
            var path = configObj.get("path").getAsString();
            path = basePath + path;
            var method = configObj.get("method").getAsString();

            var script = DsRepository.scripts.get(ds);

            // TODO
            app.post(path, ctx -> {
                ctx.contentType("application/json");

                String reqStr = ctx.body();

                JsonObject req = null;
                JsonObject res = null;

                try {
                    req = JsonParser.parseString(reqStr).getAsJsonObject();
                    res = DomsaScriptInterpreter.exec(script, req);
                } catch (JsonParseException | IllegalStateException jsonParseException) {
                    res = new JsonObject();
                    res.addProperty("requestError", "Expected JsonObject as request");
                }

                ctx.result(res == null ? JsonNull.INSTANCE.toString() : res.toString());
                ctx.status(200);
            });
        }
    }

    private static void registerKafkaListeners() throws Exception {

        JsonArray configArr = JsonParser.parseString(FileUtil.readFile("../config/kafka.json")).getAsJsonArray();

        for (var config : configArr) {

            var configObj = config.getAsJsonObject();

            var ds = configObj.get("ds").getAsString();
            ds = ds.substring(0, ds.lastIndexOf('.'));
            var topic = configObj.get("topic").getAsString();
            var groupId = configObj.get("groupId").getAsString();
            var clientId = Environment.properties.get("appName");

            var script = DsRepository.scripts.get(ds);

            CompletableFuture.runAsync(() -> {

                Properties props = new Properties();
                {
                    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, Environment.properties.get("bootstrapServer"));
                    props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
                    props.put(ConsumerConfig.CLIENT_ID_CONFIG, clientId);
                    props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
                    props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
                    props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
                    props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
                }

                try (KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props)) {
                    consumer.subscribe(Collections.singletonList(topic));
                    while (true) {
                        ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
                        for (var record : records) {
                            var req = JsonParser.parseString(record.value()).getAsJsonObject();
                            var res = DomsaScriptInterpreter.exec(script, req);
                            System.out.println(res.toString());
                        }
                    }
                }
            });
        }
    }
}

package com.github.mrglassdanny.domsa;


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

        registerApis(app);
        registerKafkaListeners();
    }

    private static void init() throws Exception {
        Environment.init();
        FnRepository.init();
        Repository.init();
        SqlClient.init(Environment.properties.get("databaseUrl"));
    }

    private static void cleanup() throws Exception {
        SqlClient.close();
    }

    private static void registerApis(Javalin app) throws Exception {

        for (var entry : Repository.apis.entrySet()) {

            var path = entry.getKey();
            var script = entry.getValue();

            app.post(path, ctx -> {
                ctx.contentType("application/json");

                String reqStr = ctx.body();

                JsonElement res;

                try {
                    var req = JsonParser.parseString(reqStr).getAsJsonObject();
                    res = DomsaScriptInterpreter.exec(script, req);
                } catch (JsonParseException | IllegalStateException jsonParseException) {
                    res = new JsonPrimitive("RequestError: Expected JsonObject as request");
                }

                ctx.result(res == null ? JsonNull.INSTANCE.toString() : res.toString());
                ctx.status(200);
            });
        }
    }

    private static void registerKafkaListeners() throws Exception {

        for (var entry : Repository.events.entrySet()) {

            var path = entry.getKey();
            var script = entry.getValue();

            var topic = path.substring(path.lastIndexOf('/') + 1);

            CompletableFuture.runAsync(() -> {

                Properties props = new Properties();
                {
                    props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, Environment.properties.get("bootstrapServer"));
                    props.put(ConsumerConfig.GROUP_ID_CONFIG, "test-group-1");
                    props.put(ConsumerConfig.CLIENT_ID_CONFIG, Environment.properties.get("appName"));
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
                            DomsaScriptInterpreter.exec(script, req);
                        }
                    }
                }
            });
        }
    }
}

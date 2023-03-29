package com.github.mrglassdanny.domsa;


import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptLexer;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.github.mrglassdanny.domsa.sql.SqlClient;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import io.javalin.Javalin;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Properties;

public class Main {

    public static HashMap<String, String> envConfigs = new HashMap<>();

    public static void main(String[] args) throws Exception {

        initConfigs();

        initComponents();

        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("domsa v0.0.1"))
                .start(7070);

        app.post("/script", ctx -> {
            String script = ctx.body();

            var parser = new DomsaScriptParser(
                    new CommonTokenStream(new DomsaScriptLexer(CharStreams.fromString(script))));
            var interp = new DomsaScriptInterpreter();

            JsonElement _res = null;

            try {
                _res = interp.visitScript(parser.script());
            } catch (Exception interpException) {
                _res = new JsonObject();
                _res.getAsJsonObject().addProperty("errmsg", interpException.getMessage());
            }

            ctx.result(_res == null ? JsonNull.INSTANCE.toString() : _res.toString());

            ctx.contentType("application/json");
            ctx.status(200);
        });
    }

    private static void initConfigs() throws Exception {
        String envFilePath = "environment.properties";
        FileReader reader = new FileReader((envFilePath));

        Properties props = new Properties();
        props.load(reader);

        envConfigs.put("databaseUrl", props.getProperty("databaseUrl"));

        reader.close();
    }

    private static void initComponents() throws Exception {
        SqlClient.init(envConfigs.get("databaseUrl"));
    }

    private static void cleanupComponents() throws Exception {
        SqlClient.close();
    }
}

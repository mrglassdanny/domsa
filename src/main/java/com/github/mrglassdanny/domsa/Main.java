package com.github.mrglassdanny.domsa;


import com.github.mrglassdanny.domsa.lang.DomsaScriptRegistry;
import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.client.SqlClient;
import com.google.gson.*;
import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) throws Exception {

        initComponents();

        var app = Javalin.create()
                .get("/", ctx -> ctx.result("domsa v0.0.1"))
                .post("/", ctx -> {
                    ctx.contentType("application/json");

                    String script = ctx.body();

                    var res = DomsaScriptInterpreter.execScript(script, new JsonObject());

                    ctx.result(res == null ? JsonNull.INSTANCE.toString() : res.toString());
                    ctx.status(200);
                })
                .start(Integer.parseInt(Environment.properties.get("port")));

        registerApis(app);
    }

    private static void initComponents() throws Exception {
        Environment.init();
        DomsaScriptRegistry.init();
        SqlClient.init(Environment.properties.get("databaseUrl"));
    }

    private static void cleanupComponents() throws Exception {
        SqlClient.close();
    }

    private static void registerApis(Javalin app) throws Exception {
        for (var entry : DomsaScriptRegistry.scripts.entrySet()) {
            var path = entry.getKey();
            var script = entry.getValue();

            app.post(path, ctx -> {
                ctx.contentType("application/json");

                String reqStr = ctx.body();

                JsonObject req = null;
                JsonObject res = null;

                try {
                    req = JsonParser.parseString(reqStr).getAsJsonObject();
                    res = DomsaScriptInterpreter.execScript(script, req);
                } catch (JsonParseException | IllegalStateException jsonParseException) {
                    res = new JsonObject();
                    res.addProperty("requestError", "Expected JsonObject as request");
                }

                ctx.result(res == null ? JsonNull.INSTANCE.toString() : res.toString());
                ctx.status(200);
            });
        }
     }
}

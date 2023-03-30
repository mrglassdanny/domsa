package com.github.mrglassdanny.domsa;


import com.github.mrglassdanny.domsa.lang.err.DomsaScriptSyntaxErrorListener;
import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptLexer;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.github.mrglassdanny.domsa.client.SqlClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import io.javalin.Javalin;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;

public class Main {

    public static void main(String[] args) throws Exception {

        initComponents();

        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("domsa v0.0.1"))
                .start(7070);

        app.post("/script", ctx -> {
            ctx.contentType("application/json");

            String script = ctx.body();

            var parser = new DomsaScriptParser(
                    new CommonTokenStream(new DomsaScriptLexer(CharStreams.fromString(script))));
            var errListener = new DomsaScriptSyntaxErrorListener();
            parser.addErrorListener(errListener);
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);

            JsonObject res = new JsonObject();

            try {
                var scriptCtx = parser.script();

                // Make sure we check for syntax errors before we pass to interpreter
                if (!errListener.syntaxErrors.isEmpty()) {
                    var errList = new JsonArray();
                    for (var err : errListener.syntaxErrors) {
                        var errInfo = new JsonObject();
                        errInfo.addProperty("line", err.line);
                        errInfo.addProperty("pos", err.charPositionInLine);
                        errInfo.addProperty("msg", err.msg);
                        errList.add(errInfo);
                    }
                    res.add("syntaxErrors", errList);
                } else {
                    res = new DomsaScriptInterpreter().visitScript(scriptCtx);
                }
            } catch (RecognitionException recognitionException) {
                res.addProperty("recognitionError", recognitionException.getMessage());
            } catch (RuntimeException interpException) {
                res = new JsonObject();
                res.addProperty("runtimeError", interpException.getMessage());
            }

            ctx.result(res == null ? JsonNull.INSTANCE.toString() : res.toString());
            ctx.status(200);
        });
    }

    private static void initComponents() throws Exception {
        Environment.init();

        SqlClient.init(Environment.properties.get("databaseUrl"));

    }

    private static void cleanupComponents() throws Exception {
        SqlClient.close();
    }
}

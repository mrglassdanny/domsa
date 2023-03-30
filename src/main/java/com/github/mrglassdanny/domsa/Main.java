package com.github.mrglassdanny.domsa;


import com.github.mrglassdanny.domsa.lang.err.DomsaScriptSyntaxErrorListener;
import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptLexer;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.github.mrglassdanny.domsa.client.SqlClient;
import com.google.gson.*;
import io.javalin.Javalin;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;

import java.io.File;
import java.io.FileReader;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {

        initComponents();

        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("domsa v0.0.1"))
                .start(7070);

        app.post("/", ctx -> {
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

        registerApis(app);
    }

    private static void initComponents() throws Exception {
        Environment.init();

        SqlClient.init(Environment.properties.get("databaseUrl"));
    }

    private static void cleanupComponents() throws Exception {
        SqlClient.close();
    }

    private static void registerApis(Javalin app) throws Exception {
        File dir = new File("ds/");
        registerApis(app, dir.listFiles());
    }

    private static void registerApis(Javalin app, File[] files) throws Exception {
        for (File file : files) {
            if (file.isDirectory()) {
                registerApis(app, file.listFiles());
            } else {

                String script = new String(Files.readAllBytes(Paths.get(file.getPath())));

                System.out.println(script);

                String path = file.getPath().replace('\\', '/');
                path = path.substring(0, path.lastIndexOf('.'));

                System.out.println(path);
                app.post(path, ctx -> {
                    ctx.contentType("application/json");

                    String reqStr = ctx.body();
                    var req = JsonParser.parseString(reqStr).getAsJsonObject();

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
                            res = new DomsaScriptInterpreter(req).visitScript(scriptCtx);
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
        }
    }
}

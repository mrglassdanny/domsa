package com.github.mrglassdanny.domsa;


import com.github.mrglassdanny.domsa.api.ApiClient;
import com.github.mrglassdanny.domsa.lang.DomsaScriptInterpreter;
import com.github.mrglassdanny.domsa.lang.DomsaScriptVariable;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptLexer;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.github.mrglassdanny.domsa.sql.SqlClient;
import io.javalin.Javalin;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) throws Exception {

        SqlClient.init("C:\\Users\\danie\\OneDrive\\Desktop\\domsa.db");

        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("domsa v0.0.1"))
                .start(7070);

        app.post("/script", ctx -> {
            String script = ctx.body();

            var parser = new DomsaScriptParser(
                    new CommonTokenStream(new DomsaScriptLexer(CharStreams.fromString(script))));
            var scriptCtx = parser.script();
            var interp = new DomsaScriptInterpreter();
            interp.visitScript(scriptCtx);

            ctx.result(interp.variables.get("_res").data.toString());

            ctx.status(200);
        });

        SqlClient.close();
    }
}

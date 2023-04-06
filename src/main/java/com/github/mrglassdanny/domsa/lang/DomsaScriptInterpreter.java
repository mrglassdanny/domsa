package com.github.mrglassdanny.domsa.lang;

import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptBaseVisitor;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptLexer;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.github.mrglassdanny.domsa.lang.err.DomsaScriptSyntaxErrorListener;
import com.github.mrglassdanny.domsa.lang.fn.FnRepository;
import com.google.gson.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomsaScriptInterpreter extends DomsaScriptBaseVisitor {

    private static final Logger log = LoggerFactory.getLogger(DomsaScriptInterpreter.class);

    private static final Pattern FORMAT_STRING_PATTERN = Pattern.compile("\\{.*?}", Pattern.CASE_INSENSITIVE);

    Stack<HashMap<String, JsonElement>> scopes;

    public DomsaScriptInterpreter() {
        this(new JsonObject());
    }

    public DomsaScriptInterpreter(JsonObject req) {
        this.scopes = new Stack<>();

        var mainScopeVariables = new HashMap<String, JsonElement>(2);

        mainScopeVariables.put("req", req);
        mainScopeVariables.put("res", new JsonObject());

        this.scopes.push(mainScopeVariables);
    }

    public static JsonObject exec(String script, JsonObject req) {

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

        return res;
    }

    private HashMap<String, JsonElement> getScope(String name) {
        // Purposely starting search at highest level scope
        for (int scopeIdx = this.scopes.size() - 1; scopeIdx >= 0; scopeIdx--) {
            var scope = this.scopes.get(scopeIdx);
            if (scope.containsKey(name)) {
                return scope;
            }
        }

        return null;
    }

    private JsonElement getVariable(String name) {

        // Purposely starting search at highest level scope
        for (int scopeIdx = this.scopes.size() - 1; scopeIdx >= 0; scopeIdx--) {
            var scope = this.scopes.get(scopeIdx);
            if (scope.containsKey(name)) {
                return scope.get(name);
            }
        }

        return null;
    }

    private void putVariable(String name, JsonElement data) {
        this.scopes.peek().put(name, data);
    }

    private String evalString(String str) {
        // Remove extra double quotes
        return str.substring(1, str.length() - 1);
    }

    private String evalFormatString(String fmtStr) {
        String adjFmtStr = fmtStr;
        Matcher matcher = FORMAT_STRING_PATTERN.matcher(fmtStr);
        while (matcher.find()) {
            String matchStr = matcher.group();
            // Remove curly braces
            String exprStr = matchStr.substring(1, matchStr.length() - 1);
            var parser = new DomsaScriptParser(
                    new CommonTokenStream(new DomsaScriptLexer(CharStreams.fromString(exprStr))));
            var exprCtx = parser.expr();
            var exprRes = this.visitExpr(exprCtx);
            adjFmtStr = adjFmtStr.replace(matchStr, exprRes.getAsString().replace("\"", ""));
        }

        // Remove back ticks
        return adjFmtStr.substring(1, adjFmtStr.length() - 1);
    }

    @Override
    public JsonElement visitIdExpr(DomsaScriptParser.IdExprContext ctx) {

        // Either dealing with Id (non object field) or Id within object (object field)

        if (ctx.Dot().isEmpty()) { // non object field
            var val = this.getVariable(ctx.getText());
            return val != null ? val : JsonNull.INSTANCE;
        } else { // object field
            var obj = this.getVariable(ctx.Id(0).getText());
            for (int dotIdx = 0, idIdx = 1; dotIdx < ctx.Dot().size() - 1 && obj != null; dotIdx++, idIdx++) {
                obj = obj.getAsJsonObject().get(ctx.Id(idIdx).getText());
            }
            if (obj == null) {
                return JsonNull.INSTANCE;
            }

            var val = obj.getAsJsonObject().get(ctx.Id(ctx.Id().size() - 1).getText());
            if (val == null) {
                return JsonNull.INSTANCE;
            }

            return val;
        }
    }

    @Override
    public JsonElement visitFnArgExpr(DomsaScriptParser.FnArgExprContext ctx) {
        if (ctx.expr() != null) {
            return this.visitExpr(ctx.expr());
        } else if (ctx.jsonArr() != null) {
            return this.visitJsonArr(ctx.jsonArr());
        } else {
            return this.visitJsonObj(ctx.jsonObj());
        }
    }

    @Override
    public JsonElement visitFnExpr(DomsaScriptParser.FnExprContext ctx) {

        String moduleName = ctx.Id(0).getText();
        String fnName = ctx.Id(1).getText();

        ArrayList<JsonElement> fnArgs = new ArrayList<>();
        for (var fnArgExpr : ctx.fnArgExpr()) {
            fnArgs.add(this.visitFnArgExpr(fnArgExpr));
        }

        boolean catchErr = ctx.Question() != null;

        try {
            return FnRepository.exec(moduleName, fnName, fnArgs);
        } catch (Exception fnException) {
            if (!catchErr) {
                throw new RuntimeException(fnException.getMessage());
            }
            return JsonNull.INSTANCE;
        }
    }

    @Override
    public JsonElement visitBaseExpr(DomsaScriptParser.BaseExprContext ctx) {
        if (ctx.expr() != null) {
            return this.visitExpr(ctx.expr());
        } else if (ctx.idExpr() != null) {
            return this.visitIdExpr((ctx.idExpr()));
        } else if (ctx.fnExpr() != null) {
            return this.visitFnExpr(ctx.fnExpr());
        } else if (ctx.Number() != null) {
            return new JsonPrimitive(Double.parseDouble(ctx.Number().getText()));
        } else if (ctx.String() != null) {
            return new JsonPrimitive(evalString(ctx.String().getText()));
        } else if (ctx.FormatString() != null) {
            return new JsonPrimitive(this.evalFormatString(ctx.FormatString().getText()));
        } else if (ctx.True() != null) {
            return new JsonPrimitive(true);
        } else if (ctx.False() != null) {
            return new JsonPrimitive(false);
        } else {
            return JsonNull.INSTANCE;
        }
    }

    @Override
    public JsonElement visitMulExpr(DomsaScriptParser.MulExprContext ctx) {
        if (ctx.Star().isEmpty() && ctx.Div().isEmpty() && ctx.Mod().isEmpty()) {
            return this.visitBaseExpr(ctx.baseExpr(0));
        } else {
            var exprs = new ArrayList<JsonElement>();

            for (var exprCtx : ctx.baseExpr()) {
                exprs.add(this.visitBaseExpr(exprCtx));
            }

            var res = exprs.get(0).deepCopy();

            for (int exprIdx = 1, operIdx = 1; exprIdx < exprs.size(); exprIdx++, operIdx += 2) {
                String oper = ctx.children.get(operIdx).getText();
                if (oper.equals("*")) {
                    res = JsonHelper.mul(res, exprs.get(exprIdx));
                } else if (oper.equals("/")) {
                    res = JsonHelper.div(res, exprs.get(exprIdx));
                } else {
                    res = JsonHelper.mod(res, exprs.get(exprIdx));
                }
            }

            return res;
        }
    }

    @Override
    public JsonElement visitAddExpr(DomsaScriptParser.AddExprContext ctx) {
        if (ctx.Plus().isEmpty() && ctx.Minus().isEmpty()) {
            return this.visitMulExpr(ctx.mulExpr(0));
        } else {
            var exprs = new ArrayList<JsonElement>();

            for (var exprCtx : ctx.mulExpr()) {
                exprs.add(this.visitMulExpr(exprCtx));
            }

            var res = exprs.get(0).deepCopy();

            for (int exprIdx = 1, operIdx = 1; exprIdx < exprs.size(); exprIdx++, operIdx += 2) {
                String oper = ctx.children.get(operIdx).getText();
                if (oper.equals("+")) {
                    res = JsonHelper.add(res, exprs.get(exprIdx));
                } else {
                    res = JsonHelper.sub(res, exprs.get(exprIdx));
                }
            }

            return res;
        }
    }

    @Override
    public JsonElement visitRelExpr(DomsaScriptParser.RelExprContext ctx) {
        if (ctx.Equal().isEmpty() && ctx.NotEqual().isEmpty() &&
                ctx.Less().isEmpty() && ctx.Greater().isEmpty() &&
                ctx.LessEqual().isEmpty() && ctx.GreaterEqual().isEmpty()) {
            return this.visitAddExpr(ctx.addExpr(0));
        } else {
            var exprs = new ArrayList<JsonElement>();

            for (var exprCtx : ctx.addExpr()) {
                exprs.add(this.visitAddExpr(exprCtx));
            }

            for (int exprIdx = 0, operIdx = 1; exprIdx < exprs.size() - 1; exprIdx++, operIdx += 2) {
                String oper = ctx.children.get(operIdx).getText();
                switch (oper) {
                    case "==" -> {
                        if (!JsonHelper.equals(exprs.get(exprIdx), (exprs.get(exprIdx + 1)))) {
                            return new JsonPrimitive(false);
                        }
                    }
                    case "!=" -> {
                        if (JsonHelper.equals(exprs.get(exprIdx), (exprs.get(exprIdx + 1)))) {
                            return new JsonPrimitive(false);
                        }
                    }
                    case "<" -> {
                        if (JsonHelper.compare(exprs.get(exprIdx), (exprs.get(exprIdx + 1))) >= 0) {
                            return new JsonPrimitive(false);
                        }
                    }
                    case ">" -> {
                        if (JsonHelper.compare(exprs.get(exprIdx), (exprs.get(exprIdx + 1))) <= 0) {
                            return new JsonPrimitive(false);
                        }
                    }
                    case "<=" -> {
                        if (JsonHelper.compare(exprs.get(exprIdx), (exprs.get(exprIdx + 1))) > 0) {
                            return new JsonPrimitive(false);
                        }
                    }
                    default -> {
                        if (JsonHelper.compare(exprs.get(exprIdx), (exprs.get(exprIdx + 1))) < 0) {
                            return new JsonPrimitive(false);
                        }
                    }
                }
            }

            return new JsonPrimitive(true);
        }
    }

    @Override
    public JsonElement visitLogAndExpr(DomsaScriptParser.LogAndExprContext ctx) {
        if (ctx.And().isEmpty()) {
            return this.visitRelExpr(ctx.relExpr(0));
        } else {
            var exprs = new ArrayList<JsonElement>();

            for (var exprCtx : ctx.relExpr()) {
                exprs.add(this.visitRelExpr(exprCtx));
            }

            for (var expr : exprs) {
                if (!expr.getAsBoolean())
                    return expr;
            }

            return new JsonPrimitive(true);
        }
    }

    @Override
    public JsonElement visitLogOrExpr(DomsaScriptParser.LogOrExprContext ctx) {
        if (ctx.Or().isEmpty()) {
            return this.visitLogAndExpr(ctx.logAndExpr(0));
        } else {
            var exprs = new ArrayList<JsonElement>();

            for (var exprCtx : ctx.logAndExpr()) {
                exprs.add(this.visitLogAndExpr(exprCtx));
            }

            for (var expr : exprs) {
                if (expr.getAsBoolean())
                    return expr;
            }

            return new JsonPrimitive(false);
        }
    }

    @Override
    public JsonElement visitExpr(DomsaScriptParser.ExprContext ctx) {
        return this.visitLogOrExpr(ctx.logOrExpr());
    }

    @Override
    public JsonElement visitJsonValue(DomsaScriptParser.JsonValueContext ctx) {
        if (ctx.expr() != null) {
            return this.visitExpr(ctx.expr());
        } else if (ctx.jsonArr() != null) {
            return this.visitJsonArr(ctx.jsonArr());
        } else {
            return this.visitJsonObj(ctx.jsonObj());
        }
    }

    @Override
    public JsonElement visitJsonArr(DomsaScriptParser.JsonArrContext ctx) {

        var arr = new JsonArray(ctx.jsonValue().size());

        for (var val : ctx.jsonValue()) {
            arr.add(this.visitJsonValue(val));
        }

        return arr;
    }

    @Override
    public JsonElement visitJsonObj(DomsaScriptParser.JsonObjContext ctx) {

        var obj = new JsonObject();

        for (var pair : ctx.jsonPair()) {

            String idText = null;
            if (pair.Id() != null) {
                idText = pair.Id().getText();
            } else if (pair.String() != null) {
                idText = evalString(pair.String().getText());
            } else {
                idText = evalFormatString(pair.FormatString().getText());
            }

            obj.add(idText, this.visitJsonValue(pair.jsonValue()));
        }

        return obj;
    }

    @Override
    public AssignTuple visitAssignId(DomsaScriptParser.AssignIdContext ctx) {

        if (ctx.Dot().isEmpty()) { // non object field

            var id = ctx.getText();
            if (id.equals("res")) {
                throw new RuntimeException("'res' is immutable");
            } else if (id.equals("req")) {
                throw new RuntimeException("'req' is immutable");
            }

            return new AssignTuple(id, this.getVariable(ctx.getText()));
        } else { // object field

            /*
                Behavior here is to create objects as necessary until we get to the Id being assigned
                    Ex: a.b.c.d where only a actually exists
                        We create object a.b, then object a.b.c, then return c to caller
                        for d assignment
             */


            var obj = this.getVariable(ctx.Id(0).getText());

            if (obj == null) {
                obj = new JsonObject();
                this.putVariable(ctx.Id(0).getText(), obj);
            }

            int dotIdx = 0;
            int idIdx = 1;
            for (; dotIdx < ctx.Dot().size() - 1; dotIdx++, idIdx++) {
                var subObj = obj.getAsJsonObject().get(ctx.Id(idIdx).getText());

                if (subObj == null) {
                    subObj = new JsonObject();
                    obj.getAsJsonObject().add(ctx.Id(idIdx).getText(), subObj);
                }

                obj = subObj;
            }

            return new AssignTuple(ctx.Id(idIdx).getText(), obj.getAsJsonObject());
        }
    }

    @Override
    public JsonElement visitAssignValue(DomsaScriptParser.AssignValueContext ctx) {
        if (ctx.expr() != null) {
            return this.visitExpr(ctx.expr());
        } else if (ctx.jsonArr() != null) {
            return this.visitJsonArr(ctx.jsonArr());
        } else {
            return this.visitJsonObj(ctx.jsonObj());
        }
    }

    @Override
    public JsonElement visitAssign(DomsaScriptParser.AssignContext ctx) {

        var tup = this.visitAssignId(ctx.assignId());

        JsonElement data = this.visitAssignValue(ctx.assignValue());

        if (tup.data == null) { // Means non object field does not exist in any scope
            this.putVariable(tup.name, data);
        } else { // previously existed or now exists in scope
            if (tup.data.isJsonObject()) {
                tup.data.getAsJsonObject().add(tup.name, data);
            } else {
                this.getScope(tup.name).put(tup.name, data);
            }
        }

        return JsonNull.INSTANCE;
    }

    @Override
    public JsonElement visitStmt(DomsaScriptParser.StmtContext ctx) {
        if (ctx.nestStmt() != null) {
            this.scopes.push(new HashMap<>());
            this.visitNestStmt(ctx.nestStmt());
            this.scopes.pop();
        } else if (ctx.assignStmt() != null) {
            return this.visitAssignStmt(ctx.assignStmt());
        } else if (ctx.condStmt() != null) {
            return this.visitCondStmt(ctx.condStmt());
        } else if (ctx.iterStmt() != null) {
            return this.visitIterStmt(ctx.iterStmt());
        } else if (ctx.fnStmt() != null) {
            return this.visitFnStmt(ctx.fnStmt());
        }

        return JsonNull.INSTANCE;
    }

    @Override
    public JsonElement visitAssignStmt(DomsaScriptParser.AssignStmtContext ctx) {
        return this.visitAssign(ctx.assign());
    }

    @Override
    public JsonElement visitCondStmt(DomsaScriptParser.CondStmtContext ctx) {

        for (int exprIdx = 0; exprIdx < ctx.expr().size(); exprIdx++) {

            var res = this.visitExpr(ctx.expr(exprIdx));

            // Looking for successful conditional test or the else
            if (res.getAsBoolean() || (exprIdx == ctx.expr().size() - 1 && ctx.Else() != null)) {
                this.scopes.push(new HashMap<>());
                this.visitNestStmt(ctx.nestStmt(exprIdx));
                this.scopes.pop();
                break;
            }
        }

        return JsonNull.INSTANCE;
    }

    @Override
    public JsonElement visitIterStmt(DomsaScriptParser.IterStmtContext ctx) {
        // Only support for loop

        var iter = ctx.Id().getText();

        var idExprRes = this.visitIdExpr(ctx.idExpr());
        if (!idExprRes.isJsonArray()) {
            throw new RuntimeException("'" + ctx.idExpr().getText() + "' is not an array");
        }

        var arr = idExprRes.getAsJsonArray();

        for (var elem : arr) {
            this.scopes.push(new HashMap<>());
            this.putVariable(iter, elem);
            this.visitNestStmt(ctx.nestStmt());
            this.scopes.pop();
        }

        return JsonNull.INSTANCE;
    }

    @Override
    public JsonElement visitFnStmt(DomsaScriptParser.FnStmtContext ctx) {
        return this.visitFnExpr(ctx.fnExpr());
    }

    @Override
    public JsonElement visitNestStmt(DomsaScriptParser.NestStmtContext ctx) {
        JsonElement stmtRes = null;
        for (var stmt : ctx.stmt()) {
            stmtRes = this.visitStmt(stmt);
        }
        return stmtRes;
    }

    @Override
    public JsonObject visitScript(DomsaScriptParser.ScriptContext ctx) {
        Object stmtRes = null;

        for (var stmt : ctx.stmt()) {
            stmtRes = this.visitStmt(stmt);
        }

        return this.getVariable("res").getAsJsonObject();
    }

    static class AssignTuple {
        public String name;
        public JsonElement data;

        AssignTuple(String name, JsonElement data) {
            this.name = name;
            this.data = data;
        }
    }

    static class JsonHelper {

        public static JsonElement mul(JsonElement a, JsonElement b) {
            try {
                return new JsonPrimitive(a.getAsDouble() * b.getAsDouble());
            } catch (Exception e) {
                throw new RuntimeException("Invalid operation: " + a.toString() + " * " + b.toString());
            }
        }

        public static JsonElement div(JsonElement a, JsonElement b) {
            try {
                return new JsonPrimitive(a.getAsDouble() / b.getAsDouble());
            } catch (Exception e) {
                throw new RuntimeException("Invalid operation: " + a.toString() + " / " + b.toString());
            }
        }

        public static JsonElement mod(JsonElement a, JsonElement b) {
            try {
                return new JsonPrimitive(a.getAsDouble() % b.getAsDouble());
            } catch (Exception e) {
                throw new RuntimeException("Invalid operation: " + a.toString() + " % " + b.toString());
            }
        }

        public static JsonElement add(JsonElement a, JsonElement b) {
            try {
                return new JsonPrimitive(a.getAsDouble() + b.getAsDouble());
            } catch (Exception e) {
                throw new RuntimeException("Invalid operation: " + a.toString() + " + " + b.toString());
            }
        }

        public static JsonElement sub(JsonElement a, JsonElement b) {
            try {
                return new JsonPrimitive(a.getAsDouble() - b.getAsDouble());
            } catch (Exception e) {
                throw new RuntimeException("Invalid operation: " + a.toString() + " - " + b.toString());
            }
        }

        public static boolean equals(JsonElement a, JsonElement b) {
            if (a == b) {
                return true;
            }

            return compare(a, b) == 0;
        }

        public static int compare(JsonElement a, JsonElement b) {

            // Throws exception if a or b is array/object
            // Otherwise compares primitives as strings/handles nulls

            if (a.isJsonNull() || b.isJsonNull()) {
                if (a.isJsonNull() && b.isJsonNull()) {
                    return 0;
                } else {
                    if (a.isJsonNull()) {
                        return -1;
                    } else {
                        return 1;
                    }
                }

            }

            if (a.isJsonPrimitive() && b.isJsonPrimitive()) {
                return a.getAsString().compareTo(b.getAsString());
            } else {
                throw new RuntimeException("Invalid comparison: " + a.toString() + " and " + b.toString());
            }
        }
    }
}

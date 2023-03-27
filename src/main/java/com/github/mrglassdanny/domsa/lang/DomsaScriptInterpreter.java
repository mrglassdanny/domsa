package com.github.mrglassdanny.domsa.lang;

import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptBaseVisitor;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptLexer;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.google.gson.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomsaScriptInterpreter extends DomsaScriptBaseVisitor {

    private static final Pattern FORMAT_STRING_PATTERN = Pattern.compile("\\$\\{.*?}", Pattern.CASE_INSENSITIVE);

    public HashMap<String, JsonElement> variables; // TODO

    public DomsaScriptInterpreter() {
        this.variables = new HashMap<>(10);
    }

    @Override
    public JsonElement visitIdExpr(DomsaScriptParser.IdExprContext ctx) {

        if (this.variables.containsKey(ctx.getText())) {
            var val = this.variables.get(ctx.getText());
            return val.deepCopy();
        } else {
            // TODO
            return null;
        }
    }

    @Override
    public JsonElement visitFnExpr(DomsaScriptParser.FnExprContext ctx) {

        String fnName = ctx.Id().getText();

        if (fnName.equals("sql")) {

            return null;
        } else if (fnName.equals("get")) {
            return null;
        } else if (fnName.equals("post")) {
            return null;
        } else {
            return null;
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
            return new JsonPrimitive(ctx.Number().getText());
        } else if (ctx.String() != null) {
            return new JsonPrimitive(ctx.String().getText());
        } else if (ctx.FormatString() != null) {
            String fmtStrRes = ctx.FormatString().getText();

            Matcher matcher = FORMAT_STRING_PATTERN.matcher(ctx.FormatString().getText());
            while(matcher.find()) {
                String matchStr = matcher.group();
                String exprStr = matchStr.substring(2, matchStr.length() - 1);
                var parser = new DomsaScriptParser(
                        new CommonTokenStream(new DomsaScriptLexer(CharStreams.fromString(exprStr))));
                var exprCtx = parser.expr();
                var interp = new DomsaScriptInterpreter();
                var exprRes = interp.visitExpr(exprCtx);
                fmtStrRes = fmtStrRes.replace(matchStr, exprRes.getAsString().replace("\"", ""));
            }
            return new JsonPrimitive(fmtStrRes.substring(1, fmtStrRes.length() - 1));
        } else if (ctx.True() != null) {
            return new JsonPrimitive(true);
        } else if (ctx.False() != null) {
            return new JsonPrimitive(false);
        } else {
            return null;
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
    public JsonElement visitJsonPair(DomsaScriptParser.JsonPairContext ctx) {
        var val = this.visitJsonValue(ctx.jsonValue());
        this.variables.put(ctx.Id().getText(), val);
        return val;
    }

    @Override
    public JsonElement visitJsonArr(DomsaScriptParser.JsonArrContext ctx) {

        var arr = new JsonArray(ctx.jsonValue().size());

        for(var val : ctx.jsonValue()) {
            arr.add(this.visitJsonValue(val));
        }

        return arr;
    }

    @Override
    public JsonElement visitJsonObj(DomsaScriptParser.JsonObjContext ctx) {

        var obj = new JsonObject();

        for (var pair : ctx.jsonPair()) {
            obj.add(pair.Id().getText(), this.visitJsonValue(pair.jsonValue()));
        }

        return obj;
    }

    @Override
    public String visitAssignId(DomsaScriptParser.AssignIdContext ctx) {
        // TODO
        return ctx.getText();
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
    public String visitAssign(DomsaScriptParser.AssignContext ctx) {

        String varName = this.visitAssignId(ctx.assignId());

        if (ctx.assignValue().expr() != null) {
            this.variables.put(varName, this.visitExpr(ctx.assignValue().expr()));
        } else if (ctx.assignValue().jsonArr() != null) {
            this.variables.put(varName, this.visitJsonArr(ctx.assignValue().jsonArr()));
        } else {
            this.variables.put(varName, this.visitJsonObj(ctx.assignValue().jsonObj()));
        }

        return varName;
    }

    @Override
    public Object visitEos(DomsaScriptParser.EosContext ctx) {
        return super.visitEos(ctx);
    }

    @Override
    public Object visitStmt(DomsaScriptParser.StmtContext ctx) {
        if (ctx.nestStmt() != null) {
            return this.visitNestStmt(ctx.nestStmt());
        } else if (ctx.assignStmt() != null) {
            return this.visitAssignStmt(ctx.assignStmt());
        } else if (ctx.condStmt() != null) {
            return this.visitCondStmt(ctx.condStmt());
        } else if (ctx.iterStmt() != null) {
            return this.visitIterStmt(ctx.iterStmt());
        }

        return null;
    }

    @Override
    public Object visitAssignStmt(DomsaScriptParser.AssignStmtContext ctx) {
        return this.visitAssign(ctx.assign());
    }

    @Override
    public Object visitNestStmt(DomsaScriptParser.NestStmtContext ctx) {
        return this.visitStmt(ctx.stmt());
    }

    @Override
    public Object visitCondStmt(DomsaScriptParser.CondStmtContext ctx) {

        for (int exprIdx = 0; exprIdx < ctx.expr().size(); exprIdx++) {

            var res = this.visitExpr(ctx.expr(exprIdx));

            // Looking for successful conditional test or the else.
            if (res.getAsBoolean() || (exprIdx == ctx.expr().size() - 1 && ctx.Else() != null)) {
                this.visitNestStmt(ctx.nestStmt(exprIdx));
                break;
            }
        }

        return null;
    }

    @Override
    public Object visitIterStmt(DomsaScriptParser.IterStmtContext ctx) {

        if (ctx.For() != null) {
            var iterName = ctx.Id(0).getText();
            var listName = ctx.Id(1).getText();

            var arr = this.variables.get(listName).getAsJsonArray();

            for (var elem : arr) {
                this.variables.put(iterName, elem);
                this.visitNestStmt(ctx.nestStmt());
            }
        }

        return null;
    }

    @Override
    public Object visitRetStmt(DomsaScriptParser.RetStmtContext ctx) {
        return super.visitRetStmt(ctx);
    }

    @Override
    public Object visitScript(DomsaScriptParser.ScriptContext ctx) {
        return super.visitScript(ctx);
    }


    static class JsonHelper {

        public static JsonElement mul(JsonElement a, JsonElement b) {
            return new JsonPrimitive(a.getAsDouble() * b.getAsDouble());
        }

        public static JsonElement div(JsonElement a, JsonElement b) {
            return new JsonPrimitive(a.getAsDouble() / b.getAsDouble());
        }

        public static JsonElement mod(JsonElement a, JsonElement b) {
            return new JsonPrimitive(a.getAsDouble() % b.getAsDouble());
        }

        public static JsonElement add(JsonElement a, JsonElement b) {
            return new JsonPrimitive(a.getAsDouble() + b.getAsDouble());
        }

        public static JsonElement sub(JsonElement a, JsonElement b) {
            return new JsonPrimitive(a.getAsDouble() - b.getAsDouble());
        }

        public static boolean equals(JsonElement a, JsonElement b) {
            if (a == b) {
                return true;
            }

            return compare(a, b) == 0;
        }

        public static int compare(JsonElement a, JsonElement b) {
            if (a.isJsonPrimitive() && b.isJsonPrimitive()) {
                try {
                    var aVal = a.getAsDouble();
                    var bVal = b.getAsDouble();
                    return Double.compare(aVal, bVal);
                } catch (Exception numException) {
                    try {
                        var aVal = a.getAsBoolean();
                        var bVal = b.getAsBoolean();
                        return Boolean.compare(aVal, bVal);
                    } catch (Exception boolException) {
                        try {
                            var aVal = a.getAsString();
                            var bVal = b.getAsString();
                            return aVal.compareTo(bVal);
                        } catch (Exception strException) {
                            // TODO
                            return 0;
                        }
                    }
                }
            } else {
                // TODO
                return 0;
            }
        }

        public static boolean isVariable(JsonElement a) {
            return a != null && !a.isJsonNull() && !a.isJsonObject() && !a.isJsonArray() && !a.isJsonPrimitive();
        }
    }
}

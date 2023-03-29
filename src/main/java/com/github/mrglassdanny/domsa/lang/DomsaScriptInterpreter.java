package com.github.mrglassdanny.domsa.lang;

import com.github.mrglassdanny.domsa.api.ApiClient;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptBaseVisitor;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptLexer;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.github.mrglassdanny.domsa.sql.SqlClient;
import com.google.gson.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomsaScriptInterpreter extends DomsaScriptBaseVisitor {

    private static final Pattern FORMAT_STRING_PATTERN = Pattern.compile("\\{.*?}", Pattern.CASE_INSENSITIVE);
    private static final Pattern SQL_SELECT_PATTERN = Pattern.compile("select", Pattern.CASE_INSENSITIVE);

    private HashMap<String, JsonElement> variables;

    public DomsaScriptInterpreter() {
        this.variables = new HashMap<>(10);
        this.variables.put("_res", new JsonObject());
    }

    @Override
    public JsonElement visitIdExpr(DomsaScriptParser.IdExprContext ctx) {

        // Either dealing with regular id or id nested in object

        if (ctx.Dot().isEmpty()) {
            return this.variables.getOrDefault(ctx.getText(), JsonNull.INSTANCE);
        } else {
            var obj = this.variables.get(ctx.Id(0).getText());
            for (int dotIdx = 0, idIdx = 1; dotIdx < ctx.Dot().size() - 1 && obj != null; dotIdx++, idIdx++) {
                obj = obj.getAsJsonObject().get(ctx.Id(idIdx).getText());
            }
            if (obj == null) {
                return JsonNull.INSTANCE;
            }

            var field = obj.getAsJsonObject().get(ctx.Id(ctx.Id().size() - 1).getText());
            if (field == null) {
                return JsonNull.INSTANCE;
            }

            return field;
        }
    }

    @Override
    public JsonElement visitFnExpr(DomsaScriptParser.FnExprContext ctx) {

        String fnName = ctx.Id().getText();
        var fnArgJsonObj = ctx.jsonObj();

        if (fnName.equals("sql")) {
            if (fnArgJsonObj == null) {
                // TODO
            }

            var fnArgJsonObjRes = this.visitJsonObj(fnArgJsonObj).getAsJsonObject();

            var queryStr = fnArgJsonObjRes.get("query").getAsString();
            Matcher selectMatcher = SQL_SELECT_PATTERN.matcher(queryStr);

            if (selectMatcher.find()) {
                var arr = new JsonArray();

                ResultSet sqlRes = null;
                try {
                    sqlRes = SqlClient.execQuery(queryStr);
                    var cols = sqlRes.getMetaData();
                    while(sqlRes.next()) {
                        var obj = new JsonObject();
                        for (int colIdx = 1; colIdx <= cols.getColumnCount(); colIdx++) {
                            var col = cols.getColumnName(colIdx);
                            if (sqlRes.getObject(colIdx) != null) {
                                obj.add(col, new JsonPrimitive(sqlRes.getObject(colIdx).toString()));
                            } else {
                                obj.add(col, JsonNull.INSTANCE);
                            }

                        }
                        arr.add(obj);
                    }
                    sqlRes.close();
                } catch (SQLException sqlException) {
                    // TODO: log msg
                }

                return arr;
            } else {
                var obj = new JsonObject();

                try {
                    int rowsAffected = SqlClient.exec(queryStr);
                    obj.add("rowsAffected", new JsonPrimitive(rowsAffected));
                } catch (SQLException sqlException) {
                    // TODO
                    obj.add("msg", new JsonPrimitive(sqlException.getMessage()));
                }

                return obj;
            }

        } else if (fnName.equals("get")) {
            if (fnArgJsonObj == null) {
                // TODO
            }

            var fnArgJsonObjRes = this.visitJsonObj(fnArgJsonObj).getAsJsonObject();

            var urlStr = fnArgJsonObjRes.get("url").getAsString();

            JsonElement elem = null;
            try {
                elem = ApiClient.get(urlStr);
            } catch (Exception e) {
                // TODO
            }

            return elem;

        } else if (fnName.equals("post")) {
            if (fnArgJsonObj == null) {
                // TODO
            }

            var fnArgJsonObjRes = this.visitJsonObj(fnArgJsonObj).getAsJsonObject();

            var urlStr = fnArgJsonObjRes.get("url").getAsString();
            var bodyStr = fnArgJsonObjRes.get("body").getAsString();

            JsonElement elem = null;
            try {
                elem = ApiClient.post(urlStr, bodyStr);
            } catch (Exception e) {
                // TODO
            }

            return elem;
        } else if (fnName.equals("date")) {
            return new JsonPrimitive(new Date().toString());
        } else {
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
            return new JsonPrimitive(ctx.Number().getText());
        } else if (ctx.String() != null) {
            var str = ctx.String().getText();
            return new JsonPrimitive(str.substring(1, str.length() - 1));
        } else if (ctx.FormatString() != null) {
            String fmtStrRes = ctx.FormatString().getText();
            Matcher matcher = FORMAT_STRING_PATTERN.matcher(ctx.FormatString().getText());
            while(matcher.find()) {
                String matchStr = matcher.group();
                String exprStr = matchStr.substring(1, matchStr.length() - 1);
                var parser = new DomsaScriptParser(
                        new CommonTokenStream(new DomsaScriptLexer(CharStreams.fromString(exprStr))));
                var exprCtx = parser.expr();
                var exprRes = this.visitExpr(exprCtx);
                fmtStrRes = fmtStrRes.replace(matchStr, exprRes.getAsString().replace("\"", ""));
            }
            return new JsonPrimitive(fmtStrRes.substring(1, fmtStrRes.length() - 1));
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
    public AssignTuple visitAssignId(DomsaScriptParser.AssignIdContext ctx) {

        // If not object expression: return name of variable to be inserted into variables map later
        // If object expression: return name and parent object

        if (ctx.Dot().isEmpty()) {
            return new AssignTuple(ctx.getText(), null);
        } else {
            // TODO: if obj is null at any point we have a problem
            var obj = this.variables.get(ctx.Id(0).getText());
            int dotIdx = 0;
            int idIdx = 1;
            for (; dotIdx < ctx.Dot().size() - 1 && obj != null; dotIdx++, idIdx++) {
                obj = obj.getAsJsonObject().get(ctx.Id(idIdx).getText());
            }

            if (obj == null) {
                return new AssignTuple(ctx.Id(idIdx).getText(), JsonNull.INSTANCE);
            }

            return new AssignTuple(ctx.Id(idIdx).getText(), obj.getAsJsonObject());
        }
    }

    @Override
    public String visitAssign(DomsaScriptParser.AssignContext ctx) {

        var tup = this.visitAssignId(ctx.assignId());

        if (tup.data == null) { // Not object expression
            if (ctx.expr() != null) {
                this.variables.put(tup.name, this.visitExpr(ctx.expr()));
            } else if (ctx.jsonArr() != null) {
                this.variables.put(tup.name, this.visitJsonArr(ctx.jsonArr()));
            } else {
                this.variables.put(tup.name, this.visitJsonObj(ctx.jsonObj()));
            }
        } else { // Object expression
            if (ctx.expr() != null) {
                tup.data.getAsJsonObject().add(tup.name, this.visitExpr(ctx.expr()));
            } else if (ctx.jsonArr() != null) {
                tup.data.getAsJsonObject().add(tup.name, this.visitJsonArr(ctx.jsonArr()));
            } else {
                tup.data.getAsJsonObject().add(tup.name, this.visitJsonObj(ctx.jsonObj()));
            }
        }

        return null;
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
        } else if (ctx.fnStmt() != null) {
            return this.visitFnStmt(ctx.fnStmt());
        }

        return null;
    }

    @Override
    public Object visitAssignStmt(DomsaScriptParser.AssignStmtContext ctx) {
        return this.visitAssign(ctx.assign());
    }

    @Override
    public Object visitCondStmt(DomsaScriptParser.CondStmtContext ctx) {

        for (int exprIdx = 0; exprIdx < ctx.expr().size(); exprIdx++) {

            var res = this.visitExpr(ctx.expr(exprIdx));

            // Looking for successful conditional test or the else
            if (res.getAsBoolean() || (exprIdx == ctx.expr().size() - 1 && ctx.Else() != null)) {
                this.visitNestStmt(ctx.nestStmt(exprIdx));
                break;
            }
        }

        return null;
    }

    @Override
    public Object visitIterStmt(DomsaScriptParser.IterStmtContext ctx) {
        // Only support for loop

        var iter = ctx.Id().getText();
        var arr = this.visitIdExpr(ctx.idExpr()).getAsJsonArray();

        for (var elem : arr) {
            this.variables.put(iter, elem);
            this.visitNestStmt(ctx.nestStmt());
        }

        this.variables.remove(iter);

        return null;
    }

    @Override
    public Object visitFnStmt(DomsaScriptParser.FnStmtContext ctx) {
        return this.visitFnExpr(ctx.fnExpr());
    }

    @Override
    public Object visitNestStmt(DomsaScriptParser.NestStmtContext ctx) {
        Object stmtRes = null;
        for (var stmt : ctx.stmt()) {
            stmtRes = this.visitStmt(stmt);
        }
        return stmtRes;
    }

    @Override
    public JsonElement visitScript(DomsaScriptParser.ScriptContext ctx) {
        Object stmtRes = null;
        for (var stmt : ctx.stmt()) {
            stmtRes = this.visitStmt(stmt);
        }

        return this.variables.get("_res");
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

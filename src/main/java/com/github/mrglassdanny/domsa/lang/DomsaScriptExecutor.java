package com.github.mrglassdanny.domsa.lang;

import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptBaseVisitor;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.HashMap;

public class DomsaScriptExecutor extends DomsaScriptBaseVisitor {

    private HashMap<String, DomsaVariable> variables;

    public DomsaScriptExecutor() {
        this.variables = new HashMap<>();
    }

    @Override
    public Object visitIdExpr(DomsaScriptParser.IdExprContext ctx) {
        return super.visitIdExpr(ctx);
    }

    @Override
    public DomsaVariable visitFnExpr(DomsaScriptParser.FnExprContext ctx) {

        String fnName = ctx.Id().getText();

        DomsaType typ = DomsaType.Unknown;
        Object obj = null;

        if (fnName.equals("sql")) {

        } else if (fnName.equals("get")) {

        } else if (fnName.equals("post")) {

        }

        return new DomsaVariable(typ, obj);
    }

    @Override
    public Object visitArithExpr(DomsaScriptParser.ArithExprContext ctx) {
        return super.visitArithExpr(ctx);
    }

    @Override
    public Object visitMulExpr(DomsaScriptParser.MulExprContext ctx) {
        return super.visitMulExpr(ctx);
    }

    @Override
    public Object visitAddExpr(DomsaScriptParser.AddExprContext ctx) {
        return super.visitAddExpr(ctx);
    }

    @Override
    public Object visitRelExpr(DomsaScriptParser.RelExprContext ctx) {
        return super.visitRelExpr(ctx);
    }

    @Override
    public DomsaVariable visitEqValue(DomsaScriptParser.EqValueContext ctx) {
        return super.visitEqValue(ctx);
    }

    @Override
    public DomsaVariable visitEqExpr(DomsaScriptParser.EqExprContext ctx) {
        if (ctx.eqValue().size() == 0) {
            return this.visitEqValue(ctx.eqValue(0));
        } else {
            var exprs = new ArrayList<DomsaVariable>();

            for (var exprCtx : ctx.eqValue()) {
                exprs.add(this.visitEqValue(exprCtx));
            }



            if (ctx.Equal().size() != 0) {

            } else {

            }

            return new DomsaVariable(DomsaType.Boolean, true);
        }
    }

    @Override
    public DomsaVariable visitLogAndExpr(DomsaScriptParser.LogAndExprContext ctx) {
        if (ctx.And().size() == 0) {
            return this.visitLogEqExpr(ctx.logEqExpr(0));
        } else {
            var exprs = new ArrayList<DomsaVariable>();

            for (var exprCtx : ctx.logEqExpr()) {
                exprs.add(this.visitLogEqExpr(exprCtx));
            }

            for (var expr : exprs) {
                if (expr.data.equals(false))
                    return expr;
            }

            return new DomsaVariable(DomsaType.Boolean, true);
        }
    }

    @Override
    public DomsaVariable visitLogOrExpr(DomsaScriptParser.LogOrExprContext ctx) {
        if (ctx.Or().size() == 0) {
            return this.visitLogAndExpr(ctx.logAndExpr(0));
        } else {
            var exprs = new ArrayList<DomsaVariable>();

            for (var exprCtx : ctx.logAndExpr()) {
                exprs.add(this.visitLogAndExpr(exprCtx));
            }

            for (var expr : exprs) {
                if (expr.data.equals(true))
                    return expr;
            }

            return new DomsaVariable(DomsaType.Boolean, false);
        }
    }

    @Override
    public Object visitExpr(DomsaScriptParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public Object visitJsonValue(DomsaScriptParser.JsonValueContext ctx) {
        return super.visitJsonValue(ctx);
    }

    @Override
    public Object visitJsonPair(DomsaScriptParser.JsonPairContext ctx) {
        return super.visitJsonPair(ctx);
    }

    @Override
    public Object visitJsonArr(DomsaScriptParser.JsonArrContext ctx) {
        return new JsonParser().parseString(ctx.getText());
    }

    @Override
    public Object visitJsonObj(DomsaScriptParser.JsonObjContext ctx) {
        return super.visitJsonObj(ctx);
    }

    @Override
    public Object visitAssignOper(DomsaScriptParser.AssignOperContext ctx) {
        return super.visitAssignOper(ctx);
    }

    @Override
    public Object visitAssignValue(DomsaScriptParser.AssignValueContext ctx) {
        return super.visitAssignValue(ctx);
    }

    @Override
    public Object visitAssign(DomsaScriptParser.AssignContext ctx) {

        DomsaType typ = DomsaType.Unknown;
        Object obj = null;

        if (ctx.assignValue().expr() != null) {
            obj = this.visitExpr(ctx.assignValue().expr());
        } else {
            if (ctx.assignValue().jsonObj() != null) {
                obj = this.visitJsonObj(ctx.assignValue().jsonObj());
                typ = DomsaType.Object;
            } else {
                obj = this.visitJsonArr(ctx.assignValue().jsonArr());
                typ = DomsaType.Array;
            }
        }

        this.variables.put(ctx.idExpr().getText(), new DomsaVariable(typ, obj));

        return super.visitAssign(ctx);
    }

    @Override
    public Object visitEos(DomsaScriptParser.EosContext ctx) {
        return super.visitEos(ctx);
    }

    @Override
    public Object visitStmt(DomsaScriptParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Object visitAssignStmt(DomsaScriptParser.AssignStmtContext ctx) {
        return super.visitAssignStmt(ctx);
    }

    @Override
    public Object visitNestStmt(DomsaScriptParser.NestStmtContext ctx) {
        return super.visitNestStmt(ctx);
    }

    @Override
    public Object visitCondStmt(DomsaScriptParser.CondStmtContext ctx) {
        return super.visitCondStmt(ctx);
    }

    @Override
    public Object visitIterStmt(DomsaScriptParser.IterStmtContext ctx) {
        return super.visitIterStmt(ctx);
    }

    @Override
    public Object visitRetStmt(DomsaScriptParser.RetStmtContext ctx) {
        return super.visitRetStmt(ctx);
    }

    @Override
    public Object visitScript(DomsaScriptParser.ScriptContext ctx) {
        return super.visitScript(ctx);
    }
}

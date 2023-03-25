package com.github.mrglassdanny.domsa.lang;

import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptBaseVisitor;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.HashMap;

public class DomsaScriptInterpreter extends DomsaScriptBaseVisitor {

    private HashMap<String, DomsaScriptVariable> variables;

    public DomsaScriptInterpreter() {
        this.variables = new HashMap<>(10);
    }

    @Override
    public DomsaScriptVariable visitIdExpr(DomsaScriptParser.IdExprContext ctx) {

        if (this.variables.containsKey(ctx.getText())) {
            var val = this.variables.get(ctx.getText());
            return new DomsaScriptVariable(val.typ, val.data);
        } else {
            // Maybe an unidentified field in existing object.
            if (this.variables.containsKey(ctx.Id(0).getText())) {
                // TODO
                return new DomsaScriptVariable(DomsaScriptType.Unknown, null);
            } else {
                return new DomsaScriptVariable(DomsaScriptType.Unknown, null);
            }
        }
    }

    @Override
    public DomsaScriptVariable visitFnExpr(DomsaScriptParser.FnExprContext ctx) {

        String fnName = ctx.Id().getText();

        if (fnName.equals("sql")) {

        } else if (fnName.equals("get")) {

        } else if (fnName.equals("post")) {

        } else {

        }

        return new DomsaScriptVariable(DomsaScriptType.Unknown, null);
    }

    @Override
    public DomsaScriptVariable visitBaseExpr(DomsaScriptParser.BaseExprContext ctx) {
        if (ctx.expr() != null) {
            return this.visitExpr(ctx.expr());
        } else if (ctx.idExpr() != null) {
            return this.visitIdExpr((ctx.idExpr()));
        } else if (ctx.fnExpr() != null) {
            return this.visitFnExpr(ctx.fnExpr());
        } else if (ctx.Number() != null) {
            return new DomsaScriptVariable(DomsaScriptType.Number,
                    Double.parseDouble(ctx.Number().getText()));
        } else if (ctx.String() != null) {
            return new DomsaScriptVariable(DomsaScriptType.String, ctx.Number().getText());
        } else if (ctx.FormatString() != null) {
            return new DomsaScriptVariable(DomsaScriptType.String, ctx.Number().getText());
        } else if (ctx.True() != null) {
            return new DomsaScriptVariable(DomsaScriptType.Boolean, true);
        } else if (ctx.False() != null) {
            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
        } else {
            return new DomsaScriptVariable(DomsaScriptType.Unknown, null);
        }
    }

    @Override
    public DomsaScriptVariable visitMulExpr(DomsaScriptParser.MulExprContext ctx) {
        if (ctx.baseExpr().size() == 0) {
            return this.visitBaseExpr(ctx.baseExpr(0));
        } else {
            var exprs = new ArrayList<DomsaScriptVariable>();

            for (var exprCtx : ctx.baseExpr()) {
                exprs.add(this.visitBaseExpr(exprCtx));
            }

            var res = new DomsaScriptVariable(DomsaScriptType.Number, exprs.get(0).data);

            for (int exprIdx = 1, operIdx = 1; exprIdx < exprs.size() - 1; exprIdx++, operIdx += 2) {
                String oper = ctx.children.get(operIdx).getText();
                if (oper.equals("*")) {
                    res.mul(exprs.get(exprIdx + 1));
                } else if (oper.equals("/")) {
                    res.div(exprs.get(exprIdx + 1));
                } else {
                    res.mod(exprs.get(exprIdx + 1));
                }
            }

            return res;
        }
    }

    @Override
    public DomsaScriptVariable visitAddExpr(DomsaScriptParser.AddExprContext ctx) {
        if (ctx.mulExpr().size() == 0) {
            return this.visitMulExpr(ctx.mulExpr(0));
        } else {
            var exprs = new ArrayList<DomsaScriptVariable>();

            for (var exprCtx : ctx.mulExpr()) {
                exprs.add(this.visitMulExpr(exprCtx));
            }

            var res = new DomsaScriptVariable(DomsaScriptType.Number, exprs.get(0).data);

            for (int exprIdx = 1, operIdx = 1; exprIdx < exprs.size() - 1; exprIdx++, operIdx += 2) {
                String oper = ctx.children.get(operIdx).getText();
                if (oper.equals("+")) {
                    res.add(exprs.get(exprIdx + 1));
                } else {
                    res.sub(exprs.get(exprIdx + 1));
                }
            }

            return res;
        }
    }

    @Override
    public DomsaScriptVariable visitRelExpr(DomsaScriptParser.RelExprContext ctx) {
        if (ctx.addExpr().size() == 0) {
            return this.visitAddExpr(ctx.addExpr(0));
        } else {
            var exprs = new ArrayList<DomsaScriptVariable>();

            for (var exprCtx : ctx.addExpr()) {
                exprs.add(this.visitAddExpr(exprCtx));
            }

            for (int exprIdx = 0, operIdx = 1; exprIdx < exprs.size() - 1; exprIdx++, operIdx += 2) {
                String oper = ctx.children.get(operIdx).getText();
                int cmpRes = exprs.get(exprIdx).compare(exprs.get(exprIdx + 1));
                switch (oper) {
                    case "<":
                        if (cmpRes >= 0) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                    case ">":
                        if (cmpRes <= 0) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                    case "<=":
                        if (cmpRes > 0) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                    default:
                        if (cmpRes < 0) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                }
            }

            return new DomsaScriptVariable(DomsaScriptType.Boolean, true);
        }
    }

    @Override
    public DomsaScriptVariable visitEqExpr(DomsaScriptParser.EqExprContext ctx) {
        if (ctx.relExpr().size() == 0) {
            return this.visitRelExpr(ctx.relExpr(0));
        } else {
            var exprs = new ArrayList<DomsaScriptVariable>();

            for (var exprCtx : ctx.relExpr()) {
                exprs.add(this.visitRelExpr(exprCtx));
            }

            for (int exprIdx = 0, operIdx = 1; exprIdx < exprs.size() - 1; exprIdx++, operIdx += 2) {
                String oper = ctx.children.get(operIdx).getText();
                if (oper.equals("==")) {
                    if (!exprs.get(exprIdx).equals(exprs.get(exprIdx + 1))) {
                        return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                    }
                } else {
                    if (exprs.get(exprIdx).equals(exprs.get(exprIdx + 1))) {
                        return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                    }
                }
            }

            return new DomsaScriptVariable(DomsaScriptType.Boolean, true);
        }
    }

    @Override
    public DomsaScriptVariable visitLogAndExpr(DomsaScriptParser.LogAndExprContext ctx) {
        if (ctx.And().size() == 0) {
            return this.visitEqExpr(ctx.eqExpr(0));
        } else {
            var exprs = new ArrayList<DomsaScriptVariable>();

            for (var exprCtx : ctx.eqExpr()) {
                exprs.add(this.visitEqExpr(exprCtx));
            }

            for (var expr : exprs) {
                if (expr.data.equals(false))
                    return expr;
            }

            return new DomsaScriptVariable(DomsaScriptType.Boolean, true);
        }
    }

    @Override
    public DomsaScriptVariable visitLogOrExpr(DomsaScriptParser.LogOrExprContext ctx) {
        if (ctx.Or().size() == 0) {
            return this.visitLogAndExpr(ctx.logAndExpr(0));
        } else {
            var exprs = new ArrayList<DomsaScriptVariable>();

            for (var exprCtx : ctx.logAndExpr()) {
                exprs.add(this.visitLogAndExpr(exprCtx));
            }

            for (var expr : exprs) {
                if (expr.data.equals(true))
                    return expr;
            }

            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
        }
    }

    @Override
    public DomsaScriptVariable visitExpr(DomsaScriptParser.ExprContext ctx) {
        return this.visitLogOrExpr(ctx.logOrExpr());
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
    public Object visitAssignValue(DomsaScriptParser.AssignValueContext ctx) {
        return super.visitAssignValue(ctx);
    }

    @Override
    public Object visitAssign(DomsaScriptParser.AssignContext ctx) {

        DomsaScriptType typ = DomsaScriptType.Unknown;
        Object obj = null;

        if (ctx.assignValue().expr() != null) {
            obj = this.visitExpr(ctx.assignValue().expr());
        } else {
            if (ctx.assignValue().jsonObj() != null) {
                obj = this.visitJsonObj(ctx.assignValue().jsonObj());
                typ = DomsaScriptType.Object;
            } else {
                obj = this.visitJsonArr(ctx.assignValue().jsonArr());
                typ = DomsaScriptType.Array;
            }
        }

        this.variables.put(ctx.idExpr().getText(), new DomsaScriptVariable(typ, obj));

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

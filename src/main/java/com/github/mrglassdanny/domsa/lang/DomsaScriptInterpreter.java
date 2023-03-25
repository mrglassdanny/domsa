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
            return new DomsaScriptVariable(DomsaScriptType.Array, null);
        } else if (fnName.equals("get")) {
            return new DomsaScriptVariable(DomsaScriptType.Object, null);
        } else if (fnName.equals("post")) {
            return new DomsaScriptVariable(DomsaScriptType.Object, null);
        } else {
            return new DomsaScriptVariable(DomsaScriptType.Unknown, null);
        }
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
        if (ctx.baseExpr().size() == 1) {
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
        if (ctx.mulExpr().size() == 1) {
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
        if (ctx.addExpr().size() == 1) {
            return this.visitAddExpr(ctx.addExpr(0));
        } else {
            var exprs = new ArrayList<DomsaScriptVariable>();

            for (var exprCtx : ctx.addExpr()) {
                exprs.add(this.visitAddExpr(exprCtx));
            }

            for (int exprIdx = 0, operIdx = 1; exprIdx < exprs.size() - 1; exprIdx++, operIdx += 2) {
                String oper = ctx.children.get(operIdx).getText();
                switch (oper) {
                    case "==":
                        if (!exprs.get(exprIdx).equals(exprs.get(exprIdx + 1))) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                    case "!=":
                        if (exprs.get(exprIdx).equals(exprs.get(exprIdx + 1))) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                    case "<":
                        if (exprs.get(exprIdx).compare(exprs.get(exprIdx + 1)) >= 0) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                    case ">":
                        if (exprs.get(exprIdx).compare(exprs.get(exprIdx + 1)) <= 0) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                    case "<=":
                        if (exprs.get(exprIdx).compare(exprs.get(exprIdx + 1)) > 0) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                    default:
                        if (exprs.get(exprIdx).compare(exprs.get(exprIdx + 1)) < 0) {
                            return new DomsaScriptVariable(DomsaScriptType.Boolean, false);
                        }
                        break;
                }
            }

            return new DomsaScriptVariable(DomsaScriptType.Boolean, true);
        }
    }

    @Override
    public DomsaScriptVariable visitLogAndExpr(DomsaScriptParser.LogAndExprContext ctx) {
        if (ctx.And().size() == 1) {
            return this.visitRelExpr(ctx.relExpr(0));
        } else {
            var exprs = new ArrayList<DomsaScriptVariable>();

            for (var exprCtx : ctx.relExpr()) {
                exprs.add(this.visitRelExpr(exprCtx));
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
        if (ctx.Or().size() == 1) {
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
    public DomsaScriptVariable visitJsonArr(DomsaScriptParser.JsonArrContext ctx) {
        // TODO
        return new DomsaScriptVariable(DomsaScriptType.Array, JsonParser.parseString(ctx.getText()));
    }

    @Override
    public DomsaScriptVariable visitJsonObj(DomsaScriptParser.JsonObjContext ctx) {
        // TODO
        return new DomsaScriptVariable(DomsaScriptType.Object, JsonParser.parseString(ctx.getText()));
    }

    @Override
    public String visitAssignId(DomsaScriptParser.AssignIdContext ctx) {
        // TODO
        return ctx.getText();
    }

    @Override
    public DomsaScriptVariable visitAssignValue(DomsaScriptParser.AssignValueContext ctx) {
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

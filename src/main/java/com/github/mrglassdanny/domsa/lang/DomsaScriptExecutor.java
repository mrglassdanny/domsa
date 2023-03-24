package com.github.mrglassdanny.domsa.lang;

import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptBaseListener;
import com.github.mrglassdanny.domsa.lang.antlrgen.DomsaScriptParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class DomsaScriptExecutor extends DomsaScriptBaseListener {

    public HashMap<String, Object> variables;

    public DomsaScriptExecutor() {
        this.variables = new HashMap<>();
    }

    @Override
    public void enterIdExpr(DomsaScriptParser.IdExprContext ctx) {
        super.enterIdExpr(ctx);
    }

    @Override
    public void exitIdExpr(DomsaScriptParser.IdExprContext ctx) {
        super.exitIdExpr(ctx);
    }

    @Override
    public void enterFnExpr(DomsaScriptParser.FnExprContext ctx) {
        super.enterFnExpr(ctx);
    }

    @Override
    public void exitFnExpr(DomsaScriptParser.FnExprContext ctx) {
        super.exitFnExpr(ctx);
    }

    @Override
    public void enterArithExpr(DomsaScriptParser.ArithExprContext ctx) {
        super.enterArithExpr(ctx);
    }

    @Override
    public void exitArithExpr(DomsaScriptParser.ArithExprContext ctx) {
        super.exitArithExpr(ctx);
    }

    @Override
    public void enterMulExpr(DomsaScriptParser.MulExprContext ctx) {
        super.enterMulExpr(ctx);
    }

    @Override
    public void exitMulExpr(DomsaScriptParser.MulExprContext ctx) {
        super.exitMulExpr(ctx);
    }

    @Override
    public void enterAddExpr(DomsaScriptParser.AddExprContext ctx) {
        super.enterAddExpr(ctx);
    }

    @Override
    public void exitAddExpr(DomsaScriptParser.AddExprContext ctx) {
        super.exitAddExpr(ctx);
    }

    @Override
    public void enterRelExpr(DomsaScriptParser.RelExprContext ctx) {
        super.enterRelExpr(ctx);
    }

    @Override
    public void exitRelExpr(DomsaScriptParser.RelExprContext ctx) {
        super.exitRelExpr(ctx);
    }

    @Override
    public void enterEqValue(DomsaScriptParser.EqValueContext ctx) {
        super.enterEqValue(ctx);
    }

    @Override
    public void exitEqValue(DomsaScriptParser.EqValueContext ctx) {
        super.exitEqValue(ctx);
    }

    @Override
    public void enterEqExpr(DomsaScriptParser.EqExprContext ctx) {
        super.enterEqExpr(ctx);
    }

    @Override
    public void exitEqExpr(DomsaScriptParser.EqExprContext ctx) {
        super.exitEqExpr(ctx);
    }

    @Override
    public void enterLogAndExpr(DomsaScriptParser.LogAndExprContext ctx) {
        super.enterLogAndExpr(ctx);
    }

    @Override
    public void exitLogAndExpr(DomsaScriptParser.LogAndExprContext ctx) {
        super.exitLogAndExpr(ctx);
    }

    @Override
    public void enterLogOrExpr(DomsaScriptParser.LogOrExprContext ctx) {
        super.enterLogOrExpr(ctx);
    }

    @Override
    public void exitLogOrExpr(DomsaScriptParser.LogOrExprContext ctx) {
        super.exitLogOrExpr(ctx);
    }

    @Override
    public void enterExpr(DomsaScriptParser.ExprContext ctx) {
        super.enterExpr(ctx);
    }

    @Override
    public void exitExpr(DomsaScriptParser.ExprContext ctx) {
        super.exitExpr(ctx);
    }

    @Override
    public void enterAssign(DomsaScriptParser.AssignContext ctx) {
        super.enterAssign(ctx);
    }

    @Override
    public void exitAssign(DomsaScriptParser.AssignContext ctx) {
        super.exitAssign(ctx);
    }

    @Override
    public void enterAssignOper(DomsaScriptParser.AssignOperContext ctx) {
        super.enterAssignOper(ctx);
    }

    @Override
    public void exitAssignOper(DomsaScriptParser.AssignOperContext ctx) {
        super.exitAssignOper(ctx);
    }

    @Override
    public void enterAssignValue(DomsaScriptParser.AssignValueContext ctx) {
        super.enterAssignValue(ctx);
    }

    @Override
    public void exitAssignValue(DomsaScriptParser.AssignValueContext ctx) {
        super.exitAssignValue(ctx);
    }

    @Override
    public void enterJsonObj(DomsaScriptParser.JsonObjContext ctx) {
        super.enterJsonObj(ctx);
    }

    @Override
    public void exitJsonObj(DomsaScriptParser.JsonObjContext ctx) {
        super.exitJsonObj(ctx);
    }

    @Override
    public void enterJsonPair(DomsaScriptParser.JsonPairContext ctx) {
        super.enterJsonPair(ctx);
    }

    @Override
    public void exitJsonPair(DomsaScriptParser.JsonPairContext ctx) {
        super.exitJsonPair(ctx);
    }

    @Override
    public void enterJsonArr(DomsaScriptParser.JsonArrContext ctx) {
        super.enterJsonArr(ctx);
    }

    @Override
    public void exitJsonArr(DomsaScriptParser.JsonArrContext ctx) {
        super.exitJsonArr(ctx);
    }

    @Override
    public void enterJsonValue(DomsaScriptParser.JsonValueContext ctx) {
        super.enterJsonValue(ctx);
    }

    @Override
    public void exitJsonValue(DomsaScriptParser.JsonValueContext ctx) {
        super.exitJsonValue(ctx);
    }

    @Override
    public void enterEos(DomsaScriptParser.EosContext ctx) {
        super.enterEos(ctx);
    }

    @Override
    public void exitEos(DomsaScriptParser.EosContext ctx) {
        super.exitEos(ctx);
    }

    @Override
    public void enterStmt(DomsaScriptParser.StmtContext ctx) {
        super.enterStmt(ctx);
    }

    @Override
    public void exitStmt(DomsaScriptParser.StmtContext ctx) {
        super.exitStmt(ctx);
    }

    @Override
    public void enterAssignStmt(DomsaScriptParser.AssignStmtContext ctx) {
        super.enterAssignStmt(ctx);
    }

    @Override
    public void exitAssignStmt(DomsaScriptParser.AssignStmtContext ctx) {
        super.exitAssignStmt(ctx);
    }

    @Override
    public void enterNestStmt(DomsaScriptParser.NestStmtContext ctx) {
        super.enterNestStmt(ctx);
    }

    @Override
    public void exitNestStmt(DomsaScriptParser.NestStmtContext ctx) {
        super.exitNestStmt(ctx);
    }

    @Override
    public void enterCondStmt(DomsaScriptParser.CondStmtContext ctx) {
        super.enterCondStmt(ctx);
    }

    @Override
    public void exitCondStmt(DomsaScriptParser.CondStmtContext ctx) {
        super.exitCondStmt(ctx);
    }

    @Override
    public void enterIterStmt(DomsaScriptParser.IterStmtContext ctx) {
        super.enterIterStmt(ctx);
    }

    @Override
    public void exitIterStmt(DomsaScriptParser.IterStmtContext ctx) {
        super.exitIterStmt(ctx);
    }

    @Override
    public void enterRetStmt(DomsaScriptParser.RetStmtContext ctx) {
        super.enterRetStmt(ctx);
    }

    @Override
    public void exitRetStmt(DomsaScriptParser.RetStmtContext ctx) {
        super.exitRetStmt(ctx);
    }

    @Override
    public void enterScript(DomsaScriptParser.ScriptContext ctx) {
        super.enterScript(ctx);
    }

    @Override
    public void exitScript(DomsaScriptParser.ScriptContext ctx) {
        super.exitScript(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}

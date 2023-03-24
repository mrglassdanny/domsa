// Generated from DomsaScript.g4 by ANTLR 4.8

package com.github.mrglassdanny.domsa.lang.antlrgen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DomsaScriptParser}.
 */
public interface DomsaScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(DomsaScriptParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#idExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(DomsaScriptParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#fnExpr}.
	 * @param ctx the parse tree
	 */
	void enterFnExpr(DomsaScriptParser.FnExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#fnExpr}.
	 * @param ctx the parse tree
	 */
	void exitFnExpr(DomsaScriptParser.FnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(DomsaScriptParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(DomsaScriptParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(DomsaScriptParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(DomsaScriptParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(DomsaScriptParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(DomsaScriptParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(DomsaScriptParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(DomsaScriptParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#eqValue}.
	 * @param ctx the parse tree
	 */
	void enterEqValue(DomsaScriptParser.EqValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#eqValue}.
	 * @param ctx the parse tree
	 */
	void exitEqValue(DomsaScriptParser.EqValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(DomsaScriptParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(DomsaScriptParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#logAndExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogAndExpr(DomsaScriptParser.LogAndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#logAndExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogAndExpr(DomsaScriptParser.LogAndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#logOrExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogOrExpr(DomsaScriptParser.LogOrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#logOrExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogOrExpr(DomsaScriptParser.LogOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DomsaScriptParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DomsaScriptParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DomsaScriptParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DomsaScriptParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#assignOper}.
	 * @param ctx the parse tree
	 */
	void enterAssignOper(DomsaScriptParser.AssignOperContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#assignOper}.
	 * @param ctx the parse tree
	 */
	void exitAssignOper(DomsaScriptParser.AssignOperContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#assignValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignValue(DomsaScriptParser.AssignValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#assignValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignValue(DomsaScriptParser.AssignValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#jsonObj}.
	 * @param ctx the parse tree
	 */
	void enterJsonObj(DomsaScriptParser.JsonObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#jsonObj}.
	 * @param ctx the parse tree
	 */
	void exitJsonObj(DomsaScriptParser.JsonObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#jsonPair}.
	 * @param ctx the parse tree
	 */
	void enterJsonPair(DomsaScriptParser.JsonPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#jsonPair}.
	 * @param ctx the parse tree
	 */
	void exitJsonPair(DomsaScriptParser.JsonPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#jsonArr}.
	 * @param ctx the parse tree
	 */
	void enterJsonArr(DomsaScriptParser.JsonArrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#jsonArr}.
	 * @param ctx the parse tree
	 */
	void exitJsonArr(DomsaScriptParser.JsonArrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonValue(DomsaScriptParser.JsonValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonValue(DomsaScriptParser.JsonValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(DomsaScriptParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(DomsaScriptParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(DomsaScriptParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(DomsaScriptParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(DomsaScriptParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(DomsaScriptParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#nestStmt}.
	 * @param ctx the parse tree
	 */
	void enterNestStmt(DomsaScriptParser.NestStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#nestStmt}.
	 * @param ctx the parse tree
	 */
	void exitNestStmt(DomsaScriptParser.NestStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#condStmt}.
	 * @param ctx the parse tree
	 */
	void enterCondStmt(DomsaScriptParser.CondStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#condStmt}.
	 * @param ctx the parse tree
	 */
	void exitCondStmt(DomsaScriptParser.CondStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void enterIterStmt(DomsaScriptParser.IterStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#iterStmt}.
	 * @param ctx the parse tree
	 */
	void exitIterStmt(DomsaScriptParser.IterStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void enterRetStmt(DomsaScriptParser.RetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#retStmt}.
	 * @param ctx the parse tree
	 */
	void exitRetStmt(DomsaScriptParser.RetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DomsaScriptParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaScriptParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DomsaScriptParser.ScriptContext ctx);
}
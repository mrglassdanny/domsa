// Generated from DomsaScript.g4 by ANTLR 4.8

package com.github.mrglassdanny.domsa.lang.antlrgen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DomsaScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DomsaScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#idExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(DomsaScriptParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#fnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFnExpr(DomsaScriptParser.FnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExpr(DomsaScriptParser.BaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(DomsaScriptParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(DomsaScriptParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(DomsaScriptParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#logAndExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogAndExpr(DomsaScriptParser.LogAndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#logOrExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogOrExpr(DomsaScriptParser.LogOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DomsaScriptParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(DomsaScriptParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#jsonPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPair(DomsaScriptParser.JsonPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#jsonArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArr(DomsaScriptParser.JsonArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#jsonObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObj(DomsaScriptParser.JsonObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#assignId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignId(DomsaScriptParser.AssignIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(DomsaScriptParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(DomsaScriptParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(DomsaScriptParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(DomsaScriptParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#condStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondStmt(DomsaScriptParser.CondStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#iterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterStmt(DomsaScriptParser.IterStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#nestStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestStmt(DomsaScriptParser.NestStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DomsaScriptParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(DomsaScriptParser.ScriptContext ctx);
}
// Generated from Domsa.g4 by ANTLR 4.8

package com.github.mrglassdanny.domsa.lang.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DomsaParser}.
 */
public interface DomsaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DomsaParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DomsaParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DomsaParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DomsaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DomsaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DomsaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DomsaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(DomsaParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(DomsaParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DomsaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DomsaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DomsaParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(DomsaParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DomsaParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(DomsaParser.EndContext ctx);
}
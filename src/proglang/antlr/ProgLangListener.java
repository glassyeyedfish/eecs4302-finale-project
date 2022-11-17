// Generated from ProgLang.g4 by ANTLR 4.9.3

	package proglang.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgLangParser}.
 */
public interface ProgLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ProgLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProgLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ProgLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProgLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ProgLangParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ProgLangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ProgLangParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ProgLangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeDecl}
	 * labeled alternative in {@link ProgLangParser#attr_decl}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDecl(ProgLangParser.AttributeDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeDecl}
	 * labeled alternative in {@link ProgLangParser#attr_decl}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDecl(ProgLangParser.AttributeDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeAsgmt}
	 * labeled alternative in {@link ProgLangParser#attr_asgmt}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAsgmt(ProgLangParser.AttributeAsgmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeAsgmt}
	 * labeled alternative in {@link ProgLangParser#attr_asgmt}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAsgmt(ProgLangParser.AttributeAsgmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ProgLangParser#prnt}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ProgLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ProgLangParser#prnt}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ProgLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ProgLangParser#if_block}.
	 * @param ctx the parse tree
	 */
	void enterConditional(ProgLangParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ProgLangParser#if_block}.
	 * @param ctx the parse tree
	 */
	void exitConditional(ProgLangParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(ProgLangParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(ProgLangParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(ProgLangParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(ProgLangParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanOrEqualTo(ProgLangParser.LessThanOrEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanOrEqualTo(ProgLangParser.LessThanOrEqualToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ProgLangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ProgLangParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(ProgLangParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(ProgLangParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualTo(ProgLangParser.NotEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualTo(ProgLangParser.NotEqualToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanOrEqualTo(ProgLangParser.GreaterThanOrEqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanOrEqualTo(ProgLangParser.GreaterThanOrEqualToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualTo(ProgLangParser.EqualToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualTo(ProgLangParser.EqualToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInteger(ProgLangParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInteger(ProgLangParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(ProgLangParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(ProgLangParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(ProgLangParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(ProgLangParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(ProgLangParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(ProgLangParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(ProgLangParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(ProgLangParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ProgLangParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ProgLangParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ProgLangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ProgLangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ProgLangParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ProgLangParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(ProgLangParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(ProgLangParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgLangParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ProgLangParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgLangParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ProgLangParser.ArgsContext ctx);
}
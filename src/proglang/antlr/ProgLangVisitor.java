// Generated from ProgLang.g4 by ANTLR 4.9.3

	package proglang.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link ProgLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProgLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ProgLangParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ProgLangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeDecl}
	 * labeled alternative in {@link ProgLangParser#attr_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDecl(ProgLangParser.AttributeDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeAsgmt}
	 * labeled alternative in {@link ProgLangParser#attr_asgmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeAsgmt(ProgLangParser.AttributeAsgmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print}
	 * labeled alternative in {@link ProgLangParser#prnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ProgLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Conditional}
	 * labeled alternative in {@link ProgLangParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(ProgLangParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(ProgLangParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(ProgLangParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqualTo(ProgLangParser.LessThanOrEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ProgLangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ProgLangParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualTo(ProgLangParser.NotEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOrEqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqualTo(ProgLangParser.GreaterThanOrEqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualTo}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualTo(ProgLangParser.EqualToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(ProgLangParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ProgLangParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(ProgLangParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(ProgLangParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(ProgLangParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ProgLangParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ProgLangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(ProgLangParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link ProgLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(ProgLangParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgLangParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(ProgLangParser.ArgsContext ctx);
}
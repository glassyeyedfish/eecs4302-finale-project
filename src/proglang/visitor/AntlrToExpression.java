package proglang.visitor;

import java.util.List;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.AdditionContext;
import proglang.antlr.ProgLangParser.AndContext;
import proglang.antlr.ProgLangParser.BooleanContext;
import proglang.antlr.ProgLangParser.EqualToContext;
import proglang.antlr.ProgLangParser.GreaterThanContext;
import proglang.antlr.ProgLangParser.GreaterThanOrEqualToContext;
import proglang.antlr.ProgLangParser.IntegerContext;
import proglang.antlr.ProgLangParser.LessThanContext;
import proglang.antlr.ProgLangParser.LessThanOrEqualToContext;
import proglang.antlr.ProgLangParser.MultiplicationContext;
import proglang.antlr.ProgLangParser.NotContext;
import proglang.antlr.ProgLangParser.NotEqualToContext;
import proglang.antlr.ProgLangParser.OrContext;
import proglang.antlr.ProgLangParser.ParenthesesContext;
import proglang.antlr.ProgLangParser.SubtractionContext;
import proglang.antlr.ProgLangParser.VariableContext;
import proglang.model.PLFunction;
import proglang.model.expressions.PLAddition;
import proglang.model.expressions.PLAnd;
import proglang.model.expressions.PLArithmeticBrackets;
import proglang.model.expressions.PLArithmeticExpression;
import proglang.model.expressions.PLBooleanBrackets;
import proglang.model.expressions.PLBooleanExpression;
import proglang.model.expressions.PLBooleanLiteral;
import proglang.model.expressions.PLBooleanVariable;
import proglang.model.expressions.PLEqualTo;
import proglang.model.expressions.PLExpression;
import proglang.model.expressions.PLGreaterThan;
import proglang.model.expressions.PLGreaterThanOrEqualTo;
import proglang.model.expressions.PLIntegerLiteral;
import proglang.model.expressions.PLIntegerVariable;
import proglang.model.expressions.PLLessThan;
import proglang.model.expressions.PLLessThanOrEqualTo;
import proglang.model.expressions.PLMultiplication;
import proglang.model.expressions.PLNot;
import proglang.model.expressions.PLNotEqualTo;
import proglang.model.expressions.PLOr;
import proglang.model.expressions.PLSubtraction;

public class AntlrToExpression extends ProgLangBaseVisitor<PLExpression<?>>{
	
	private List<String> semanticErrors;
	private PLFunction parentFunc;
	
	public AntlrToExpression(List<String> semanticErrors, PLFunction function) {
		this.semanticErrors = semanticErrors;
		this.parentFunc = function;
	}

	@Override
	public PLExpression<?> visitMultiplication(MultiplicationContext ctx) {
		return new PLMultiplication((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitAddition(AdditionContext ctx) {
		return new PLAddition((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitLessThanOrEqualTo(LessThanOrEqualToContext ctx) {
		return new PLLessThanOrEqualTo((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitVariable(VariableContext ctx) {
		if (parentFunc.getVariables().containsKey(ctx.ID().getText())) {
			if (parentFunc.getVariables().get(ctx.ID().getText()).getType().equals("INT")) {
				return new PLIntegerVariable(ctx.ID().getText());
			}
			else if (parentFunc.getVariables().get(ctx.ID().getText()).getType().equals("BOOL")) {
				return new PLBooleanVariable(ctx.ID().getText());
			}
		}
		else {
			semanticErrors.add("Error: variable '" + ctx.ID().getText() + "' not declared (line: " + ctx.getStart().getLine() + ").");
		}
		return null;
	}

	@Override
	public PLExpression<?> visitOr(OrContext ctx) {
		return new PLOr((PLBooleanExpression) visit(ctx.expr(0)), (PLBooleanExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitNotEqualTo(NotEqualToContext ctx) {
		return new PLNotEqualTo((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitGreaterThanOrEqualTo(GreaterThanOrEqualToContext ctx) {
		return new PLGreaterThanOrEqualTo((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitEqualTo(EqualToContext ctx) {
		return new PLEqualTo((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitInteger(IntegerContext ctx) {
		return new PLIntegerLiteral(Integer.parseInt(ctx.INT().getText()));
	}

	@Override
	public PLExpression<?> visitNot(NotContext ctx) {
		return new PLNot((PLBooleanExpression) visit(ctx.expr()));
	}

	@Override
	public PLExpression<?> visitLessThan(LessThanContext ctx) {
		return new PLLessThan((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitSubtraction(SubtractionContext ctx) {
		return new PLSubtraction((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}	

	@Override
	public PLExpression<?> visitGreaterThan(GreaterThanContext ctx) {
		return new PLGreaterThan((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitAnd(AndContext ctx) {
		return new PLAnd((PLBooleanExpression) visit(ctx.expr(0)), (PLBooleanExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitBoolean(BooleanContext ctx) {
		return new PLBooleanLiteral(ctx.BOOL().getText().equals("TRUE"));
	}

	@Override
	public PLExpression<?> visitParentheses(ParenthesesContext ctx) {
		PLExpression<?> expr = this.visit(ctx.expr());
		if (expr instanceof PLArithmeticExpression) {
			return new PLArithmeticBrackets((PLArithmeticExpression) expr);
		}
		else if (expr instanceof PLBooleanExpression) {
			return new PLBooleanBrackets((PLBooleanExpression) expr);
		}
		return null;
	}

}

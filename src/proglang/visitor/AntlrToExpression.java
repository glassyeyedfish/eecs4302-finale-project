package proglang.visitor;

import java.util.List;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.AdditionContext;
import proglang.antlr.ProgLangParser.AndContext;
import proglang.antlr.ProgLangParser.BooleanContext;
import proglang.antlr.ProgLangParser.EqualToContext;
import proglang.antlr.ProgLangParser.FunctionCallInExpressionContext;
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
import proglang.model.PLBooleanFunction;
import proglang.model.PLFunction;
import proglang.model.PLIntegerFunction;
import proglang.model.PLProgram;
import proglang.model.expressions.PLAddition;
import proglang.model.expressions.PLAnd;
import proglang.model.expressions.PLArithmeticBrackets;
import proglang.model.expressions.PLArithmeticExpression;
import proglang.model.expressions.PLBooleanBrackets;
import proglang.model.expressions.PLBooleanExpression;
import proglang.model.expressions.PLBooleanFunctionCall;
import proglang.model.expressions.PLBooleanLiteral;
import proglang.model.expressions.PLBooleanVariable;
import proglang.model.expressions.PLEqualTo;
import proglang.model.expressions.PLExpression;
import proglang.model.expressions.PLGreaterThan;
import proglang.model.expressions.PLGreaterThanOrEqualTo;
import proglang.model.expressions.PLIntegerFunctionCall;
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
	private PLFunction<?> parentFunc;
	private PLProgram parentProg;
	
	public AntlrToExpression(List<String> semanticErrors, PLFunction<?> function, PLProgram parentProg) {
		this.semanticErrors = semanticErrors;
		this.parentFunc = function;
		this.parentProg = parentProg;
	}

	@Override
	public PLExpression<?> visitMultiplication(MultiplicationContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '*' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLMultiplication((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitAddition(AdditionContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '+' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLAddition((PLArithmeticExpression) left, (PLArithmeticExpression) right);
	}

	@Override
	public PLExpression<?> visitLessThanOrEqualTo(LessThanOrEqualToContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '<=' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
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
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLBooleanExpression) || !(right instanceof PLBooleanExpression)) {
			this.semanticErrors.add("Error: type mismatch at '||' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLOr((PLBooleanExpression) visit(ctx.expr(0)), (PLBooleanExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitNotEqualTo(NotEqualToContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '!=' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLNotEqualTo((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitGreaterThanOrEqualTo(GreaterThanOrEqualToContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '>=' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLGreaterThanOrEqualTo((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitEqualTo(EqualToContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '==' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLEqualTo((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitInteger(IntegerContext ctx) {
		return new PLIntegerLiteral(Integer.parseInt(ctx.INT().getText()));
	}

	@Override
	public PLExpression<?> visitNot(NotContext ctx) {
		PLExpression<?> left = visit(ctx.expr());
		if (left == null) {
			return null;
		}
		else if (!(left instanceof PLBooleanExpression)) {
			this.semanticErrors.add("Error: type mismatch at '!' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLNot((PLBooleanExpression) visit(ctx.expr()));
	}

	@Override
	public PLExpression<?> visitLessThan(LessThanContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '<' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLLessThan((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitSubtraction(SubtractionContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '-' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLSubtraction((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}	

	@Override
	public PLExpression<?> visitGreaterThan(GreaterThanContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLArithmeticExpression) || !(right instanceof PLArithmeticExpression)) {
			this.semanticErrors.add("Error: type mismatch at '>' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
		return new PLGreaterThan((PLArithmeticExpression) visit(ctx.expr(0)), (PLArithmeticExpression) visit(ctx.expr(1)));
	}

	@Override
	public PLExpression<?> visitAnd(AndContext ctx) {
		PLExpression<?> left = visit(ctx.expr(0));
		PLExpression<?> right = visit(ctx.expr(1));
		if (left == null || right == null) {
			return null;
		}
		else if (!(left instanceof PLBooleanExpression) || !(right instanceof PLBooleanExpression)) {
			this.semanticErrors.add("Error: type mismatch at '&&' expression (line: " + ctx.getStart().getLine() + ").");
			return null;
		}
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

	@Override
	public PLExpression<?> visitFunctionCallInExpression(FunctionCallInExpressionContext ctx) {
		PLFunction<?> func = parentProg.getFunctions().get(ctx.ID().getText());
		
		if (func instanceof PLIntegerFunction) {
			PLIntegerFunctionCall funcCall = new PLIntegerFunctionCall(ctx.ID().getText());
			
			if (ctx.expr().size() == func.getParameters().size()) {
				for (int i = 0; i < ctx.expr().size(); i++) {
					PLExpression<?> expr = visit(ctx.expr(i));
					if (expr instanceof PLArithmeticExpression && func.getParameters().values().toArray()[i].equals("INT")) {
						funcCall.addArgument(expr);
					}
					else if (expr instanceof PLBooleanExpression && func.getParameters().values().toArray()[i].equals("BOOL")) {
						funcCall.addArgument(expr);
					}
					else {
						semanticErrors.add("Error: type mismatch at '" + func.getName() + "' function call (line " + ctx.start.getLine() + ").");
						break;
					}
				}
			}
			else {
				if (ctx.expr().size() < func.getParameters().size())
					semanticErrors.add("Error: insufficient arguments at '" + func.getName() + "' function call (line " + ctx.start.getLine() + ").");
				else
					semanticErrors.add("Error: too many arguments at '" + func.getName() + "' function call (line " + ctx.start.getLine() + ").");
			}
			
			return funcCall;
		}
		else if (func instanceof PLBooleanFunction) {
			PLBooleanFunctionCall funcCall = new PLBooleanFunctionCall(ctx.ID().getText());
			
			if (ctx.expr().size() == func.getParameters().size()) {
				for (int i = 0; i < ctx.expr().size(); i++) {
					PLExpression<?> expr = visit(ctx.expr(i));
					if (expr instanceof PLArithmeticExpression && func.getParameters().values().toArray()[i].equals("INT")) {
						funcCall.addArgument(expr);
					}
					else if (expr instanceof PLBooleanExpression && func.getParameters().values().toArray()[i].equals("BOOL")) {
						funcCall.addArgument(expr);
					}
					else {
						semanticErrors.add("Error: type mismatch at '" + func.getName() + "' function call (line " + ctx.start.getLine() + ").");
						break;
					}
				}
			}
			else {
				if (ctx.expr().size() < func.getParameters().size())
					semanticErrors.add("Error: insufficient arguments at '" + func.getName() + "' function call (line " + ctx.start.getLine() + ").");
				else
					semanticErrors.add("Error: too many arguments at '" + func.getName() + "' function call (line " + ctx.start.getLine() + ").");
			}
			
			return funcCall;
		}
		else {
			semanticErrors.add("Error: type mismatch at function call (line " + ctx.start.getLine() + ")");
			return null;
		}
	}

}

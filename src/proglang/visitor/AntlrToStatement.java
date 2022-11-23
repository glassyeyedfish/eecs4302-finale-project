package proglang.visitor;

import java.util.List;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.AttributeAsgmtContext;
import proglang.antlr.ProgLangParser.AttributeDeclContext;
import proglang.antlr.ProgLangParser.ConditionalContext;
import proglang.antlr.ProgLangParser.FunctionCallContext;
import proglang.antlr.ProgLangParser.PrintContext;
import proglang.model.PLFunctionCall;
import proglang.model.PLAssignment;
import proglang.model.PLConditional;
import proglang.model.PLDeclaration;
import proglang.model.PLFunction;
import proglang.model.PLPrint;
import proglang.model.PLProgram;
import proglang.model.PLStatement;
import proglang.model.expressions.PLArithmeticExpression;
import proglang.model.expressions.PLBooleanExpression;
import proglang.model.expressions.PLExpression;

public class AntlrToStatement extends ProgLangBaseVisitor<PLStatement> {

	private List<String> semanticErrors;
	private PLFunction<?> parentFunc;
	private AntlrToExpression antlrToExpression;
	private PLProgram parentProg;

	public AntlrToStatement(List<String> semanticErrors, PLFunction<?> parentFunc, PLProgram parentProg) {
		this.semanticErrors = semanticErrors;
		antlrToExpression = new AntlrToExpression(semanticErrors, parentFunc, parentProg);
		this.parentFunc = parentFunc;
		this.parentProg = parentProg;
	}

	@Override
	public PLStatement visitAttributeDecl(AttributeDeclContext ctx) {
		if (parentFunc.getVariables().containsKey(ctx.ID().getText())) {
			semanticErrors.add("Error: variable '" + ctx.ID().getText() + "' already declared (line: " + ctx.getStart().getLine() + ").");
		}
		return new PLDeclaration(ctx.ID().getText(), ctx.TYPE().getText(), ctx.getStart().getLine());
	}

	@Override
	public PLStatement visitAttributeAsgmt(AttributeAsgmtContext ctx) {
		if (parentFunc.getVariables().containsKey(ctx.ID().getText())) {
			if (parentFunc.getVariables().get(ctx.ID().getText()).getType().equals("INT")) {
				return new PLAssignment<Integer>(ctx.ID().getText(), (PLArithmeticExpression) antlrToExpression.visit(ctx.expr()), ctx.getStart().getLine());
			}
			else if (parentFunc.getVariables().get(ctx.ID().getText()).getType().equals("BOOL")) {
				return new PLAssignment<Boolean>(ctx.ID().getText(), (PLBooleanExpression) antlrToExpression.visit(ctx.expr()), ctx.getStart().getLine());
			}
		}
		else {
			semanticErrors.add("Error: variable '" + ctx.ID().getText() + "' not declared (line: " + ctx.getStart().getLine() + ").");
		}
		return null;
	}

	@Override
	public PLStatement visitPrint(PrintContext ctx) {
		PLExpression<?> expr = antlrToExpression.visit(ctx.expr());
		if (expr instanceof PLArithmeticExpression) {
			return new PLPrint<Integer>((PLArithmeticExpression) antlrToExpression.visit(ctx.expr()), ctx.getStart().getLine());
		}
		else {
			return new PLPrint<Boolean>((PLBooleanExpression) antlrToExpression.visit(ctx.expr()), ctx.getStart().getLine());
		}
	}

	@Override
	public PLStatement visitConditional(ConditionalContext ctx) {
		PLExpression<?> expression = antlrToExpression.visit(ctx.expr());
		
		if (expression instanceof PLBooleanExpression) {
			PLConditional conditional = new PLConditional((PLBooleanExpression) antlrToExpression.visit(ctx.expr()), ctx.getStart().getLine(), ctx.getStop().getLine());
			
			for (int i = 0; i < ctx.getChildCount(); i++) {
				PLStatement stmt = visit(ctx.getChild(i));
				if (stmt instanceof PLStatement) {
					conditional.addStatement(stmt);
				}
			}
			
			return conditional;
		}
		else {
			semanticErrors.add("Error: type mismatch at conditional (line " + ctx.start.getLine() + ").");
			return null;
		}
	}

	@Override
	public PLStatement visitFunctionCall(FunctionCallContext ctx) {
		PLFunctionCall funcCall = new PLFunctionCall(ctx.ID().getText(), ctx.start.getLine());
		PLFunction<?> func = parentProg.getFunctions().get(ctx.ID().getText());
		
		if (ctx.expr().size() == func.getParameters().size()) {
			for (int i = 0; i < ctx.expr().size(); i++) {
				PLExpression<?> expr = antlrToExpression.visit(ctx.expr(i));
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
	
	
}

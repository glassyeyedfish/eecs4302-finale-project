package proglang.visitor;

import java.util.List;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.AttributeAsgmtContext;
import proglang.antlr.ProgLangParser.AttributeDeclContext;
import proglang.antlr.ProgLangParser.ConditionalContext;
import proglang.antlr.ProgLangParser.PrintContext;
import proglang.model.PLAssignment;
import proglang.model.PLConditional;
import proglang.model.PLDeclaration;
import proglang.model.PLFunction;
import proglang.model.PLPrint;
import proglang.model.PLStatement;
import proglang.model.expressions.PLArithmeticExpression;
import proglang.model.expressions.PLBooleanExpression;
import proglang.model.expressions.PLExpression;

public class AntlrToStatement extends ProgLangBaseVisitor<PLStatement> {

	private List<String> semanticErrors;
	private PLFunction parentFunc;
	private AntlrToExpression antlrToExpression;

	public AntlrToStatement(List<String> semanticErrors, PLFunction parentFunc) {
		this.semanticErrors = semanticErrors;
		antlrToExpression = new AntlrToExpression(semanticErrors, parentFunc);
		this.parentFunc = parentFunc;
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
		PLConditional conditional = new PLConditional((PLBooleanExpression) antlrToExpression.visit(ctx.expr()), ctx.getStart().getLine(), ctx.getStop().getLine());
		
		//to do
		return conditional;
	}
	
	
}

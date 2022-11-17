package proglang.visitor;

import java.util.List;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.FunctionContext;
import proglang.model.PLDeclaration;
import proglang.model.PLFunction;
import proglang.model.PLStatement;

public class AntlrToFunction extends ProgLangBaseVisitor<PLFunction> {

	private List<String> semanticErrors;
	private AntlrToStatement antlrToStatement;
	
	public AntlrToFunction(List<String> semanticErrors) {
		this.semanticErrors = semanticErrors;
	}

	@Override
	public PLFunction visitFunction(FunctionContext ctx) {
		PLFunction func = new PLFunction(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine());
		
		antlrToStatement = new AntlrToStatement(semanticErrors, func);
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLStatement stmt = antlrToStatement.visit(ctx.getChild(i));
			if (stmt instanceof PLDeclaration) {
				func.addDeclaration(((PLDeclaration) stmt));
			}
			else {
				func.addStatement(stmt);
			}
		}
		
		/*
		for (Attr_declContext decl: ctx.attr_decl()) {
			func.addDeclaration((PLDeclaration) antlrToStatement.visit(decl));
		}
		 */
		
		return func;
	}
}

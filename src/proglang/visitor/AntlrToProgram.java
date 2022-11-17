package proglang.visitor;

import java.util.ArrayList;
import java.util.List;

import proglang.antlr.ProgLangBaseVisitor;
import proglang.antlr.ProgLangParser.ProgramContext;
import proglang.model.PLFunction;
import proglang.model.PLProgram;

public class AntlrToProgram extends ProgLangBaseVisitor<PLProgram> {

	private List<String> semanticErrors;
	private AntlrToFunction antlrToFunction;
	
	public AntlrToProgram() {
		semanticErrors = new ArrayList<>();
		antlrToFunction = new AntlrToFunction(semanticErrors);
	}
	
	@Override
	public PLProgram visitProgram(ProgramContext ctx) {
		PLProgram p = new PLProgram(ctx.ID().getText(), ctx.getStart().getLine(), ctx.getStop().getLine());
		
		for (int i = 0; i < ctx.getChildCount(); i++) {
			PLFunction func = antlrToFunction.visit(ctx.getChild(i));
			if (func != null) {
				if (p.getFunctions().keySet().contains(func.getName())) {
					semanticErrors.add("Error: function " + func.getName() + "already declared (line: " + func.getStartLineNum() + ").");
				}
				else {
					p.addFunction(func);
				}
			}
		}
		
		if (!p.getFunctions().keySet().contains("main")) {
			semanticErrors.add("Error: program is missing main().");
		}
		
		return p;
	}

	public List<String> getSemanticErrors() {
		return semanticErrors;
	}
	
}

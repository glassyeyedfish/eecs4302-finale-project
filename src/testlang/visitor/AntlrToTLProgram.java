package testlang.visitor;

import java.util.ArrayList;
import java.util.List;

import testlang.antlr.TestLangBaseVisitor;
import testlang.antlr.TestLangParser.TLProgramContext;
import testlang.antlr.TestLangParser.TLTestFuncContext;
import testlang.antlr.TestLangParser.Test_funcContext;
import testlang.model.TLProgram;
import testlang.model.TLTestFunc;

public class AntlrToTLProgram extends TestLangBaseVisitor<TLProgram> {
	
	private AntlrToTLTestFunc tfVisitor;
	
	public AntlrToTLProgram() {
		tfVisitor = new AntlrToTLTestFunc();
	}
	
	@Override
	public TLProgram visitTLProgram(TLProgramContext ctx) {
		
		// Data needed
		String name = ctx.ID().getText();
		List<TLTestFunc> testFunctions = new ArrayList<>();
		int startLineNum = ctx.getStart().getLine();
		
		// Scraping the tree for functions
		tfVisitor = new AntlrToTLTestFunc();
		
		for (Test_funcContext func: ctx.test_func()) {
			testFunctions.add(tfVisitor.visit((TLTestFuncContext) func));
		}
		
		int endLineNum = ctx.getStop().getLine();
		
		// Build the thing and shoot it off
		return new TLProgram(name, testFunctions, startLineNum, endLineNum);
	}

}

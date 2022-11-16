package testlang.antlrto;

import java.util.ArrayList;
import java.util.List;

import testantlr.TestLangBaseVisitor;
import testantlr.TestLangParser.TLProgramContext;
import testantlr.TestLangParser.TLTestFuncContext;
import testantlr.TestLangParser.Test_funcContext;
import testlang.TLProgram;
import testlang.TLTestFunc;

public class AntlrToTLProgram extends TestLangBaseVisitor<TLProgram> {
	
	private AntlrToTLTestFunc tfVisitor;
	
	@Override
	public TLProgram visitTLProgram(TLProgramContext ctx) {
		
		// Data needed
		String name = ctx.ID().getText();
		List<TLTestFunc> testFunctions = new ArrayList<>();
		int startLineNum = 1;
		int endLineNum = 0;
		
		// Scraping the tree for functions
		tfVisitor = new AntlrToTLTestFunc();
		
		for (Test_funcContext func: ctx.test_func()) {
			testFunctions.add(tfVisitor.visitTLTestFunc((TLTestFuncContext) func));
		}
		
		// Build the thing and shoot it off
		TLProgram prog = new TLProgram(name, testFunctions, startLineNum, endLineNum);
		return prog;
	}

}

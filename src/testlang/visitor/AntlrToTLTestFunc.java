package testlang.visitor;

import java.util.ArrayList;
import java.util.List;

import testlang.antlr.TestLangBaseVisitor;
import testlang.antlr.TestLangParser.Func_callContext;
import testlang.antlr.TestLangParser.TLFunctionCallContext;
import testlang.antlr.TestLangParser.TLTestFuncContext;
import testlang.model.TLFunctionCall;
import testlang.model.TLTestFunc;

public class AntlrToTLTestFunc extends TestLangBaseVisitor<TLTestFunc> {
	
	private AntlrToTLStatement sVisitor;
	
	public AntlrToTLTestFunc() {
		sVisitor = new AntlrToTLStatement();
	}
	
	@Override
	public TLTestFunc visitTLTestFunc(TLTestFuncContext ctx) {
		String name = ctx.ID().getText();
		List<TLFunctionCall> functionCalls = new ArrayList<>();
		int startLineNum = 0;
		int endLineNum = 0;
		
		for (Func_callContext call: ctx.func_call()) {
			functionCalls.add((TLFunctionCall) sVisitor.visit((TLFunctionCallContext) call));
		}
		
		return new TLTestFunc(name, functionCalls, startLineNum, endLineNum);
	}

}

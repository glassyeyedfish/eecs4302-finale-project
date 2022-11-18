package testlang.visitor;

import java.util.ArrayList;
import java.util.List;

import testlang.antlr.TestLangBaseVisitor;
import testlang.antlr.TestLangParser.AssrtContext;
import testlang.antlr.TestLangParser.Func_callContext;
import testlang.antlr.TestLangParser.TLFunctionCallContext;
import testlang.antlr.TestLangParser.TLTestFuncContext;
import testlang.model.TLAssertEquals;
import testlang.model.TLAssertion;
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
		List<TLAssertion> assertions = new ArrayList<>();
		
		int startLineNum = 0;
		int endLineNum = 0;
		
		for (Func_callContext call: ctx.func_call()) {
			functionCalls.add((TLFunctionCall) sVisitor.visit((TLFunctionCallContext) call));
		}
		
		for (AssrtContext assrt : ctx.assrt()) {
			assertions.add((TLAssertion) sVisitor.visit(assrt));
		}
		
		return new TLTestFunc(name, functionCalls, assertions, startLineNum, endLineNum);
	}

}

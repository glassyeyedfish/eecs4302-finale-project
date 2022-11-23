package testlang.model;

import testlang.model.expressions.TLBoolean;

public class TLAssert extends TLAssertion {

	public TLAssert(TLFunctionCall left, int lineNum) {
		super(left, TLBoolean.TRUE, lineNum);
	}
	
}

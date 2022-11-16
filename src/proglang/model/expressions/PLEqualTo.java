package proglang.model.expressions;

public class PLEqualTo extends PLRelationalOperation {
	public PLEqualTo(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}
	
	@Override
	public Boolean evaluate() {
		return getLeft().evaluate() == getRight().evaluate();
	}	
}

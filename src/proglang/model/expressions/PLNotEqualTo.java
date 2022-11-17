package proglang.model.expressions;

public class PLNotEqualTo extends PLRelationalOperation {
	public PLNotEqualTo(PLArithmeticExpression left, PLArithmeticExpression right) {
		super(left, right);
	}
	
	@Override
	public Boolean evaluate() {
		return getLeft().evaluate() != getRight().evaluate();
	}	
}

package proglang.model.expressions;

public class PLAnd extends PLBooleanOperation {
	public PLAnd(PLBooleanExpression left, PLBooleanExpression right) {
		super(left, right);
	}	
	
	@Override
	public Boolean evaluate() {
		return getLeft().evaluate() && getRight().evaluate();
	}
}

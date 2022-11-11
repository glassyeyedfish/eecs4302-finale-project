package proglang.expressions;

public class PLNot extends PLBooleanExpression {
	private PLBooleanExpression expression;
	
	public PLNot(PLBooleanExpression expression) {
		this.expression = expression;
	}

	public PLBooleanExpression getExpression() {
		return expression;
	}

	@Override
	public Boolean evaluate() {
		return !(expression.evaluate());
	}
}

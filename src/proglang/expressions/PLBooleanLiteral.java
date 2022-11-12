package proglang.expressions;

public class PLBooleanLiteral extends PLBooleanExpression {
	private boolean bool;

	public PLBooleanLiteral(boolean bool) {
		this.bool = bool;
	}

	public boolean getBool() {
		return bool;
	}

	@Override
	public Boolean evaluate() {
		return bool;
	}

	@Override
	public boolean hasVariable(String id) {
		return false;
	}
}

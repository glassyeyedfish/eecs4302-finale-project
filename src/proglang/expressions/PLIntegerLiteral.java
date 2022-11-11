package proglang.expressions;

public class PLIntegerLiteral extends PLArithmeticExpression {
	private int num;

	public PLIntegerLiteral(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	@Override
	public Integer evaluate() {
		return num;
	}
}

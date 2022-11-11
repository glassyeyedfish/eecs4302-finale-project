package proglang;

import proglang.expressions.PLExpression;

public class PLAssignment<T> extends PLStatement {
	private String id;
	private PLExpression<T> expression;
	
	public PLAssignment(String id, PLExpression<T> expression, int lineNum) {
		super(lineNum);
		this.id = id;
		this.expression = expression;
	}

	public String getId() {
		return id;
	}

	public PLExpression<T> getExpression() {
		return expression;
	}
	
	public T evaluate() {
		return expression.evaluate();
	}
}

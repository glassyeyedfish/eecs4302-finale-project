package proglang.model;

import proglang.model.expressions.PLExpression;

public class PLReturn<T> extends PLStatement {
	
	private PLExpression<T> expr;
	
	public PLReturn(PLExpression<T> expr, int lineNum) {
		super(lineNum);
		this.expr = expr;
	}
	
	public T evaluate() {
		return expr.evaluate();
	}

	@Override
	public boolean hasVariable(String key) {
		return expr.hasVariable(key);
	}

	public PLExpression<T> getExpr() {
		return expr;
	}

	public void setExpr(PLExpression<T> expr) {
		this.expr = expr;
	}
}

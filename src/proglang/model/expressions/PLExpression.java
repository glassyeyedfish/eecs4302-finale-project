package proglang.model.expressions;

public abstract class PLExpression<T> {
	public abstract T evaluate();

	public abstract boolean hasVariable(String key);
}

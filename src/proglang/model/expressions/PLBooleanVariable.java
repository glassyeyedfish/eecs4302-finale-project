package proglang.model.expressions;

import proglang.model.Store;

public class PLBooleanVariable extends PLBooleanExpression {
	private String id;
	
	public PLBooleanVariable(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}

	@Override
	public Boolean evaluate() {
		return Store.getInstance().getBoolVariable(id);
	}
}

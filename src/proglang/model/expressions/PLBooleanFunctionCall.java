package proglang.model.expressions;

import java.util.ArrayList;
import java.util.List;

public class PLBooleanFunctionCall extends PLBooleanExpression {

	private String id;
	private List<PLExpression<?>> arguments;
	
	public PLBooleanFunctionCall(String id) {
		this.arguments = new ArrayList<>();
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public List<PLExpression<?>> getArguments() {
		return arguments;
	}
	
	public void addArgument(PLExpression<?> arg) {
		this.arguments.add(arg);
	}

	@Override
	public boolean hasVariable(String key) {
		for (PLExpression<?> expr: arguments) {
			if (expr.hasVariable(key)) return true;
		}
		return false;
	}
	
	@Override
	public Boolean evaluate() {
		// USE STORE HERE!!!
		return null;
	}
	
}

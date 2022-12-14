package proglang.model;

import java.util.ArrayList;
import java.util.List;

import proglang.model.expressions.PLExpression;

public class PLFunctionCall extends PLStatement {
	
	private String id;
	private List<PLExpression<?>> arguments;
	
	public PLFunctionCall(String id, int lineNum) {
		super(lineNum);
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
}

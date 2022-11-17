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
		this.addArgument(arg);
	}
}

package proglang.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import proglang.model.expressions.PLBooleanExpression;

public class PLConditional extends PLRecursiveBlock {
	LinkedHashMap<PLBooleanExpression, List<PLStatement>> conditions;
	
	public PLConditional(PLBooleanExpression ifExpression, int lineNum, int endLineNum) {
		super(lineNum, endLineNum);
		conditions = new LinkedHashMap<>();
		conditions.put(ifExpression, new ArrayList<>());
	}

	public LinkedHashMap<PLBooleanExpression, List<PLStatement>> getConditions() {
		return conditions;
	}
	
	public List<PLStatement> getStatements(PLBooleanExpression booleanExpression) {
		return conditions.get(booleanExpression);
	}
	
	public void addCondition(PLBooleanExpression booleanExpression) {
		conditions.put(booleanExpression, new ArrayList<>());
	}
	
	public void addStatement(PLBooleanExpression booleanExpression, PLStatement stmt) {
		if (!conditions.containsKey(booleanExpression)) {
			conditions.put(booleanExpression, new ArrayList<>());
		}
		conditions.get(booleanExpression).add(stmt);
	}
}

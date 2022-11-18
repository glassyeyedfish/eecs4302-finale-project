package proglang.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public boolean hasVariable(String key) {
		for (
				Map.Entry<PLBooleanExpression, List<PLStatement>> entry: 
				this.conditions.entrySet()
		) {
			for (PLStatement stmt: entry.getValue()) {
				System.out.println(key);
				if (stmt.hasVariable(key)) return true;
			}
		}
		return false;
	}
}

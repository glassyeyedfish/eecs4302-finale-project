package proglang.processor;

import java.util.*;

import proglang.AbstractPLStatement;
import proglang.PLAddition;
import proglang.PLAssignment;
import proglang.PLBoolLiteral;
import proglang.PLDeclaration;
import proglang.PLIfBlock;
import proglang.PLIntLiteral;
import proglang.PLProgram;
import proglang.PLVariable;

public class OldPLProcessor {

	PLProgram program;
	private HashSet<String> variableDefs = new HashSet<>();
	private HashSet<String> variablesUses = new HashSet<>();
	public OldPLProcessor(PLProgram program) {
		this.program = program;
	}
	
	public List<Integer> getStatementCoverage() { // todo: refactor out traversal logic to avoid redundant work for cov
		List<Integer> lines = new ArrayList<>();
		Map<String, Integer> ints = new HashMap<>();
		Map<String, Boolean> bools = new HashMap<>();
		
		lines.add(program.lineNum);
		for (AbstractPLStatement statement : program.statements) {
			lines.add(statement.lineNum);
			if (statement instanceof PLDeclaration) {
				variableDefs.add(((PLDeclaration) statement).id);
				switch (((PLDeclaration) statement).type) {
				case "INT":
					ints.put(((PLDeclaration) statement).id, null);
					break; 
				case "BOOL":
					bools.put(((PLDeclaration) statement).id, null);
					break; 
				}
			}
			else if (statement instanceof PLAssignment) {
				variablesUses.add(((PLAssignment) statement).id);
				if (ints.containsKey((((PLAssignment) statement).id))) {
					ints.put(((PLAssignment) statement).id, evaluateArithmetic(((PLAssignment) statement).expr, ints));
				}
				else {
					bools.put(((PLAssignment) statement).id, evaluatePredicate(((PLAssignment) statement).expr, bools));
				}
			}
			else if (statement instanceof PLIfBlock) {
				if (evaluatePredicate(((PLIfBlock) statement).condition, bools)) {
					for (AbstractPLStatement ifBlockStatement : ((PLIfBlock) statement).statements) {
						lines.add(ifBlockStatement.lineNum);
						if (ifBlockStatement instanceof PLDeclaration) {
							switch (((PLDeclaration) ifBlockStatement).type) {
							case "INT":
								ints.put(((PLDeclaration) ifBlockStatement).id, null);
								break; 
							case "BOOL":
								bools.put(((PLDeclaration) ifBlockStatement).id, null);
								break; 
							}
						}
						else if (ifBlockStatement instanceof PLAssignment) {
							variablesUses.add(((PLAssignment) ifBlockStatement).id);
							if (ints.containsKey((((PLAssignment) ifBlockStatement).id))) {
								ints.put(((PLAssignment) ifBlockStatement).id, evaluateArithmetic(((PLAssignment) ifBlockStatement).expr, ints));
							}
							else {
								bools.put(((PLAssignment) ifBlockStatement).id, evaluatePredicate(((PLAssignment) ifBlockStatement).expr, bools));
							}
						}
					}
				}
				lines.add(statement.lineNum + statement.linesInStatement() - 1);
			}
		}
		lines.add(program.linesInStatement());
		return lines;
	}

	public HashSet<String> getAllDefsCoverage(){
		HashSet<String> clonedVariableDefs = (HashSet<String>) variableDefs.clone();
		clonedVariableDefs.removeAll(this.variablesUses);
		return clonedVariableDefs;
	}

	private Integer evaluateArithmetic(AbstractPLStatement expr, Map<String, Integer> map) {
		if (expr instanceof PLIntLiteral) {
			return ((PLIntLiteral) expr).value;
		}
		else if (expr instanceof PLVariable) {
			variablesUses.add(((PLVariable) expr).id);
			return map.get(((PLVariable) expr).id);
		}
		else if (expr instanceof PLAddition) {
			return evaluateArithmetic(((PLAddition) expr).left, map) + evaluateArithmetic(((PLAddition) expr).right, map);
		}
		return null;
	}
	
	private Boolean evaluatePredicate(AbstractPLStatement expr, Map<String, Boolean> map) {
		if (expr instanceof PLBoolLiteral) {
			return ((PLBoolLiteral) expr).value;
		}
		else if (expr instanceof PLVariable) {
			variablesUses.add(((PLVariable) expr).id);
			return map.get(((PLVariable) expr).id);
		}
		return null;
	}

}

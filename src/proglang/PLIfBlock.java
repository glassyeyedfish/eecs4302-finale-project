package proglang;

import java.util.ArrayList;
import java.util.List;

public class PLIfBlock extends AbstractPLStatement {
	public AbstractPLStatement condition;
	public List<AbstractPLStatement> statements;
	
	public PLIfBlock(AbstractPLStatement condition) {
		this.condition = condition;
		this.statements = new ArrayList<>();
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		
		result.append(this.lineNum);
		result.append("\t");
		result.append("IF ");
		result.append(condition.prettyPrint());
		result.append(" THEN\n");
		
		for (AbstractPLStatement s: statements) {
			result.append(s.prettyPrint());
		}
		
		result.append(this.lineNum + this.linesInStatement() - 1);
		result.append("\t");
		result.append("END IF\n");
		
		return result.toString();
	}

	@Override
	public int linesInStatement() {
		int result = 2;
		
		for (AbstractPLStatement s: statements) {
			result += s.linesInStatement();
		}
		
		return result;
	}
}

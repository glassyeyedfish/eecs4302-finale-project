package proglang;

import java.util.ArrayList;
import java.util.List;

public class PLProgram extends AbstractPLStatement {
	public String id;
	public List<AbstractPLStatement> statements;
	
	public PLProgram(String id) {
		this.id = id;
		this.statements = new ArrayList<>();
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		
		result.append(this.lineNum);
		result.append("\t");
		result.append("PROGRAM ");
		result.append(id);
		result.append("\n");
		
		for (AbstractPLStatement s: this.statements) {
			result.append(s.prettyPrint());
		}
		
		result.append(this.linesInStatement());
		result.append("\t");
		result.append("END PROGRAM\n");
		
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

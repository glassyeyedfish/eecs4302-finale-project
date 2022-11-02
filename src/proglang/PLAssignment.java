package proglang;

public class PLAssignment extends AbstractPLStatement {
	String id;
	AbstractPLStatement expr;
	
	public PLAssignment(String id, AbstractPLStatement expr) {
		this.id = id;
		this.expr = expr;
	}

	@Override
	public String prettyPrint() {
		return this.lineNum
				+ "\t"
				+ this.id 
				+ " = " 
				+ expr.prettyPrint() 
				+ "\n";
	}

	@Override
	public int linesInStatement() {
		return 1;
	}
}

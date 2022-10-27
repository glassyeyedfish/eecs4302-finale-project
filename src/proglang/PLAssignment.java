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
		return id + " = " + expr.prettyPrint() + "\n";
	}
}

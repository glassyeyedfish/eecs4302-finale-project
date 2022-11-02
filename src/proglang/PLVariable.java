package proglang;

public class PLVariable extends AbstractPLStatement {
	public String id;
	
	public PLVariable(String id) {
		this.id = id;
	}

	@Override
	public String prettyPrint() {
		return id;
	}

	@Override
	public int linesInStatement() {
		return 0;
	}

}

package proglang;

public class PLDeclaration extends AbstractPLStatement {
	public String type;
	public String id;
	
	public PLDeclaration(String type, String id) {
		this.type = type;
		this.id = id;
	}

	@Override
	public String prettyPrint() {
		return this.lineNum
				+ "\t" 
				+ this.type 
				+ " :: " 
				+ this.id 
				+ "\n";
	}

	@Override
	public int linesInStatement() {
		return 1;
	}
}

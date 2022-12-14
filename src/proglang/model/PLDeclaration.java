package proglang.model;

public class PLDeclaration extends PLStatement {
	private String id;
	private String type;

	public PLDeclaration(String id, String type, int lineNum) {
		super(lineNum);
		this.id = id;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	@Override
	public boolean hasVariable(String key) {
		return id.equals(key);
	}
}

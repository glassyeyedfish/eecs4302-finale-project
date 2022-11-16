package testlang;

import java.util.List;

public class TLFunctionCall {
	private String name;
	private List<String> args;
	
	public TLFunctionCall(String name, List<String> args) {
		super();
		this.name = name;
		this.args = args;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

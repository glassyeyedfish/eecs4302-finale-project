package testlang;

import java.util.ArrayList;
import java.util.List;

public class TLProgram extends AbstractTLStatement {
	public String id;
	public List<AbstractTLStatement> statements;
	
	public TLProgram(String id) {
		this.id = id;
		this.statements = new ArrayList<>();
	}

	@Override
	public String prettyPrint() {
		StringBuilder result = new StringBuilder();
		
		result.append("TEST PROGRAM ");
		result.append(id);
		result.append("\n");
		
		for (AbstractTLStatement s: this.statements) {
			result.append(s.prettyPrint());
			result.append("\n");
		}
		
		result.append("END TEST PROGRAM\n");
		
		return result.toString();
	}

}

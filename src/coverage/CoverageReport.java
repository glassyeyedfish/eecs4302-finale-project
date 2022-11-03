package coverage;

import java.util.*;

public class CoverageReport {
	List<ProgramCoverageData> programs;
	
	public CoverageReport() {
		this.programs = new ArrayList<>();
	}
	
	public void addProgram(String prettyPrint, List<Integer> coverageLines) {
		this.addProgram(new ProgramCoverageData(prettyPrint, coverageLines));
	}
	
	public void addProgram(ProgramCoverageData program) {
		this.programs.add(program);
	}
	
	public String toJson() {
		StringBuilder result = new StringBuilder();
		
		// """json"""
		result.append("[");
		
		for (int i = 0; i < programs.size(); i++) {
			if (i > 0) result.append(", ");
			ProgramCoverageData prog = programs.get(i);
			
			result.append("{");
			result.append("\"lines\": [");
			for (int j = 0; j < prog.lines.size(); j++) {
				if (j > 0) result.append(", ");

				String line = prog.lines.get(j);
				result.append("\"" + line + "\"");
			}
			result.append("], ");
			result.append("\"coverage\": " + prog.coverageLines.toString());
			result.append("}");
		}
		
		result.append("]");
		
		return result.toString();
	}
	
	public void print() {
		for (ProgramCoverageData prog: programs) {
			System.out.println(prog.prettyPrint);
			System.out.println("Coverage: " + prog.coverageLines);
		}
	}
}

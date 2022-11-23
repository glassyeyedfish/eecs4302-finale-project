package coverage;
/*
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
*/
public class CoverageReport {
	/*
	List<ProgramCoverageData> programs;
	
	public CoverageReport() {
		this.programs = new ArrayList<>();
	}
	
	public void addProgram(String prettyPrint, List<Integer> coverageLines, HashSet<String> allDefsCoverage) {
		// TODO: clean up method signatures, starting with changings how various coverages originate
		//	from within PLProcessor
		
		this.addProgram(new ProgramCoverageData(prettyPrint, coverageLines, allDefsCoverage));
	}
	
	public void addProgram(ProgramCoverageData program) {
		this.programs.add(program);
	}
	
	public String toJson() {		
		Gson gson = new GsonBuilder().disableHtmlEscaping().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(this.programs);
	}
	
	public void print() {
		for (ProgramCoverageData prog: programs) {
			System.out.println(prog.prettyPrint);
			System.out.println("Coverage: " + prog.coverageLines);
			System.out.println("All-defs coverage: " + prog.allDefsCoverage);
		}
	}*/
}

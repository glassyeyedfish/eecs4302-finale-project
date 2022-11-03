package coverage;

import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(this.programs);
	}
	
	public void print() {
		for (ProgramCoverageData prog: programs) {
			System.out.println(prog.prettyPrint);
			System.out.println("Coverage: " + prog.coverageLines);
		}
	}
}

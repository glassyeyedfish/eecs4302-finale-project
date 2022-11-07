package coverage;

import java.util.*;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProgramCoverageData {
	@Expose
	List<String> lines;
	@Expose
	@SerializedName("coverage")
	List<Integer> coverageLines;

	String prettyPrint;
	
	public ProgramCoverageData(String prettyPrint, List<Integer> lines) {
		this.prettyPrint = prettyPrint;
		this.lines = this.getLinesFromPrettyPrint(prettyPrint);
		this.coverageLines = lines;
	}
	
	private List<String> getLinesFromPrettyPrint(String prettyPrint) {
		List<String> result = new ArrayList<>();
		
		String[] lines = prettyPrint.split("\n");
		
		for (String line: lines) {
			// ignore the line number for now since its sequential...
			// TODO: create a better data structure to store the data
			result.add(line.split("\t")[1]);
		}
		
		return result;
	}
}

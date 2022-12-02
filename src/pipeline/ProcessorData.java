package pipeline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;

public class ProcessorData {
	
	// NOTE: This class should render the CoverageData class obsolete.
	
	// Generated by initial processor.
	@Expose
	public List<DCPath> allDCPaths;
	@Expose
	public List<Integer> allStatements;
	@Expose
	public List<Integer> allDecisions;
	
	// Generated by test interpreters.
	@Expose
	public List<DCPath> coveredDCPaths;
	@Expose
	public List<Integer> coveredStatements;
	@Expose
	public List<Integer> coveredDecisionsTrue;
	@Expose
	public List<Integer> coveredDecisionsFalse;
	
	// The output coverage data. These should just be subsets of what's above.
	// Generated by coverage tests.
	
	// NOTE: There is no need for extra data in statement coverage, because
	// the list of coveredStatements (from above) is sufficient.
	
	// Data Flow
	@Expose
	public List<String> coveredForAllDefs;
	@Expose
	public List<String> requiredForAllDefs;
	
	@Expose
	public List<DCPath> coveredForAllCUses;
	@Expose
	public List<DCPath> requiredForAllCUses;
	
	@Expose
	public List<DCPath> coveredForAllPUses;
	@Expose
	public List<DCPath> requiredForAllPUses;
	
	/*
	 * Data for assertions
	 */
	@Expose
	public Map<String, List<AssertionResult>> assertionResults;
	
	public void coverPathAt(int lineNum) {
		for (DCPath path: this.allDCPaths) {
			if (path.getLineTo() == lineNum && !this.coveredDCPaths.contains(path)) {
				this.coveredDCPaths.add(path);
			}
		}
	}
	
	public void coverPathAt(int lineNum, boolean cond) {
		for (DCPath path: this.allDCPaths) {
			if (
					path.getLineTo() == lineNum 
					&& !this.coveredDCPaths.contains(path)
					&& !path.isCUse()
					&& path.getPUseCondition() == cond
			) {
				this.coveredDCPaths.add(path);
			}
		}
	}
	
	public void coverStatementAt(int lineNum) {
		for (Integer line: this.allStatements) {
			if (line == lineNum && !this.coveredStatements.contains(line)) {
				this.coveredStatements.add(line);
			}
		}
	}
	
	public void coverDecisionAt(int lineNum, boolean cond) {
		for (Integer line: this.allDecisions) {
			if (cond) {
				if (line == lineNum && !this.coveredDecisionsTrue.contains(line)) {
					this.coveredDecisionsTrue.add(line);
				}
			} else {
				if (line == lineNum && !this.coveredDecisionsFalse.contains(line)) {
					this.coveredDecisionsFalse.add(line);
				}
			}
			
		}
	}
	
	public void addAssertionResult(String name, Boolean isSuccess, int lineNum) {
		if (!this.assertionResults.containsKey(name)) {
			this.assertionResults.put(name, new ArrayList<>());
		}
		this.assertionResults.get(name).add(new AssertionResult(isSuccess, lineNum));
	}

	public ProcessorData() {
		this.allDCPaths = new ArrayList<>();
		this.allStatements = new ArrayList<>();
		this.allDecisions = new ArrayList<>();
		
		this.coveredDCPaths = new ArrayList<>();
		this.coveredStatements = new ArrayList<>();
		this.coveredDecisionsTrue = new ArrayList<>();
		this.coveredDecisionsFalse = new ArrayList<>();
		
		this.coveredForAllDefs = new ArrayList<>();
		this.requiredForAllDefs = new ArrayList<>();
		
		this.coveredForAllCUses = new ArrayList<>();
		this.requiredForAllCUses = new ArrayList<>();
		
		this.coveredForAllPUses = new ArrayList<>();
		this.requiredForAllPUses = new ArrayList<>();
		
		this.assertionResults = new HashMap<>();
	}
}

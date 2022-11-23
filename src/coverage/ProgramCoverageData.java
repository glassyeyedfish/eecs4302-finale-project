package coverage;

import java.util.*;

import com.google.gson.annotations.Expose;
// import com.google.gson.annotations.SerializedName;

import pipeline.ProcessorData;

public class ProgramCoverageData {
	@Expose
	String programName;
	
	@Expose
	String programSource;
	
	@Expose
	String testSource;
	
	@Expose
	Map<String, ProcessorData> dataMap;
	
	@Expose
	String rawData;
}

package coverage;

import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import pipeline.ProcessorData;

public class ProgramCoverageData {
	@Expose
	public String programName;
	
	@Expose
	public String programSource;
	
	@Expose
	public String testSource;
	
	@Expose
	public Map<String, ProcessorData> dataMap;
	
	@Expose
	public String rawData;
	
	public ProgramCoverageData() {}
	
	public String toJson() {
		Gson gson = new GsonBuilder().disableHtmlEscaping().excludeFieldsWithoutExposeAnnotation().create();
		return gson.toJson(this);
	}
}

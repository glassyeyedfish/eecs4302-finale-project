package html;

import java.io.*;
import java.util.stream.Collectors;

import coverage.*;

public class HTML {
	ProgramCoverageData data;
	
	public HTML(ProgramCoverageData data) {
		this.data = data;
	}
	
	private String getTemplate() {
		try {			
			InputStream in = getClass().getResourceAsStream("/html/template.html");
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			// join with newlines
			return reader.lines().collect(Collectors.joining(System.lineSeparator()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void outputToFile(String fileName) {
		String template = this.getTemplate();
		String jsonData = this.data.toJson();
		template = template.replace(">>>json<<<", jsonData);

		try {			
			FileWriter html = new FileWriter(fileName + ".html");
			html.append(template);
			html.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

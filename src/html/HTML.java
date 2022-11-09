package html;

import java.io.*;
import java.util.stream.Collectors;

import coverage.*;

public class HTML {
	CoverageReport data;
	
	public HTML(CoverageReport data) {
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
		template = template.replace(">>>json<<<", this.data.toJson());

		try {			
			FileWriter html = new FileWriter(fileName + ".html");
			html.append(template);
			html.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

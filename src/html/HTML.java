package html;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;

import coverage.*;

public class HTML {
	CoverageReport data;
	
	public HTML(CoverageReport data) {
		this.data = data;
	}
	
	private String getTemplate() {
		File f = new File(getClass().getResource("/html/template.html").getFile());
		try {			
			return new String(Files.readAllBytes(f.toPath()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void outputToFile(String fileName) {
		String template = this.getTemplate();
		template = template.replaceAll(">>>json<<<", this.data.toJson());

		try {			
			FileWriter html = new FileWriter(fileName + ".html");
			html.append(template);
			html.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package org.step1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReport {

	public static void generateJvmReport(String json) {

         File f = new File("E:\\eclipse\\eclipse proj\\CucumberProject\\Plugin\\Jvm report");
		Configuration c= new Configuration(f, "Adachin login details");
		c.addClassifications("Name", "Joywin");
		c.addClassifications("Contact#", "1234567890");
	   c.addClassifications("Device", "HP");
	   
		List<String> l= new ArrayList<>();		
		l.add(json);
		
		ReportBuilder r= new ReportBuilder(l, c);
		r.generateReports();		
	}
	
	public static void main(String[] args) {
	
	  JvmReport.generateJvmReport("E:\\eclipse\\eclipse proj\\CucumberProject\\Plugin\\Jvm report\\adachin.json");
			
		}
	
		
}

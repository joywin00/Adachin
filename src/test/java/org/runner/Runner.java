package org.runner;
import org.step1.JvmReport;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="E:\\eclipse\\eclipse proj\\CucumberProject\\src\\test\\resources\\FeatureFile\\login.feature", 
  glue = "org.step1", dryRun = false, 
  monochrome = true,
 // tags = "@login or @smoke",
  plugin = {"pretty", "html:E:\\eclipse\\eclipse proj\\CucumberProject\\Plugin\\Json report\\adachin.html",
		  "json:E:\\eclipse\\eclipse proj\\CucumberProject\\Plugin\\Json report\\adachin.json",
		  "junit:E:\\eclipse\\eclipse proj\\CucumberProject\\Plugin\\Junit report\\adachin.junit",
		  "rerun:E:\\eclipse\\eclipse proj\\CucumberProject\\Plugin\\Junit report\\adachinRerun.txt"
})

public class Runner extends AbstractTestNGCucumberTests{


	@Override
	@DataProvider(parallel= true)
	public Object[][] scenarios() {

		return super.scenarios();
	}
	
	
	
	
	
	
}

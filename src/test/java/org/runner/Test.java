package org.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "E:\\eclipse\\eclipse proj\\CucumberProject\\src\\test\\resources\\FeatureFile\\AdachinDetails.feature",glue = "org.step", dryRun = false)
public class Test extends AbstractTestNGCucumberTests{
	


}

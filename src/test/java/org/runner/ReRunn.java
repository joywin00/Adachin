package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@D:\\Ecli pro\\CucumberProject\\Plugin\\Rerun report\\adachinRerun.txt",
glue="org.step1", monochrome = true,
dryRun = false,
tags = "@login or @smoke",
plugin = {"pretty", "html:D:\\Ecli pro\\CucumberProject\\Plugin\\HTML report\\adachin.html",
		  "json:D:\\Ecli pro\\CucumberProject\\Plugin\\Json report\\adachin.json",
		  "junit:D:\\Ecli pro\\CucumberProject\\Plugin\\Junit report\\adachin.junit",
		  "rerun:D:\\Ecli pro\\CucumberProject\\Plugin\\Rerun report\\adachinRerun.txt"
})

public class ReRunn extends AbstractTestNGCucumberTests{

}

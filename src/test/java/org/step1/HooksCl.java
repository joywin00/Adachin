package org.step1;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksCl extends BaseClass{
	
	
	@Before (order=5)
	public void bef() {   
      getUrl("http://adactinhotelapp.com/");		
	}	
	
	@Before (order=1)
	public void bef2() {
	   openChromeBrowser();	
	}	
	
	@After
	public void aft(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot ts= (TakesScreenshot)getDriver();
			byte[] ss = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(ss,"image/png",s.getName());
		}
		
        quit();
	}
	
	
	
	
	
	
	
	
	
	

}

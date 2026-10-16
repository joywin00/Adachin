package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class Forgetpass {

public Forgetpass() {
	//PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(xpath="//a[text()='Forgot Password?']")
		private WebElement forgetPass;

		
		
		@FindBy	(name="emailadd_recovery")		
		private WebElement fill;

	@CacheLookup	
		@FindBys({
				
			@FindBy(xpath="//input[@id='Submit']"),
			@FindBy(name="Submit")
		})
        private WebElement clk;


		public WebElement getForgetPass() {
			return forgetPass;
		}



		public WebElement fillMail() {
			return fill;
		}
		

		public WebElement clkThebtn() {
			return clk;
		}


}

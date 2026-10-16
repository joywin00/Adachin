package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RadioBtn extends BaseClass{
	
	 public RadioBtn() {
		 PageFactory.initElements(getDriver(), this);
	 }
	
	
	 	@FindBy(xpath="//input[@id='radiobutton_0']")
	 	private WebElement rad;
	 	
	 	@FindBy(id="continue")
		private WebElement clk;

	 	public WebElement getRadio() {
	 		return rad;
	 	}
	
	
        public WebElement getContinue() {
 		      return clk;
 	}
	
	
	
	
	
	
	
	
	

}

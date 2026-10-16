package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPojo extends org.helper.BaseClass{

	public LoginPojo() {

PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement user;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement log;

	public WebElement getUser(WebElement user) {
		return user;
	}

	public WebElement getPass(WebElement pass) {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPojo1 extends BaseClass{
	public LoginPojo1() {
		   PageFactory.initElements(getDriver(), this);
			}
			

			@FindBy(xpath = "//input[@name='username']")
			private WebElement user;


			@FindBy(xpath="//input[@name='password']")
			private WebElement pwd;


			@FindBy(xpath="//input[@id='login']")
			private WebElement log;


			public WebElement getUser(String val) {
				passTheValue(user, val);
				//user.sendKeys("diesel123");
				return user;
			}


			public WebElement getPwd(String val) {
				passTheValue(pwd, val);
				//pwd.sendKeys("2HY9CY");
				return pwd;
			}


			public WebElement getLog() {
				return log;
			}

			
		}
			


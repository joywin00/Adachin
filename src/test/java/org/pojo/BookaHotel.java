package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookaHotel extends org.helper.BaseClass{

	public BookaHotel() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath="(//input[@class='reg_input'])[1]")
	private WebElement firstName;
	
	@FindBy(xpath="(//input[@class='reg_input'])[2]")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="(//input[@class='reg_input'])[3]")
	private WebElement ccNum;
	
	@FindBy(xpath="//select[@class='select_combobox']")
   	private WebElement ccType;
	
	@FindBy(xpath="(//select[@class='select_combobox2'])[1]")
	private WebElement expDt;
	
	@FindBy(xpath="(//select[@name='cc_exp_year'])")
	private WebElement expYr;
	
	@FindBy(xpath="(//input[@class='reg_input'])[4]")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookNow;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpDt() {
		return expDt;
	}

	public WebElement getExpYr() {
		return expYr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	
	
	
	
	

}

package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class HotelDetails extends org.helper.BaseClass{

	public HotelDetails() {
		 PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//select[@id='location']")
	  private WebElement loc;
	
	@FindBys({
		@FindBy(id="hotels"),
		@FindBy(xpath="(//select[@class='search_combobox'])[2]")
	})
	private WebElement hotel;
	
	@FindBy(xpath="//option[@value='Hotel Sunshine']")
	private WebElement hoteltype;
	
	
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private WebElement room;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[4]")
	private WebElement numRoom;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkInDt;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOutDt;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[5]")
	private WebElement adult;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[6]")
	private WebElement child;
	
	@FindBys({
		@FindBy(xpath="//input[@id='Submit']"),
		@FindBy(xpath="//input[@value='Search']")
	})
	private WebElement src;

	public WebElement getLocation() {
		return loc;
		
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getHoteltype() {
		return hoteltype;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNumRoom() {
		return numRoom;
	}

	public WebElement getCheckInDt() {
		return checkInDt;
	}

	public WebElement getCheckOutDt() {
		return checkOutDt;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSrc() {
		return src;
	}
	
	


}

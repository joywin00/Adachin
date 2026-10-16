package org.step;

import java.io.IOException;
import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pojo.BookaHotel;
import org.pojo.HotelDetails;
import org.pojo.LoginPojo;
import org.pojo.LoginPojo1;
import org.pojo.RadioBtn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{

	@Given("User have to launch the adactin application through chrome browser")
	public void user_have_to_launch_the_adactin_application_through_chrome_browser() {

		openChromeBrowser();
		maxWin();
		getUrl("https://adactinhotelapp.com/");	 
	}
	
	
	@Given("User have to launch the adactin site through chrome")
	public void user_have_to_launch_the_adactin_site_through_chrome() {
		
		openChromeBrowser();
		maxWin();
		getUrl("https://adactinhotelapp.com/");	
	impWait(30);		
	}
	
	
	@When("user have to pass the {string} and {string} and to click the login button")
	public void user_have_to_pass_the_and_and_to_click_the_login_button(String us, String pass) {

		 LoginPojo1 l= new LoginPojo1();
		l.getUser(us);
		l.getPwd(pass);
		l.getLog();
	}
	
	@When("user have to validate the dashboard")
	public void user_have_to_validate_the_dashboard() throws InterruptedException {
		
		
		Sleep(2000);
		if (getCurrUrl().contains("SearchHotel.php")) {
			System.out.println("valid login details");
		}
		
		else {
			System.out.println("invalid login details");
		}
	}
	
	@Then("user have to close the browser")
	public void user_have_to_close_the_browser()  {
	   
	  quit();
	}
	
	@When("User have to pass the valid username and valid password and to click the login button")
	public void user_have_to_pass_the_valid_username_and_valid_password_and_to_click_the_login_button() throws IOException {
	  	 	    
		  LoginPojo1 l= new LoginPojo1();
		l.getUser( getDataFromXl("E:\\eclipse\\eclipse proj\\CucumberProject\\folder\\Adactin user login.xlsx", "Adactin login", 1, 2));
		l.getPwd(getDataFromXl("E:\\eclipse\\eclipse proj\\CucumberProject\\folder\\Adactin user login.xlsx", "Adactin login", 1, 3));		   
		 l.getLog().click(); 
	}
	
	@When("User have to fill the required details to to book a hotel")
	public void user_have_to_fill_the_required_details_to_to_book_a_hotel() {
 
		HotelDetails d= new HotelDetails();
		WebElement location = d.getLocation();
		Select s= new Select(location);
			s.selectByIndex(3);
			
		WebElement hotel = d.getHotel();	
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement room = d.getRoom();
		Select s2 = new Select(room);
		s2.selectByVisibleText("Double");	
			
			WebElement numRoom = d.getNumRoom();
			Select s3 = new Select(numRoom);
	        s3.selectByValue("5");

	        WebElement adult = d.getAdult();
	        Select s4 = new Select(numRoom);
	        s4.selectByValue("2");

	     d.getSrc().click();
	}
	
	@When("User have to click radio button and generate order id")
	public void user_have_to_click_radio_button_and_generate_order_id() throws IOException, InterruptedException {
	  	 
		   RadioBtn r = new RadioBtn();
		     
		    r.getRadio().click();
		    r.getContinue().click();
		    
		  BookaHotel b= new BookaHotel();
		WebElement firstName = b.getFirstName();
		passTheValue(firstName, getDataFromXl("E:\\eclipse\\eclipse proj\\CucumberProject\\folder\\Adactin user login.xlsx", "Adactin login", 1,0));

		WebElement lastName = b.getLastName();
		passTheValue(lastName, getDataFromXl("E:\\eclipse\\eclipse proj\\CucumberProject\\folder\\Adactin user login.xlsx", "Adactin login", 1,1));

		 WebElement address = b.getAddress();
		passTheValue(address, getDataFromXl("E:\\eclipse\\eclipse proj\\CucumberProject\\folder\\Adactin user login.xlsx", "Adactin login", 1,5));

		WebElement ccNum = b.getCcNum();
		passTheValue(ccNum, getDataFromXl("E:\\eclipse\\eclipse proj\\CucumberProject\\folder\\Adactin user login.xlsx", "Adactin login", 1,6));


		WebElement ccType = b.getCcType();
		Select s5 = new Select(ccType);
		s5.selectByValue("MAST");

		WebElement expDt = b.getExpDt();
		Select s6= new Select(expDt);
		s6.selectByValue("6");

		WebElement expYr = b.getExpYr();
		Select s7= new Select(expYr);
		s7.selectByValue("2028");

		WebElement cvv = b.getCvv();
		passTheValue(cvv, "123");

		b.getBookNow().click();
		Sleep(5000); 
		
		WebElement orderNo = getDriver().findElement(By.xpath("//input[@id='order_no']"));
		System.out.println("order id: "+orderNo.getAttribute("value"));

	}
	
	
}

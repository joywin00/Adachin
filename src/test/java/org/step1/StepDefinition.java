package org.step1;

import java.util.List;
import java.util.Map;

import org.helper.BaseClass;
import org.pojo.LoginPojo1;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	@Given("user have to max chrome browser and wait for few sec")
	public void user_have_to_max_chrome_browser_and_wait_for_few_sec() {
	    
//		openChromeBrowser();
		maxWin();
		impWait(5);
//		getUrl("http://adactinhotelapp.com/");
	
	}
	
	@When("user have to pass the valid username and password and need to click login button")
	public void user_have_to_pass_the_valid_username_and_password_and_need_to_click_login_button(io.cucumber.datatable.DataTable d) {
	 
		List<String> list = d.asList();
		LoginPojo1 l= new LoginPojo1();
		String us = list.get(2);
		l.getUser(us);
		l.getPwd(list.get(3));
		l.getLog().click();
	}
	
	@When("user have to pass the invalid username and invalid password and need to click login button")
	public void user_have_to_pass_the_invalid_username_and_invalid_password_and_need_to_click_login_button(io.cucumber.datatable.DataTable d) {
 
      List<Map<String,String>> asMaps = d.asMaps();
      Map<String, String> map = asMaps.get(0);
      LoginPojo1 l= new LoginPojo1();
      l.getUser(map.get("username"));
      l.getPwd(map.get("password"));
      l.getLog().click();
	}
	
	@When("user have to pass the invalid username and valid password and need to click login button")
	public void user_have_to_pass_the_invalid_username_and_valid_password_and_need_to_click_login_button(io.cucumber.datatable.DataTable d) {
 
     Map<String, String> asMap = d.asMap();
     LoginPojo1 l= new LoginPojo1();
     l.getUser(asMap.get("username"));
     l.getPwd(asMap.get("password"));
     l.getLog().click();
	}
	
	@When("user have to pass the valid username and invalid password and need to click login button")
	public void user_have_to_pass_the_valid_username_and_invalid_password_and_need_to_click_login_button(io.cucumber.datatable.DataTable d) {
  
		List<List<String>> lists = d.asLists();
	      List<String> list = lists.get(2);
	      LoginPojo1 l= new LoginPojo1();
	      l.getUser(list.get(0));
	      l.getPwd(list.get(1));  
	      l.getLog().click();
		
	}
	
	@When("user have to validate dashboard")
	public void user_have_to_validate_dashboard() {
	 
	Assert.assertEquals(getCurrUrl(), "https://adactinhotelapp.com/SearchHotel.php", "login passed");
	}
	
	
	@Then("user have to close the tab")
	public void user_have_to_close_the_tab() {
	  
closeTab();
	}
	

}




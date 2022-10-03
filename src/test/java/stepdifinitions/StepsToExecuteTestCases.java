package stepdifinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class StepsToExecuteTestCases extends BaseClass
{
	public StepsToExecuteTestCases() 
	{
		PageFactory.initElements(driver, this);
	}
	public LoginPage lp; 
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
	    lp = new LoginPage();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	   lp.setUsername(email);
	   lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
	   lp.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	   if(driver.getPageSource().contains("Login was unsuccessful."))
	   {
		   driver.close();
		   Assert.assertTrue(false);
	   }
	   else
	   {
		   Assert.assertEquals(title, driver.getTitle());
	   }
	}

	@When("User Click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	    lp.clickLogout();
	    Thread.sleep(3000);
	    
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    driver.close();
	}


}

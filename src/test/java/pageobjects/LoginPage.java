package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass
{
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "Email")
	public WebElement email;
	
	@FindBy (id = "Password")
	public WebElement pwd;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement loginbtn;
	
	@FindBy (linkText = "Logout")
	public WebElement logoutbtn;
	
	public void setUsername(String uname) 
	{
		email.clear();
		email.sendKeys(uname);
	}
	
	public void setPassword(String pswd) 
	{
		pwd.clear();
		pwd.sendKeys(pswd);
	}
	
	public void clickLogin() 
	{
		loginbtn.click();
	}

	public void clickLogout() 
	{
		logoutbtn.click();
	}
}

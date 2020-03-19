package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class LoginPage extends TestBase
{
	
	@FindBy(xpath="//input[@id = 'email_create']")
	WebElement EmailAddress;
	
	@FindBy(xpath = "//button[@id = 'SubmitCreate']")
	WebElement CreateButton;
	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "SubmitLogin")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public RegisterPage Email_Address()
	{
		EmailAddress.sendKeys(pro.getProperty("EmailAddress"));
		CreateButton.click();
		return new RegisterPage();
		
	}
	
	/*public void login()
	{
		Email.sendKeys(pro.getProperty("EmailAddress"));
		password.sendKeys(pro.getProperty("password"));
		login.click();
	}*/
	
	}



package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;

public class MyStorePage extends TestBase {

	@FindBy(xpath = "//a[@class='login']")
	WebElement signIn;
	
	
	public MyStorePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickSignIn()
	{
		signIn.click();
		return new LoginPage();
		
	}
}

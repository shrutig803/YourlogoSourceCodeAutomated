package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.MyStorePage;
import baseClass.TestBase;

public class LoginPageTest extends TestBase
{
	MyStorePage mystorepage;
	LoginPage loginpage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
	 mystorepage = new MyStorePage();
	 loginpage = new LoginPage();
	 mystorepage.clickSignIn();
	}
	
	@Test
	public void emailaddresstest()
	{
		
		loginpage.Email_Address();
	}
	
	/*@Test(priority=1)
	public void loginTest()
	{
		loginpage.login();
	}*/
	
	/*@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}*/

}

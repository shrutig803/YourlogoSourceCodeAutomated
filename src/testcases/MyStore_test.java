package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.MyStorePage;
import PageObjects.RegisterPage;
import baseClass.TestBase;

public class MyStore_test extends TestBase
{

	MyStorePage mystorepage;
	
	public MyStore_test()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		mystorepage = new MyStorePage();
			
	}
	
	@Test
	public RegisterPage click_signin()
	{
		mystorepage.clickSignIn();
		return new RegisterPage();
		
	}
	
	/*@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}*/
}

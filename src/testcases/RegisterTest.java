package testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.Testutil;
import PageObjects.LoginPage;
import PageObjects.MyStorePage;
import PageObjects.RegisterPage;
import baseClass.TestBase;

public class RegisterTest extends TestBase  {

	RegisterPage registerpage;
	MyStorePage mystorepage;
	LoginPage loginpage;
	
	public RegisterTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		registerpage = new RegisterPage();
		mystorepage = new MyStorePage();
		mystorepage.clickSignIn();
		loginpage = new LoginPage();
		loginpage.Email_Address();
			
	}
	@DataProvider
	public Iterator<Object[]> grabData()
	{
		ArrayList<Object[]> testdata = Testutil.getDatafromExcel();
		return testdata.iterator();
	}
	
	@Test(dataProvider="grabData")
	public  void RegisterAccount(String FirstName)
	{
		RegisterPage.Firstname.sendKeys(FirstName);
	}
	
/*	@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}*/
}

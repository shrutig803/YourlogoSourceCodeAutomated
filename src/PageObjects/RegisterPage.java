package PageObjects;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseClass.TestBase;
import testcases.RegisterTest;
import utility.Testutil;



public class RegisterPage extends TestBase
{
	RegisterPage registerpage;
	
	Testutil util;

	@FindBy(xpath ="//input[@id = 'id_gender2']")
	public static WebElement Title;
	
	@FindBy(id ="customer_firstname")
	public static WebElement Firstname;
	
	@FindBy(id = "customer_lastname")
	WebElement lastname;
	
	@FindBy(id = "passwd")
	WebElement password;
	
	@FindBy(id = "days")
	WebElement days;
	
	@FindBy(id = "months")
	WebElement months;
	
	@FindBy(id = "years")
	WebElement years;

	@FindBy(id = "id_state")
	WebElement state;
	
	@FindBy(id = "address1")
	WebElement address;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id ="firstname")
	WebElement firstName;
	
	@FindBy(id = "lastname")
	WebElement Lastname;
	
	@FindBy(id = "postcode")
	WebElement zip;
		
	@FindBy(id = "phone_mobile")
	WebElement mobile;
	
	@FindBy(id = "submitAccount")
	WebElement register;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
		/*
		lastname.sendKeys(pro.getProperty("LastName"));
		password.sendKeys("password");
		registerpage = new RegisterPage();
		registerpage.select_birthday();
		address.sendKeys(pro.getProperty("address"));
		city.sendKeys(pro.getProperty("city"));
		registerpage.select_state();
		zip.sendKeys(pro.getProperty("zip"));
		mobile.sendKeys(pro.getProperty("mobile"));
		register.click();*/
		
		
	

		public  void select_birthday()
		{
			Select sel_days = new Select(days);
			Select sel_Months = new Select(months);
			Select sel_Year = new Select(years);
			sel_days.selectByValue(pro.getProperty("Day"));
			sel_Months.selectByValue(pro.getProperty("Month"));
			sel_Year.selectByValue(pro.getProperty("Year"));
		}
		
		public void select_state()
		{
			Select sel_state = new Select(state);
			sel_state.selectByVisibleText(pro.getProperty("state"));
		}
				
		
		
		

}

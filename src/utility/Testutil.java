package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseClass.TestBase;

public class Testutil extends TestBase
{
	
	static Xls_Reader reader;
	

	public static void main (String[] args)
	{
		System.out.println(Testutil.getDatafromExcel());
	}
	public static ArrayList<Object[]> getDatafromExcel()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		reader = new Xls_Reader("C:\\Test\\Assignment\\Yourlogo\\DataSource.xlsx");
		
		for(int i=2;i<=reader.getRowCount("RegistrationPage");i++)
		{
			String FirstName = reader.getCellData("RegistrationPage", "FirstName", i);
			String LastName = reader.getCellData("RegistrationPage", "LastName", i);
			//System.out.println(FirstName);
		    Object ob[] = {FirstName};
		    mydata.add(ob);
		}
		
	
		return mydata;
	}
}



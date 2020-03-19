package baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	protected static WebDriver driver;
	protected static Properties pro;

	public TestBase()
	{
		try
		{
		pro = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Test\\Assignment\\Yourlogo\\src\\properties\\config.properties");
		pro.load(fis);
		}
		catch(FileNotFoundException fe)
		{
			fe.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void initialization()
	{
		String browsername = pro.getProperty("Browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\PRONTO\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(pro.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}

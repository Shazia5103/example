package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest 
{

	public static void launch(String browser)
	{
		if(browser.equals("chrome")) 
	{
			WebDriverManager.chromedriver().setup();
			new ChromeDriver();
			ChromeDriver driver = new ChromeDriver();
			driver.get("chrome");
	}
	}
	}

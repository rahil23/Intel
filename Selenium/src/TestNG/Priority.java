package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	WebDriver driver ;
	
	@Test(priority=-3)
	public void a()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
		
	}
	
	@Test(priority=-2)
	public void b()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.quit();
	}

}

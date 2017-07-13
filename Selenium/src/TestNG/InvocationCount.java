package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void openURL() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/search?q=mtjira&oq=mtjira&aqs=chrome..69i57.2327j0j1&sourceid=chrome&ie=UTF-8");
		Thread.sleep(2000);
		driver.quit();
	}
	
}

package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider {
	WebDriver driver;
	
	@Test(dataProvider = "SearchProvider")
	public void wstart(String searchkey)
	{
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchkey);
		driver.findElement(By.name("btnK")).click();
	}

	@DataProvider(name="SearchProvider")
	public Object[][] getDataFromDataProvider()
	{
		return new Object[][]{
			{"GURU99"},{"Krishna"},{"bhupesh"}
		};
	}
			
}

package Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterBasic {
	
	WebDriver driver;
	
	
	@Test
	@Parameters({"searchkey"})
	public void startW(String searchkey)
	{
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchkey);
		driver.findElement(By.name("btnK")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	driver.quit();
	
	}

}

package DataProvider;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MethodLevelDataProvider {
	
	WebDriver driver;
	WebDriver driver2;
	
	@Test(dataProvider="SearchProvider")
	public void method1(String searchkey,String author)
	{
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchkey);
		driver.findElement(By.name("btnK")).click();
	}

	@Test(dataProvider="SearchProvider")
	public void method2(String searchkey2)
	{
		driver2 = new FirefoxDriver();
		driver2.get("http://www.google.com");
		driver2.findElement(By.name("q")).clear();
		driver2.findElement(By.name("q")).sendKeys(searchkey2);
		driver2.findElement(By.name("btnK")).click();
	}
	
	
	
	
	
	@DataProvider(name="SearchProvider")
	public Object [][]getDataProvider(Method m)
	{
		if(m.getName().equalsIgnoreCase("method1"))
		{
			return new Object[][]
			{
				{"Guru99","India"},
				{"krishna","UK"},
				{"Bhupesh","USA"}
			};
			
		}
		
		if(m.getName().equalsIgnoreCase("method2"))
		{
			return new Object[][]
			{
				{"SRK"},
				{"Amitab"},
				{"Arnab"}
			};
		}
		;
		return null;
				
		
		
		
			}
		
	}
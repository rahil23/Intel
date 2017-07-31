package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupLevelDataProvider {
	
	WebDriver driver;
	
	
	@Test(dataProvider="searchProvider",groups = "A")
   public void method1(String searchkey)
   {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchkey);
		driver.findElement(By.name("btnK")).click();
		
   }
	
	@Test(dataProvider="searchProvider",groups="B")
	public void method2(String searchkey,String value)
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(searchkey);
		driver.findElement(By.name("btnK")).click();
		
	}

	
	
	@DataProvider(name="searchProvider")
	public Object [][]getsearchProvider(ITestContext c)
	{
		Object[][] groupArray = null;
		for(String group : c.getIncludedGroups())
		{
			if(group.equalsIgnoreCase("B"))
			{
				groupArray = new Object[][] {
					{"Guru99","India"},
					{"krishna","UK"},
					{"Bhupesh","USA"}
				};
				
				break;
			}
			
			else if(group.equalsIgnoreCase("A"))
			{
				groupArray = new Object[][] {
					{"Canada"},
					{"Russia"},
					{"Japan"}
				};
				
			}
			
			break;
			
		}
		return groupArray;
		
				}
			}
		
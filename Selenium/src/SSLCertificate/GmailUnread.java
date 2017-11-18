package SSLCertificate;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailUnread {
	
	WebDriver driver;
	
	@Test
	void deleteUnread()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='gmail-nav__nav-links-wrap']/a[2]")).click();
		
		driver.findElement(By.id("identifierId")).sendKeys("info.rahil@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.name("password")).sendKeys("Enter&267");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("(//div[starts-with(@id,':')])[44]")).click();
		
		
		
	}

}

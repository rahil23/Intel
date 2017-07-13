package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginScenario {

	private WebDriver driver;
	
	@Test
	public void testLogin()
	{
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.navigate().to("https://whatfix.com/community/");
	
	driver.findElement(By.xpath("//a[contains(text(),'Login / Signup')]")).click();
	
	
	WebElement password_txtbox = 	driver.findElement(By.id("password"));
	
	
	driver.findElement(By.id("email")).sendKeys("info.rahil@yahoo.com");
password_txtbox.sendKeys("test12");
	driver.findElement(By.id("login")).click();
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
WebElement ErrormessageXpath	=  driver.findElement(By.xpath("//div[@class='WFMACF']//tr[4]/td/div"));
String errormessage = ErrormessageXpath.getText();
System.out.println("The error message after Invalid credential : "+errormessage);

password_txtbox.clear();
password_txtbox.sendKeys("test123");
driver.findElement(By.id("login")).click();

WebElement successMessageXpath	=  driver.findElement(By.xpath("//div[@class='WFMACF']//tr[4]/td/div"));
String successmessage = successMessageXpath.getText();
System.out.println("the message after Valid  credential : "+successmessage);

	}
	
}

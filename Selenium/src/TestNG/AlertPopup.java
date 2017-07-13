package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginbutton")).click();

		
		Alert al = driver.switchTo().alert();
		al.getText();
		al.dismiss();
		
		driver.findElement(By.id("loginbutton")).click();
		al.accept();
		
		
		
	}
}

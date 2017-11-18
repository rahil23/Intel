import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Brokenimage {
	WebDriver dr;
	
	@BeforeTest
	public void init(){
		 dr= new FirefoxDriver();
		dr.get("http://www.google.com");
		
		
	}
	
	@Test
	public void check(){
	List<WebElement> ls= dr.findElements(By.tagName("img"));
	System.out.println(ls.size());
	
}}

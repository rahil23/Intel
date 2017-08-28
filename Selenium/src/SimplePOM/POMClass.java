package SimplePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class POMClass {
	
	
	//https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F
	
		//driver.findElement(By.id("id"));
		
	WebDriver driver;
	
	By username = By.id("usernameOrEmail");
	By password = By.name("password");
	By loginbtn = By.xpath("//button[contains(text(), 'Log In')]");
	
	public POMClass(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	

public void typeuserName()
{
driver.findElement(username).sendKeys("admin");	
}

public void typepassword()
{
	driver.findElement(password).sendKeys("demo123");
}


public void btnclick()
{
	driver.findElement(loginbtn).click();
}
}
package SimplePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestScriptPOMClass {
	
	@Test
	public void verifyPOMLogin()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		
		POMClass obj = new POMClass(driver);
		obj.typeuserName();
		obj.typepassword();
		obj.btnclick();
		
		driver.quit();
	}

}

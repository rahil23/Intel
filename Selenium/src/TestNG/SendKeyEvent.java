package TestNG;import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxBinary;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	public class SendKeyEvent {
	
		public static void main(String[] args) {
			
			WebDriver driver  = new FirefoxDriver();
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			
			driver.findElement(By.cssSelector("#usernameId")).sendKeys("rahilk23");
			driver.findElement(By.cssSelector(".loginPassword")).sendKeys("qwerwrwe");
			driver.findElement(By.cssSelector("input.loginCaptcha")).sendKeys("5654");
			//driver.findElement(By.xpath("input#loginbutton")).click();
			
			//driver.findElement(By.cssSelector("#usernameId")).sendKeys(Keys.CONTROL,"a",Keys.DELETE);
			
			driver.findElement(By.cssSelector("#usernameId")).sendKeys(Keys.CONTROL,"a",Keys.CONTROL,"c");
			driver.findElement(By.cssSelector("input.loginCaptcha")).sendKeys(Keys.CONTROL,"v");
	}
	
}

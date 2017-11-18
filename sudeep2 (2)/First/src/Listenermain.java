import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class Listenermain {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new FirefoxDriver();
		EventFiringWebDriver driver= new EventFiringWebDriver(dr);
		Down down= new Down();
		driver.register(down);
		
		driver.navigate().to("https://www.google.com/intl/en/mail/help/about.html");
		driver.findElement(By.xpath("//*[@id='gmail-sign-in']")).click();
		Thread.sleep(5000);
		System.out.println("yes");
		driver.navigate().back();
		
		
		

	}

}

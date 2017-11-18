import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new FirefoxDriver();
		dr.get("http://www.flipkart.com/");
		Actions act= new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[1]/a/span"))).build().perform();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//*[@id='menu-electronics-tab-0-content']/ul[1]/li[4]/a")).click();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class Excersize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver dr= new FirefoxDriver();
dr.get("http://www.cathaypacific.com/cx/en_US.html");
JavascriptExecutor jx= (JavascriptExecutor)dr;

jx.executeScript("window.scrollBy(0, 500)", "");
Actions act= new Actions(dr);
act.moveToElement(dr.findElement(By.xpath("//*[@id='depart-label']"))).click();
dr.findElement(By.xpath("//*[@id='depart-label']")).clear();
Thread.sleep(3000);

dr.findElement(By.xpath("//*[@id='depart-label']")).sendKeys("wash");
Thread.sleep(3000);
//Actions actr= new Actions(dr);
//actr.moveToElement(dr.findElement(By.xpath("//*[contains (@id,'ui-id')]")));
//Thread.sleep(3000);
dr.findElement(By.xpath("//*[contains (@id,'ui-id')]")).click();


	}

}

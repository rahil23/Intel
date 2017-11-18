import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Seleniumpra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr= new FirefoxDriver();
		dr.get("http://www.codeinwp.com/blog/best-drag-and-drop-theme-builders/");
	WebElement src=	dr.findElement(By.xpath("//*[@id='menu-item-810']/a"));
	WebElement des= dr.findElement(By.xpath("//*[@id='mce-EMAIL']"));
	
			Actions act= new Actions(dr);
			act.clickAndHold(src).build().perform();
			act.moveToElement(des).build().perform();;
			act.release(des).build().perform();
		
			
			
			
			
			}
		

	}



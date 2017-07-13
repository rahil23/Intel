package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForwardBackwardTraversing {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='grid_12 alpha']//ul//descendant::li[4]//descendant::a"));
		String str = ele.getText();
		System.out.println("Descendant text : "+ str);
		
		//descendant means forward element... it's a forward traversing
		
		
		WebElement el2 = driver.findElement(By.xpath("//div[@class='grid_12 alpha']/ancestor::div[1]")); // this will match only 1st parent div from bottom. means first element from last
		
		WebElement el3 = driver.findElement(By.xpath("//div[@class='grid_12 alpha']/ancestor::div")); // this will match all the parent divs
		
		WebElement ele4 = driver.findElement(By.xpath("//div[@class='grid_12 alpha']//li[2]/following-sibling::li")); //this will only match with all lower sibling. Following sibling willl not fetch upper sibling
		
		System.out.println("following sibling : "+ ele4.getText());
		
		
		WebElement childxpath = driver.findElement(By.xpath("//div[@class='grid_12 alpha']//ul//child::li[4]//child::a")); // Same as descendant.. just descendant keyword is replaced by CHILD
		String childxpathgettext = childxpath.getText();
		System.out.println("Child Xpath text us : "+childxpathgettext);
		
		
		WebElement el5 = driver.findElement(By.xpath("//div[@class='grid_12 alpha']/ancestor::div[1]"));   // Same as Ancestors.. just Ancestor keyword is replaced by PARENT
	
	WebElement slashDot =  driver.findElement(By.xpath("//div[@class='grid_12 alpha']/ancestor::div[1]/..")); // this will come to immediate Parent 
		
	}
	
}

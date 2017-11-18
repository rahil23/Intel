import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Alllinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver dr= new FirefoxDriver();
dr.get("http://www.flipkart.com/");
List<WebElement> wb=dr.findElements(By.tagName("a"));

System.out.println(wb.size());

for(int i=0; i<wb.size();i++){
	System.out.println(wb.get(i).getText());
}
	}

}

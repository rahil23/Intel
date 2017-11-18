import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Doing {

	public static void main(String[] args) throws InvalidFormatException, IOException {
	WebDriver dr= new FirefoxDriver();
	dr.get("http://www.bookfari.com/category/1/architecture-and-design");
String result=	dr.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_IdPagingTop']/div[1]")).getText();
System.out.println(result);
String url= dr.getCurrentUrl();
System.out.println(url);

Writingexcel.write(result);
	}
	
	
	
	

}

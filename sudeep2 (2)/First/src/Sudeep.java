import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sudeep {

	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException {
		 
		//TODO Auto-generated method stub
		
		
		Excel_Reader ex= new Excel_Reader();
		String babu=ex.Excel();
		
		WebDriver driver= new FirefoxDriver();
				driver.get("https://www.google.com");
				Thread.sleep(4000);
		driver.findElement(By.className("gsfi")).sendKeys(babu);;

	}

}

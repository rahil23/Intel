package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
	
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		ScreenShot.takeSS();

	
	System.out.println("SS Taken");
		
		
		
		
	}
	
	public static void takeSS() throws IOException
	{
	
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File srcFile = ss.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Intel\\qqqqqq\\Selenium\\SS.PNG");
		
		FileUtils.copyFile(srcFile, destFile);
	
	}

}

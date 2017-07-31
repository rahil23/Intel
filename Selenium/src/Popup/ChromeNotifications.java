package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeNotifications {
	
	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions();
	
	options.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rkumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver(options);
driver.get("https://www.cleartrip.com/");	

}
}

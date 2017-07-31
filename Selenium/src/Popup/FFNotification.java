package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FFNotification {
	public static void main(String[] args) {
		
	
	FirefoxProfile profile=new FirefoxProfile ();
	profile.setPreference("dom.webnotifications.enabled",false);
	WebDriver driver= new FirefoxDriver(profile);
	
	driver.get("https://www.cleartrip.com/");

}
}
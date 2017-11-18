import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Multiinstancebro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver dr1= new FirefoxDriver();
WebDriver dr2= new FirefoxDriver();

dr1.get("http://google.com");
dr2.get("http://gmail.com");
	}

}

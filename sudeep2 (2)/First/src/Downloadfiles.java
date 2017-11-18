import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class Downloadfiles {

	public static void main(String[] args) {
		FirefoxProfile fr= new FirefoxProfile();
		fr.setPreference("browser.download.folderList", 2);
		fr.setPreference("browser.download.dir", "F:\\downloads");
		fr.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");
		
		WebDriver dr= new FirefoxDriver(fr);
		dr.get("http://qtpselenium.com/test/testdownload.php");
		dr.findElement(By.xpath("html/body/a[1]")).click();

	}

}

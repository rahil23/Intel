package SSLCertificate;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SSLExample_IE {

	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		// To Accept SSL certificate
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		// setting system property for Chrome browser
		System.setProperty("webdriver.ie.driver", "C:\\Users\\rkumar\\Downloads\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
		// create Google Chrome instance and maximize it
		driver = new InternetExplorerDriver(capability);
		driver.manage().window().maximize();
	}

	@Test
	public void openApplication() {
		System.out.println("Navigating application");
		driver.get("https://cacert.org/");
		WebElement headingEle = driver.findElement(By.cssSelector(".story h3"));
		// Validate heading after accepting untrusted connection
		String expectedHeading = "Are you new to CAcert?";
		Assert.assertEquals(headingEle.getText(), expectedHeading);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}
}

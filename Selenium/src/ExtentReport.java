import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport {
	


ExtentReports extent;
ExtentReport test;

@BeforeTest
public void start()
{
	extent  = new ExtentReports(System.getProperty("user.dir")+" "+"/test-output/Myreport.html",true);
	extent.addSystemInfo("Hostname","rahil")
	.addSystemInfo("User name","kmart\rkumar")
	.addSystemInfo("report heading","Customizated report");
	
	extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml	"));
	



}
}
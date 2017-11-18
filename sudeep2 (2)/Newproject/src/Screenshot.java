import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.persistence.tools.file.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.google.co.in/?gfe_rd=cr&ei=W-mwVtzbMebI8AeFxJngBg");
		//File src= ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("C:\\temp\\screenshot.png"));

	}

}

package DynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllTableRowCol {
	
	WebDriver driver ;
	
	@Test
	public void getAllColRows()
	{
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/table/");
		
		List<WebElement> getRows = driver.findElements(By.xpath("//html//table//tr"));
		int rowSize = getRows.size();
		
		for (int i = 0; i < rowSize; i++) {
			List<WebElement> getCOls = getRows.get(i).findElements(By.tagName("td"));
			
			int col_count = getCOls.size();
			for (int j = 0; j < col_count; j++) {
				String getText = getCOls.get(i).getText();
				System.out.println("cell value of row number"+i+"column number"+j+"is"+getText);
				
			}
			System.out.println("------------------------------------");
			
		}
	}
	
	 

}

package DynamicTable;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DynamicRowCol {

	WebDriver driver;
	double r=0;
	
	@Test
	public void m1() throws ParseException
	{
	driver = new FirefoxDriver();
	driver.get("http://money.rediff.com/gainers/bse/daily");
	
	driver.findElement(By.xpath("//th[contains(text(), 'Company')]"));
	List <WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
	
	System.out.println("Column Size"+col.size());
	
	
	List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	System.out.println("Row Size"+rows.size());
	WebElement rowText = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[1]"
			+ ""));
	System.out.println("Row Text" + rowText.getText());
	
	WebElement element = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td[2]"));
	System.out.println("text of 3rd row and 2nd column"+element.getText());
	
	List<WebElement> getCurrentPriceRow = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	int size = getCurrentPriceRow.size();
	
	for(int i=0;i<size;i++)
	{
		String max = getCurrentPriceRow.get(i).getText();
		//System.out.println(max);
		NumberFormat f =NumberFormat.getNumberInstance(); 
        Number num = f.parse(max);
		max = num.toString();
		double m = Double.parseDouble(max);
		if(m>r)
		{
			r=m;
		}
		
	}
	System.out.println("Higest num"+r);
		
	
	
	
	
	}
	
}

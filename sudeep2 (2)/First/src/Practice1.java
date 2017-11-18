import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver dr= new FirefoxDriver();
dr.get("http://www.javascripter.net/faq/alert.htm");
dr.findElement(By.xpath("html/body/p[1]/table/tbody/tr/td[1]/form/input")).click();
dr.switchTo().alert();
String se=dr.switchTo().alert().getText();
System.out.println(se);
dr.switchTo().alert().accept();
dr.switchTo().defaultContent();
	}

}

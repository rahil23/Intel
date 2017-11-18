import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver dr= new FirefoxDriver();
dr.get("http://timesofindia.indiatimes.com/");
List< WebElement> frms= dr.findElements(By.tagName("iframe"));
System.out.println(frms.size());


for(int i=0; i<frms.size(); i++){
	dr.switchTo().frame(frms.get(i));
	System.out.println(i);
//}
//Iterator it= frms.iterator();
//while(it.hasNext()){
//	System.out.println(it.next());
}
	
	}

}

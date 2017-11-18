import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;



public class Down extends AbstractWebDriverEventListener{
	
	

	public void afterNavigateBack(WebDriver driver){
		System.out.println("hello");
	}
		
	

	
}

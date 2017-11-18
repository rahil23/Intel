import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Googlechecklinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr= new FirefoxDriver();
		dr.navigate().to("https://www.google.co.in/?gfe_rd=cr&ei=uhafVuWzH4HmugTx_rrwDQ&gws_rd=ssl");
		List<WebElement> webel= dr.findElements(By.tagName("a"));
		System.out.println(webel.size());
		
		String cururl= dr.getCurrentUrl();
		int j=0;
		for(int i=0; i<webel.size(); i++){
			if(webel.get(i).isDisplayed()){
			webel.get(i).click();
			Thread.sleep(5000);
			if(cururl.equals("https://www.google.co.in/?gfe_rd=cr&ei=uhafVuWzH4HmugTx_rrwDQ&gws_rd=ssl")){
				System.out.println("not able to navigate");
				
				
			}
			else{
				j++;
				System.out.println(dr.getCurrentUrl());
					
				dr.navigate().back();
				
					
				}
				
			}
			
			//System.out.println(j);
		}
		
		

	}

}

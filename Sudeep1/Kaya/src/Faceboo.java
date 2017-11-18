import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Faceboo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public void abc() throws IOException, InterruptedException{
		// TODO Auto-generated method stub
WebDriver driver= new FirefoxDriver();
driver.get("http://qtpselenium.com/home/login/Selenium");
ArrayList<String> username= readexel(0);
ArrayList<String> password= readexel(1);

for(int i=0;i<=username.size();i++){
	driver.findElement(By.xpath("html/body/main/div[2]/div/div/div[1]/div/div/div/form/div[1]/input")).sendKeys(username.get(i));
	//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(Keys.ENTER);
	
	driver.findElement(By.xpath("html/body/main/div[2]/div/div/div[1]/div/div/div/form/div[2]/input")).sendKeys(password.get(i));
	
	driver.findElement(By.xpath("html/body/main/div[2]/div/div/div[1]/div/div/div/form/div[2]/input")).sendKeys(Keys.ENTER);
	Thread.sleep(6000);
	//driver.findElement(By.xpath("html/body/main/div[2]/div/div/div[1]/div/div/div/form/div[2]/input")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/ul/li/a")).click();
	Thread.sleep(6000);
	driver.get("http://qtpselenium.com/home/login/Selenium");
	
	
}


	}
	
	public ArrayList<String> readexel(int colno) throws IOException{
		// TODO Auto-generated method stub
  FileInputStream fis= new FileInputStream("C:\\Users\\sudeepkumar\\workspace\\Kaya\\src\\Sudeep.xlsx.xlsx");
  
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  XSSFSheet sh= wb.getSheet("Sheet1");
	  Iterator<org.apache.poi.ss.usermodel.Row> it= sh.iterator();
	  it.next();
	  ArrayList<String> list= new ArrayList<String>();
	  while(it.hasNext()){
		  
		list.add(it.next().getCell(colno).getStringCellValue());
		  
	  }
	  System.out.println(list);
	  return list;
	}
	
	public static void main(String[] args) throws IOException, InterruptedException{
		Faceboo fb= new Faceboo();
		//fb.readexel(0);
		fb.abc();
		
	}

}

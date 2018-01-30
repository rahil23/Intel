package COnfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		
		
		Properties prop= new Properties(); //Prop will help to read to content
		//FileInputStream ip = new FileInputStream("C:\\Intel\\qqqqqq\\ReadingWritingfromTextFiles\\src\\COnfig\\Employee.properties");
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\Employee.properties");
		//FileInputtStrem will point to particulr file which need to be read
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("City"));
		System.out.println(prop.getProperty("Hobbies"));
		
		// # is for comment the property file
		
		
		
	}

}

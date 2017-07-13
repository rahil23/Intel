package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeyword {
	static int  a=9;
	
	public static void main(String[] args) throws FileNotFoundException  {
	
							Exception();
			
System.out.println("hello");			}
		
	
	public static  void Exception() throws FileNotFoundException 
	{
		File a = new File("");
		FileInputStream fio = new FileInputStream(a);
		
		//Thread.sleep(100);
	//	int c=a/0;
		System.out.println("hi");
		
	}
}

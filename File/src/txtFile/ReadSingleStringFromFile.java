package txtFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class ReadSingleStringFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\Intel\\qqqqqq\\File\\File.txt");
		
		FileReader reader = new FileReader(f);
		 StringBuilder result = new StringBuilder();
	        
		  String line = null;
		try {
		 BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
		 try {
	            line = in.readLine();
	            while (line != null) {
	            	System.out.println(line);
	            	if(line.contains("are"))
	            	{
	            		System.out.println(line.indexOf("are"));
	            	}
	            line=in.readLine();
	            }
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }

	        String rtn = result.toString();

	        	System.out.println(rtn);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
/*		Scanner sc = new Scanner(f);
		String st = "paragraph";
		int lineNo=0;
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			lineNo++;
			if(st.contains(line))
			{
				System.out.println(lineNo);
			}
		}
*/	}

}

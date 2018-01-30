import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingReadingWritingTextFIles {
	
	
	
	public static void main(String[] args) throws IOException {
		
		//create a file
		File f = new File("C:\\Intel\\qqqqqq\\ReadingWritingfromTextFiles\\temp.txt");
		f.createNewFile();
		
		
		// write something
		
		FileWriter w=new FileWriter("C:\\Intel\\qqqqqq\\ReadingWritingfromTextFiles\\temp.txt");
		//FileWriter
		BufferedWriter out = new BufferedWriter(w);
		//BUfferedWriter used to write faster in class
		out.write("This is the First Line");
		out.newLine();
out.write("This is 2nd Line");
out.flush();
//FLush command will flush the String into the FIle

		//read from that file
FileReader r = new FileReader("C:\\Intel\\qqqqqq\\ReadingWritingfromTextFiles\\temp.txt");
BufferedReader btr = new BufferedReader(r);
//System.out.println(btr.readLine()); // this will read first line only
String x="";
// so to overcome from issue(using readline() for each line in File, we wil use while or for loop


while((x=btr.readLine())!=null)
{
	System.out.println(x);
}






	}

	
	

}

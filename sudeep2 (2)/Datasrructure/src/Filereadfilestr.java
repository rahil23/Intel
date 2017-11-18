import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;


public class Filereadfilestr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input= new FileInputStream("C:\\java projectlink.txt");
		System.out.println("yes");
		
		FileOutputStream output= new FileOutputStream("C:\\writing.txt");
		
		byte[] buf= new byte[1024];
		int byteread;
		while((byteread=input.read(buf))>0){
			output.write(buf, 0, byteread);
			
		}

	}

	
}

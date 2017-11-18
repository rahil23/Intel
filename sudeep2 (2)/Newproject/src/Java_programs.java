import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Java_programs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   String input= "";
   
   InputStreamReader ip= new InputStreamReader(System.in);
   BufferedReader br= new BufferedReader(ip);
   System.out.println("enter the no");
  input= br.readLine();
     char[] ab=input.toCharArray();
      
     for(int i=ab.length-1; i>=0;i--){
    	 System.out.println(ab[i]);
     }
 
   
   
    
	}

}

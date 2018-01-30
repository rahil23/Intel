
import java.io.*;
import java.util.*;


public class TestClass 
{
    
    static final int totalchars = 256;
      

    static int findistinctLength(String str)
    {
        int n = str.length();
      
        
        int count = 0;
         
        boolean[] newArray = new boolean[totalchars];
        Arrays.fill(newArray, false);
        for (int i=0; i<n; i++)
        {
            if (newArray[str.charAt(i)] == false)
            {
                newArray[str.charAt(i)] = true;
                count++;
            }
        }
      
        
          return count;
    }
    
       

      
    
    public static void main(String args[])
    {
        String str = "aabcbcdbcae";
        System.out.println(findistinctLength(str));
               
    }
    
} 
    


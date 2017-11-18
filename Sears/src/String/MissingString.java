package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class MissingString {
	

	public static void main(String[] args) {
    
		
//-----------------------------------------------------------------------------
		
		    String str = "AHfB";

        System.out.println("String : " + str);

        findMissingChar(str);
    }

   
    private static void findMissingChar(String str) {
      
        str = str.toUpperCase();

       
        char[] charArray = str.toCharArray();

     
        Arrays.sort(charArray);

        printRange(charArray);

        System.out.println("Missing characters");

        for (int i = 0; i < charArray.length - 1; i++) {

           
            int charDiff = charArray[i + 1] - charArray[i];

            if (charDiff > 1) {

                 for (int j = 1; j < charDiff; j++) {
                    char c = (char) (charArray[i] + j);
                    System.out.print(c + " ");
                }
            }
        }
    }


    private static void printRange(final char[] charArray) {
        StringBuilder builder = new StringBuilder(30);
        builder.append("Range is from '").append(charArray[0]).append("' to '")
            .append(charArray[charArray.length - 1]).append("'");
        System.out.println(builder.toString());
    }
//------------------------------------------------------------------------------------------------------------------
		
}
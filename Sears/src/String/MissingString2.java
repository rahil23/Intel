package String;

import java.util.HashSet;
import java.util.Set;

public class MissingString2 {
	
	private final int ASCII_CODE_FOR_LETTER_A = 97;
	private final int ASCII_CODE_FOR_LETTER_Z = 122;
	  
	/**
	* Gets the missing letters of a sentence in lower case.
	* @param sentence
	* @return String having all the letters that the sentence is missing from the alphabet.
	*/
	public String getMissingLetters(String sentence){
	/*
	 * 1. Let's populate a set with the unique characters of the sentence.
	 *    This approach avoids having two nested for's in the code (better performance).
	 */
	Set<Integer> uniqueASCIICodes = new HashSet<Integer>();
	  
	for (char character : sentence.toLowerCase().toCharArray() ) {
	 if (character >= ASCII_CODE_FOR_LETTER_A
	   && character <= ASCII_CODE_FOR_LETTER_Z) { // Range of lower case letters.
	  uniqueASCIICodes.add((int)character);
	  
	  if (uniqueASCIICodes.size() == 26) {
	   break; // Sentence already covered all letter from the alphabet.
	  }
	 }
	}
	/*
	 * 2. Move in the range of ascii codes of lower case alphabet
	 * and check if letter was present in sentence.
	 */
	StringBuilder misingLettersBuilder = new StringBuilder();
	  
	for (int i=ASCII_CODE_FOR_LETTER_A; i <= ASCII_CODE_FOR_LETTER_Z; i++) {
	 if (!uniqueASCIICodes.contains(i)) {
	  misingLettersBuilder.append((char)i);
	 }
	}
	   return misingLettersBuilder.toString();
	}
	  
	public static void main(String[] args) {
	 
	   String case1 = "A quick brown fox jumps over the lazy dog";
	   String case2 = "bjkmqz";
	   String case3 = "cfjkpquvwxz";
	   String case4 = "";
	  
	   MissingString2 missingLetters = new MissingString2();
	  
	  System.out.println("Missing letters for[" + case1 + "]: " +
	  missingLetters.getMissingLetters(case1));
	  System.out.println("Missing letters for[" + case2 + "]: " +
	  missingLetters.getMissingLetters(case2));
	  System.out.println("Missing letters for[" + case3 + "]: " +
	  missingLetters.getMissingLetters(case3));
	  System.out.println("Missing letters for[" + case4 + "]: " +
	  missingLetters.getMissingLetters(case4));
	   }
	}


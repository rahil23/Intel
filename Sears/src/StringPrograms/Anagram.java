package StringPrograms;

import java.util.Arrays;

public class Anagram {

	
public static void main(String[] args) {
	
	String s = "rahil";
	String s2= "lirah";
	char c1[] = s.replaceAll("[//s]","").toLowerCase().toCharArray();
	char c2[] = s2.replaceAll("[//s]","").toLowerCase().toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	/*if(c1.equals(c2))*/

	
	if(Arrays.equals(c1, c2))
	{
		System.out.println("Strings are anagram");
	}
	else
	{
		System.out.println("String is not anagram");
	}
	
	
}
}

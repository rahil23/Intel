package Rough;

import java.util.Arrays;

public class Rough
{

public static void main(String[] args) {
	String S1 = "HI welcome";
	int len = S1.length();
	String s = "";
	for (int i = len-1; i >=0; i--) {
		s = s + S1.charAt(i);
		
	}
	System.out.println(s);
}
	
}
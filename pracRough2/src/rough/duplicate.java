package rough;

import java.util.HashMap;
import java.util.Map;

public class duplicate {
	/*public static void main(String[] args) {
		String s = "abbcaccba";
		int count =0;
		
		
		char temp = s.charAt(0);
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==temp)
			{
				count++;
			}
			else
			{
				System.out.println(temp+ " "+count);
			count=1;
			temp = s.charAt(i);
			}
			
			
		}
		
	}*/
	
	public static void main(String[] args) {
		String a = "opening a java editor";

	/*String[] c=	a.split(" ");
	
	String m = "";

	for (int i = 0; i < c.length; i++) {
		String reverse="";
		char ch[] = c[i].toCharArray();
		for (int j = ch.length-1; j >= 0; j--) {
		
			reverse=reverse+ch[j];
		}
		
		m=m+reverse;
		m=m+" ";
	}
	System.out.println(m);

	
	
	}
*/
		
		
	String sp[] = a.split(" ");
	String m="";
	for (int i = 0; i < sp.length; i++) {
		String rev="";
		char ch[]=sp[i].toCharArray();
		
		
		for (int j = ch.length-1; j >= 0; j--) {
			
		rev=rev+ch[j];	
		}
	m=m+rev;
	m=m+"  ";
	}
		System.out.println(m);
	}
}
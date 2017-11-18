package jabong;

public class ReverseString {
public static void main(String[] args) {
	String s = "india is great";
	char ch[] = s.toCharArray();
	String a="";
	for (int i = s.length()-1; i>=0; i--) {
		a=a+s.charAt(i);
		
	}
	
	System.out.println(a);
	
}
}

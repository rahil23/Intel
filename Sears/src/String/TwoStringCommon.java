package String;

public class TwoStringCommon {

	public static void main(String[] args) {
		String s = "Strong";
		char ch[]=s.toCharArray();
		String s1 = "String";
		int count=-1;
		for (int i = 0; i <= s.length()-1; i++) {
			count++;
			if(s.charAt(i)==s1.charAt(count))
			{
				System.out.println(ch[i]);
				
			}
		}
	}
}

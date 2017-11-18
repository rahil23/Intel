package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FetchString2 {

//------------------------------------------------------------------------------------------------
	/*	public static void main(String[] args) {
		String s1 = "abc23qr4rt5vf564fcd45ju6hcdx";
		
		
	
			
		
		Pattern pt = Pattern.compile("[a-zA-Z]");
		Matcher m = pt.matcher(s1);
		
		boolean b = m.lookingAt();
		
		if(b)
		{
			System.out.println("pattern matches"+m+ "    "+s1);
		}
		else
		{
			System.out.println("pattern didn't match");
		}
		
		
	}
}
*/
//----------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
String s2[] = {"we432","fr34","h43","3432"};

for (int i = 0; i <= s2.length-1; i++) {
	Pattern pt = Pattern.compile("[a-zA-Z]");
	Matcher mt  = pt.matcher(s2[i]);
	boolean res = mt.lookingAt();
	if(res)
	{
		System.out.println("pattern matches"+s2[i]);
		
	}
	else
	{
		System.out.println("pattern doesn't matched"+s2[i]);
	}
}
}
}
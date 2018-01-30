
public class nklcd {

	public static void main(String[] args) {
		
		int a = 1234;
		int b = 0;
		
		String newString = null;
		String s1 = Integer.toString(a);
		String s2 = Integer.toString(b);
		//System.out.println(s1+s2);
		
		int length=0;
		
		int length1 = s1.length();
		int length2 = s2.length();
		if(length1>length2)
		{
			length=length2;
		}
		else
		{
			length=length1;
		}
		String string="";
		for (int i = 0; i < length; i++) {
			
			string=string+s1.charAt(i)+""+s2.charAt(i);
			
		}
		int diff=0;
		if(length2>length1)
		 {
			diff=length2-length1;
		}
		else
		{
			 diff=length1-length2;
		}
		
		/*if(diff<0)
		{
			Math.abs(diff);
		}*/
		System.out.println(diff);
		
		if(s2.length()>s1.length())
		{
			string=string+s2.substring(length2-diff);	
		}
		else if(s1.length()>s2.length())
		{
			//System.out.println(length1-diff);
			string=string+s1.substring(length1-diff);
			//Integer f = Integer.parseInt(string);
		}
		System.out.println(Integer.parseInt(string));
		 
	}
}

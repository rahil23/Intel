package StringPrograms;

public class palindrome {

	public static void main(String[] args) {
		String s = "RADADAR";
		boolean flag=false;
		
		int n = s.length()-1;
		for (int i = 0; i <= n; i++) 
		{
			if(s.charAt(n)==s.charAt(i) )
			{
				n--;
			   flag=true;
			}
			else 
			{
				flag=false;
			  break;
			}
			
		}
		if(flag)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
		
	}
}

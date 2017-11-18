
public class Palindrome {
public static void main(String[] args) {
	String s="madam";
	int p = (s.length()-1);
	boolean flag= true;
	System.out.println(p/2);
	for(int i=0;i<=p/2;i++)
	{
		if(s.charAt(i)!=s.charAt(p))
		{
		flag=false;
		break;
	    }
		p=p-1;
	}
	if(flag)
	{
		System.out.println("String is palidrome");
	}
	else
	{
		System.out.println("String is not ppalindrome");
	}
	
}
}

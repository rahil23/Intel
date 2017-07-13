package StringPrograms;

public class LonegEleinArrayString {
	public static void main(String[] args) {
		
		String a[]={"abc","def","weerwe","ewq","ewfcdscxwefrc","dwsxefdsdwefwdwedxzqwd"};
		int len = a.length;
	int d=0;
	
	for(int i=0;i<len;i++)
	{
		if(a[i].length()>a[d].length())
		{
			d=i;
		}
		
	}
	System.out.println(a[d]);
		
	}
	

}

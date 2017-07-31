package StringPrograms;

import java.util.Scanner;

public class ReplaceVowel {

	public static void main(String[] args) 
	{
	
	/*{
			Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		String cd = s.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(cd);
		
	}*/
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = sc.next();
	char ch[] = str.toCharArray();
	int len =ch.length;
	
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='A'|| ch[i]=='E'|| ch[i]=='U'|| ch[i]=='O'|| ch[i]=='I')
		{
			for (int j = i; j < ch.length; j++) {
				if(j<ch.length-1)
				ch[j]=ch[j+1];
				
				if(j==(ch.length-1))
				{
					//RAHISystem.out.println("||||");
					ch[j]=' ';
				}
			}
			//System.out.println(ch[i]);
		}
	
	}
	
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	}
	
	
	
	
	
	
}
}

package Rough;

public class Rough2 {

	
	public static void main(String[] args) {
String a = "abcd";
String b = "dcnnncd";
char ch[] = a.toCharArray();
char ch2[] = b.toCharArray();

for(int i=0;i<ch.length;i++)
{
	for(int j=0;j<ch2.length;j++)
	{
		if(ch[i]==ch2[j])
		{
			System.out.println(ch[i]);
		}
	}
}

	
}}

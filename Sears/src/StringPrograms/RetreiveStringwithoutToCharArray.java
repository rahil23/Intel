package StringPrograms;

public class RetreiveStringwithoutToCharArray {

	public static void main(String[] args) {
		String s1= "TestCase";
		String s2[]= s1.split("");
		
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
	}}

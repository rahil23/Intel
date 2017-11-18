package String;

public class FetchString {

	public static void main(String[] args) {
		
		String s1="abc123cAd45fr3tr88$";
		
		char ch[] = s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
		if(!(s1.charAt(i)>='0' && s1.charAt(i)<='9'))
		{
			System.out.print(s1.charAt(i));
		}
			
		}
	}
}

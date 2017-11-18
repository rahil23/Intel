package String;

public class DuplicateChar {
	public static void main(String[] args) {
		String a= "abacadbcb";
		
		int temp = 0;
		for (int i = 0; i < a.length()-1; i++) 
		{
			
			char c = a.charAt(temp);
				if(c==a.charAt(i+1))
				{
					
					System.out.println(c);
				}
		}
		
		temp++;
	}
	

}

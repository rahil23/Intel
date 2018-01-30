
public class Test2 {

	public static void main(String[] args) {
		String s1 = "abccad";
		
		int len = s1.length();
		
		for (int i = 0; i <= s1.length()-1; i++) {
			char temp = s1.charAt(i);
			int count =0;
			for (int j = 0; j <= s1.length()-1; j++) {
				if(!(temp == s1.charAt(j)))
				{
					count++;
					
				}
				
			}
			
			System.out.println(count);
		}
		
	}
}

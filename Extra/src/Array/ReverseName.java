package Array;

public class ReverseName {
	
	public static void main(String[] args) {
		String r = "Rahil";
		
		//----------------------------------------------------------------------
		/*String rev=" ";
		for (int i = r.length()-1; i >= 0; i--) {
			rev=rev+r.charAt(i);
			
		}
		char c[] = rev.toCharArray();
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
			
		}*/
		
		//---------------------------------------------------------------------
		
		char ch[] = r.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			System.out.println(ch[i]);
			
		}
		
	}

}

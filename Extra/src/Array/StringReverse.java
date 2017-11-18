package Array;

public class StringReverse {
	public static void main(String[] args) {
		String a1 = "Java Editor provides you text";
	String ch[] = a1.split(" ");
	

String m = "";

		for (int i = 0; i < ch.length; i++) {
			String rev = "";
			
			char ch2[] = ch[i].toCharArray();
			for (int j = ch2.length-1; j >=0; j--) {
				rev = rev+ch2[j];
				
			
				
			}
			m=m+rev;
			m=m+" ";
			
		}
		System.out.println(m);
		
	}
	
	}



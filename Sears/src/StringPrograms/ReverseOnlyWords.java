package StringPrograms;

public class ReverseOnlyWords {
	/*public String reverse(String str) {

		String inter = "";
		String newstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			inter = inter + str.charAt(i);
		}

		System.out.println(inter);
		System.out.println("---------------");

		String[] arr = inter.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				String word = arr[i];
				for (int j = word.length() - 1; j >= 0; j--) {
					newstr += word.charAt(j);
				}
				newstr += " ";
			} else {
				newstr += arr[i] + " ";
			}
		}
		System.out.println(newstr);
		System.out.println("---------------");
		return newstr;
	}

	public static void main(String[] args) {
		String in = "I am a software programmer";
		r z = new r();
		z.reverse(in);
	}


*/
	
	
	/*public static void main(String[] args) {
		String a = "I am a software programmer";
		int len = a.length();
		String s = "";
		for (int i = len-1; i>=0; i--) {
			s=s+a.charAt(i);
			
		}
		System.out.println(s);
	}*/
	
	
	
	public static void main(String[] args) {
		String a = "opening a java editor";
		//int len = a.length();
	String[] c=	a.split(" ");
	/*for (int i = 0; i < c.length; i++) {
		System.out.println(c[i]);
	}*/
	
	String m = "";
//Wrong
		/*for (int j = c[j].length(); j >= 0; j--) {
			char ch[] = c[j].toCharArray();
			m=m+c[j].charAt(j);
		*/
	
	for (int i = 0; i < c.length; i++) {
		String reverse="";
		char ch[] = c[i].toCharArray();
		for (int j = ch.length-1; j >= 0; j--) {
		
			reverse=reverse+ch[j];
		}
		
		m=m+reverse;
		m=m+" ";
	}
	System.out.println(m);
		/*String m ="amitab";
		String rev = "";
		char ch[] = m.toCharArray();
		for (int i = ch.length-1; i >=0; i--) {
			
			rev = rev+m.charAt(i);
			
			
		}
		System.out.println(rev);
		}
*/	

	
	}
	
	
	/*public static String wordReverse(String word)
	{
		String reverse="";
		char ch[] = word.toCharArray();
		for (int j = ch.length-1; j >= 0; j--) {
		
			reverse=reverse+ch[j];
		}
		return reverse;
	}*/
 
}
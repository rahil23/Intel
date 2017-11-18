package String;

public class FindSubString {


	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "babbabggabab";
			String Substr = "ab";
				int count = 0;
		/*for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
		}*/
		
				
		int index=str.indexOf("ab");
		while(index>=0)
		{
		System.out.println("Start : "+index);
		System.out.println("last : "+index+Substr.length());
		index=str.indexOf(Substr, index+Substr.length());
		count++;
		}
		
System.out.println("No. of repetitions : "+count);
			
			
		}
	}



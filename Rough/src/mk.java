
public class mk {

	public static void main(String[] args) {
		String s = "Forget  CVs..Save time . x x";
		 
		int maxWordLength=0;
		String[] ch = s.split("[,.?]");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			
			ch[i] = ch[i].replaceAll("  ", " ");
			String[] word =ch[i].trim().split(" ");
			
			if(maxWordLength<=word.length)
			{
				for (int j = 0; j < word.length; j++) {
					System.out.println(word[j] + " "+word.length);
				}
				
				maxWordLength=word.length;
				
			
			}
			
				
			
		}
	
		System.out.println(maxWordLength);
		
	}
}

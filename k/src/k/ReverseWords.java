package k;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "Mobile India Private Limited bbsbs sasak ashajshaj ashja sh ashka";
		int j;
		int y = str.length() - 1;
		int k = y;
		for (int i = y; i >= 0; i--) {
			if (str.charAt(i) == ' ' || i == 0) {
				if (i == 0)
					System.out.print(str.charAt(i));
				for (j = i + 1; j <= k; j++) {
					System.out.print(str.charAt(j));
				}
				if (i != 0)
					System.out.print(" ");
				k = i - 1;
			}
		}
		
		//o/p : ashka sh ashja ashajshaj sasak bbsbs Limited Private India Mobile
		//-------------------------------------------------------2nd approach
	
		/*String str = "Mobile India Private Limited bbsbs sasak ashajshaj ashja sh ashka";
		char ch[] = str.toCharArray();
		String s = "";
		for (int i = ch.length-1; i >=0; i--) {
			s=s+str.charAt(i);
			
		}
		System.out.println(s);
		
		//o/p: akhsa hs ajhsa jahsjahsa kasas sbsbb detimiL etavirP aidnI eliboM
		*/
	}
	


}

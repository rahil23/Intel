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
	}


}

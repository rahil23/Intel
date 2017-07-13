package k;

public class LongestPalindrome {
	public class LongestPalindromeString {

		public String longestPalindrome(String s) {
			String longestPalindrome = "";
			for (int i = 0; i < s.length(); i++) {
				for (int j = s.length() - 1; j >= 0 && j != i; j--) {
					if (isPalindrome(s.substring(i, j + 1))) {
						if (s.substring(i, j + 1).length() > longestPalindrome
								.length()) {
							longestPalindrome = s.substring(i, j + 1);
						}
					}
				}
			}
			return longestPalindrome;
		}

		public boolean isPalindrome(String s) {
			int end = s.length() - 1;
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) != s.charAt(end)) {
					return false;
				}
				end--;
			}
			return true;
		}

		public String getLongestPalindrome(final String input) {
			int rightIndex = 0, leftIndex = 0;
			String currentPalindrome = "", longestPalindrome = "";
			for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
				leftIndex = centerIndex - 1;
				rightIndex = centerIndex + 1;
				while (leftIndex >= 0 && rightIndex < input.length()) {
					if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
						break;
					}
					currentPalindrome = input.substring(leftIndex, rightIndex + 1);
					longestPalindrome = currentPalindrome.length() > longestPalindrome
							.length() ? currentPalindrome : longestPalindrome;

					leftIndex--;
					rightIndex++;
				}
			}
			return longestPalindrome;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE";
			LongestPalindromeString obj = new LongestPalindromeString();
			String longestPalindrome = obj.longestPalindrome(str);
			System.out.println("First Implementation longestPalindrome : "
					+ longestPalindrome);
			System.out
					.println("---------------------------------------------------");
			String longestPalindromeOther = obj.getLongestPalindrome(str);
			System.out.println("Second Implementation getLongestPalindrome : "
					+ longestPalindromeOther);

		}

	}

}


public class equilteral {

	public static void main(String[] args) {
		int n = 20;
		for (int i = 1; i < n; i += 2) {

			
			for (int j = n; j > i; j=j-2) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

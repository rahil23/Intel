package k;
public class ZigZag {

	public String reverse(String str) {

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
		String in = "Hello Bro How Are you";
		ZigZag z = new ZigZag();
		z.reverse(in);
	}
}


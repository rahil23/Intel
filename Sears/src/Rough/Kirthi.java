package Rough;

public class Kirthi {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			String str = "ABCD";
			char[] ch = str.toCharArray();

			for (int i = 0; i < ch.length; i++) {
				int Ascii_val = (int) ch[i];

				Ascii_val = Ascii_val + 2;
				ch[i] = (char) Ascii_val;
			}
			
			str = new String(ch);
			System.out.println(str);

		}



}

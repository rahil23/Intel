package k;

import java.util.HashMap;

public class Compress {
	

		// String str = "aaabbccd";
		// Output Should be a3b2c2d1

	public void compressString(String str) 
	{

		HashMap hm = new HashMap();

		for (int j = 0; j < str.length(); j++) 
		{
			char temp = str.charAt(j);
			int count = 0;
			for (int i = 0; i < str.length(); i++) 
			{
				if (str.charAt(i) == temp) 
				{
					count++;
				}

			}
			hm.put(temp, count);

		}

		System.out.println(hm);
	}

	
	/*public void compressString2(String str) {

		

		for (int j = 0; j < str.length(); j++) {
			char temp = str.charAt(j);
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == temp) {
					count++;
				}

			}
			System.out.println(temp+":"+count);

		}

		
	}

	
	public void compressString3(String str) {

		

		for (int j = 0; j < str.length(); j++) {
			char temp = str.charAt(j);
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == temp) {
					count++;
				}

			}
			if(count>1)
			System.out.println(temp+": is dublicate");

		}

		
	}	
	
	public void compressString4(String str) {

		HashMap hm = new HashMap();

		for (int j = 0; j < str.length(); j++) {
			char temp = str.charAt(j);
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == temp) {
					count++;
				}

			}
			if(count>1)
			hm.put(temp, count);

		}

		System.out.println(hm +" all are dublicate");
	}
*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Compress comp = new Compress();
			String str = "abbaaabbcccad";
			comp.compressString(str);

		}

	}



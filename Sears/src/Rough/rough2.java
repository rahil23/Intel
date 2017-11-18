package Rough;

import java.util.HashMap;

public class Rough2 {

	public static void main(String[] args) {

		HashMap map = new HashMap<>();
		String s = "abaacbbadadb";
		for (int i = 0; i < s.length(); i++) {

			int count = 0;
			char temp = s.charAt(i);
			if (map.containsKey(temp)) {
				System.out.println("Already calculated "+temp);
			} else {
				System.out.println(" calculating "+temp);
				
				for (int j = 0; j < s.length(); j++) {
					if (temp == s.charAt(j)) {
						count++;

					}

				}
				map.put(temp, count);
				
			}
		
		}
		System.out.println(map);

	}
}

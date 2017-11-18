package Rough;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Kirthi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str = "This is a Good Boy This is a Good Boy This is a Good Boy This is a Good Boy This is a Good Boy";
		String sp[] = str.split(" ");
		String fn = "Good";
		
		Map<String,List> map = new HashMap();
		
		List objset = new ArrayList();
		{
for (int i = 0; i < sp.length; i++) {
	if(fn.equals(sp[i]))
	{
	objset.add(i);
	}
}
System.out.println(objset);

		}
		map.put(fn, objset);
System.out.println(map);
		
}
		
		/*String str = "This is a Good Boy This is a Good Boy This is a Good Boy This is a Good Boy This is a Good Boy";
		String[] strArray = str.split(" ");
		String Finder = "Good";
		
		
		Map<String, List<Integer>> hmap = new HashMap<String, List<Integer>>();

		for (int i = 0; i < strArray.length; i++) {

			if (!hmap.containsKey(strArray[i])) {
				hmap.put(strArray[i], new ArrayList<Integer>());
				List<Integer> arrlist = hmap.get(strArray[i]);
				arrlist.add(i+1);
				hmap.put(strArray[i], arrlist);

			} else {
				List<Integer> arrlist = hmap.get(strArray[i]);
				arrlist.add(i+1);
				hmap.put(strArray[i], arrlist);
			}
		}

		Set<String> keys = hmap.keySet();
		for (String ch : keys) {
			if (ch.contains(Finder))
				System.out.println(ch + " : " + hmap.get(ch));
		}
	}*/

}

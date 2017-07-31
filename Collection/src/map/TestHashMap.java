package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		
		Map<String, String> map= new HashMap();
		
		map.put("India", "Delhi");
		map.put("US", "W DC");
		map.put("Japan", "Tokyo");
		
		
		System.out.println(map.get("US"));
		
		
		Set<String> set=map.keySet();
		System.out.println(set);
		
		//Iterate Set  Method 2 using Using		
	Iterator<String>	 iterate  =  set.iterator();
	while(iterate.hasNext())
	{
		String key=iterate.next();
		System.out.println(key+"  "+map.get(key));
		//System.out.println(key);
	}

		
		
		
		
	}
}



//Iterate Set   Method 1 using for loop
		/*for(String str : set)
		{
			System.out.println(str);
			
		}*/
		
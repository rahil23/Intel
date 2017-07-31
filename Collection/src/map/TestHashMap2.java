package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap2 {

	public static void main(String[] args) {

		Map<String, Set> stateKamap = new HashMap();

		Set<String> punjabKicity = new HashSet<>();

		punjabKicity.add("Jalandar");
		punjabKicity.add("Luthiana");
		punjabKicity.add("Amritsar");

		Set<String> HaryanaKicity = new HashSet<>();

		HaryanaKicity.add("Panipat");
		HaryanaKicity.add("Karnal");
		HaryanaKicity.add("Sonipat");
		
		Set<String> KarnatakaKicity = new HashSet<>();

		KarnatakaKicity.add("Bangalore");
		KarnatakaKicity.add("Hasan");
		KarnatakaKicity.add("Hobli");
		
		stateKamap.put("Punjab", punjabKicity);
		stateKamap.put("Haryana", HaryanaKicity);
		stateKamap.put("Karnataka", KarnatakaKicity);
		
		System.out.println(stateKamap);
		
	System.out.println(stateKamap.get("Punjab"));
	
	Set set=stateKamap.get("Karnataka");
	
	
	Iterator cities= set.iterator();
		while(cities.hasNext())
		{
			System.out.println(cities.next());
		}
		
	}
}

// Iterate Set Method 1 using for loop
/*
 * for(String str : set) { System.out.println(str);
 * 
 * }
 */

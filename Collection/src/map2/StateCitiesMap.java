package map2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class StateCitiesMap {
	public static void main(String[] args) {
		
		Set<String> punjabKicities = new HashSet();
		punjabKicities.add("jalandhar");
		punjabKicities.add("ludhiana");
		punjabKicities.add("amritsar");
		
		Set<String> Upkicities = new HashSet();
		Upkicities.add("banaras");
		Upkicities.add("lko");
		Upkicities.add("allahabad");
		
		Set<String> HPkiCities = new HashSet();
		HPkiCities.add("dharamshala");
		HPkiCities.add("kangra");
		HPkiCities.add("hamirpur");
		
		Map<String,Set> allcities = new HashMap();
		allcities.put("Punjab", punjabKicities);
		allcities.put("HP", HPkiCities);
		allcities.put("UP", Upkicities);
		System.out.println(allcities);
		
		System.out.println(allcities.get("Punjab"));
		
		Set<String> keyValue = allcities.keySet();
		System.out.println(keyValue);
		//Iterator<String> it = keyValue.iterator();
		
		java.util.Iterator<String> it = keyValue.iterator();
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println("key is "+key+ "Corresponding city is : "+allcities.get(key));
			Set<String> citiesSet = allcities.get(key);
			java.util.Iterator<String> cityiterator = citiesSet.iterator();
			while (cityiterator.hasNext()) {
			String City = cityiterator.next();
				System.out.println(key+" " +City);
				
			}
			
		}
		
		
		
		
		//punjabkicities.put("punjab","jalandhar");
		
		
	}

}

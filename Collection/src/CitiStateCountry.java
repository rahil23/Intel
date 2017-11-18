import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CitiStateCountry {
	
	public static void main(String[] args) {
		 
		Set<String> karnatakacities = new HashSet();
		karnatakacities.add("jbangalore");
		karnatakacities.add("hassan");
		karnatakacities.add("hubli");
		karnatakacities.add("kolar");
		karnatakacities.add("belagum");
		karnatakacities.add("chitradurga");
		karnatakacities.add("mysore");
		
		Set<String> punjabcities = new HashSet();
		punjabcities.add("jalandhar");
		punjabcities.add("lushiana");
		punjabcities.add("patiala");
		punjabcities.add("amritsar");
		punjabcities.add("batala");
		
		
		Map<String,Set> stateCitiMap = new HashMap();
		stateCitiMap.put("karnataka", karnatakacities);
		stateCitiMap.put("punjab", punjabcities);
		
		//System.out.println(stateCitiMap);
		
		Map<String,Map> CountryState = new HashMap();
		CountryState.put("India", stateCitiMap);
		CountryState.put("India", stateCitiMap);
		
		System.out.println(CountryState);
		serachstateforCity(stateCitiMap, "batala");
		
	}
	
	
	public static void serachstateforCity(Map<String,Set> CountryState,String city)
	{
		
		
	}

}

package map;

import java.util.HashMap;

public class SampleHashMap {
	public static void main(String[] args) {
		HashMap obj = new HashMap();
		
		obj.put(1, 'q');
		obj.put(2, "wre");
		obj.put(3,"23");
		obj.put(4, 'e');
		
		System.out.println(obj.size());
		System.out.println(obj.containsKey(2));
		System.out.println(obj.containsValue('e'));
		System.out.println(obj.get(1));
		System.out.println(obj.isEmpty());
		System.out.println(obj.remove(4));
		System.out.println(obj.replace(3, "replaced"));
		//System.out.println(obj.get(3));
		
		System.out.println(obj);
		
		
		
	}

}

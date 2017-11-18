package set;

import java.util.HashSet;

public class SetNUll {
	
	public static void main(String[] args) {
		HashSet obj = new HashSet();
		obj.add(null);
		obj.add(1);
		obj.add(2);
		obj.add(null);
		obj.add(3);
		obj.add(4);
		
		System.out.println(obj);
		
	}

}

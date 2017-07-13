package set;

import java.util.HashSet;
import java.util.Iterator;

public class Collection {
public static void main(String[] args) {
	HashSet obj = new HashSet();
	obj.add(1);
	obj.add(3);
	obj.clear();
	obj.add(3);
	obj.add(4);
	obj.add(5);
	obj.remove(3);
	obj.removeAll(obj);
	

	
	/*HashSet<String> obj2 = new HashSet<String>();
	obj2.add("q");
	obj2.add("w");
	obj2.add("E");
	obj2.add("R");
	obj2.add("t");
	
	Iterator<String> it2 = obj2.iterator();
	while(it2.hasNext())
	{
		System.out.println(it2.next());
	}
	
	obj.addAll(obj2);*/
	
	Iterator it = obj.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
}
}

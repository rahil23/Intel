package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOtherFunction {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("mani");
		al.add("karan");
		al.add("harsha");
		al.add("pankaj");
		
		al.remove(1);
		al.remove("harsha");
		System.out.println(al.isEmpty());
		System.out.println(al.contains("mani"));
		
		for (Object obj : al)
		{
			System.out.println(obj);
		}
		
		
		ArrayList l2 = new ArrayList();
		l2.add("india");
		l2.add("goa");
		l2.add("delhi");
		l2.add("mumbai");
		l2.add("punjab");
		System.out.println("Going to add other Collection");
		l2.addAll(al);
		
		
		Iterator it2 = l2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
			
		}
		System.out.println(l2.hashCode());
		l2.clear();
		Iterator it3 = l2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it3.next());
			
		}
		
	}
}

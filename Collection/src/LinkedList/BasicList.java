package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class BasicList {
	
	public static void main(String[] args) {
		//creating object of linked list
		LinkedList<Integer> object = new LinkedList<Integer>();
		
		//Adding Elements to linked list
		object.add(1);
		object.add(3);
		object.add(1);
	
		object.add(2);
		
	
		object.add(1);
		object.add(3);
		
		object.add(4);
		object.add(5);
		object.add(3);
		object.add(6);
		object.add(7);
		
		object.remove(2);   // 2 is index here
		
		object.addFirst(7);  // Inserting element @ First
		
		object.addLast(8);  ///Inserting element @ last
		
		System.out.println("linked List : "+object);
		
		
		/*Iterator it = object.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
*/
		
	object.remove(3);   // 3 is the Index
	object.remove(7);    // 7 is the object/element
	object.removeFirst();
	object.removeFirstOccurrence(3);
	object.removeLast();
	object.removeLastOccurrence(3);
	
	System.out.println(object);
		
	
	System.out.println("List contains"+object.contains(4));
	System.out.println("List contains"+object.contains(1));
	
	System.out.println("size of list is"+object.size());
	
	System.out.println("Element returned by get on 2nd Index"+object.get(2)+object.getFirst()+object.getLast());
System.out.println("Element is setting to List"+object.set(2, 4));
	}

}

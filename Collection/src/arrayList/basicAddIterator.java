package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class basicAddIterator {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("rahul");
		al.add("karan");
		al.add("varun");
		al.add("ravi");
		
	
			Iterator it= al.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next());
		}
		
		
		
		
	}
	

}

//String automaticly in implements COmparable and overrirde compareTO
package set;


import java.util.Iterator;
import java.util.TreeSet;



public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet<String> obj = new TreeSet<String>();
		obj.add("AA");
		obj.add("aa");
		obj.add("AA");
		obj.add("AB");
		obj.add("ABC");
		System.out.println(obj);
		
Iterator it = obj.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
		
	}

}

//AutoBoxing and Boxing is ccalled conversion pf primitive to object conversion.
//here object means Wrapperclasses. 

package PrimiTOObject;

public class Autoboxing {
public static void main(String[] args) {
	int a=20;
	Integer obj = a; // Autoboxxing... now compiler will write INteger.ValueOf(a) internally
	
	Integer obj2 = Integer.valueOf(a); //this is 2nd way of converting. we are explicitly converting int(primitive) to object(Integer)
	
}
}

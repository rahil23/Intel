package ObjToPrimi;

public class UnBoxing {
	public static void main(String[] args) {
		Integer a = new Integer(3);   // creating wrapper class object
		
		int i = a.intValue(); // Unboxing(explicitly), XXValue() is method to convert object to primitive
		
		Float b = new Float(3.3f);
		float j = b.floatValue(); // Unboxing(explicitly), XXValue() is method to convert object to primitive
		
		
		int aa = a;// //unboxing, now compiler will write a.intValue() internally 
		
		
		
		
		
		 
	}

}

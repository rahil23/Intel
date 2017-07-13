package Basic;

public class Runtime {
	
public static void main(String[] args) {
	int a=5;
	try{
		System.out.println("inside Try Catch before Exception");
		System.out.println(a/0+"Arihtmatic Exception"); //if a/0 then all statement including Exception below Exception Statement will not run
		System.out.println("After Exception"); 
		}
	catch(Exception e)
	{
	System.out.println("hi"); // Catch block will only Execute when any Exception occur]
	
	try {
		System.out.println(a/0);
	} catch (Exception e2) {
		System.out.println("Exception becoz of Nested Catch");
	}

	}

}

}

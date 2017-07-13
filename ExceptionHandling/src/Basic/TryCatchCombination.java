package Basic;

public class TryCatchCombination {

	public static void main(String[] args) {
		try{
			System.out.println("before Exception");
			System.out.println(5/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception");
		}
		catch (Exception e) {   // if child Exception is created then Exception object will not run
			System.out.println("Exception1");	
		}
finally {
	System.out.println("done");
}		
		/*catch (Exception e2) {   // in Tey Catch . there can't be 2 objects of Exception.COmpileTImeError
System.out.println("Exception2");
		}*/
	}
}

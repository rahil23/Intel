package Basic;

public class Finally {

	public static void main(String[] args) {
	
//----------------------------------------------------
		
		//finallly will come @ last only
		/*try {
			System.out.println(5/0);
			} 
finally {}   // Error. FInally can't b/w try n catch
		catch (Exception e) {
			System.out.println("Exception came");
		}*/

//-------------------------------------------------------------------------------------------
	// can't 2 finally	
		try {
			System.out.println("hi");
		} 
		finally{
			System.out.println("finally1");
		}
		/*finally {             // there can't be 2 finally
			System.out.println("finally2");
		}*/   
		
		//---------------------------------------------------------------------------------
	
		       //Can't 2 try
		
		/*try {
			System.out.println(5/0);
		} 
		try {
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}*/
		
	//---------------------------------------------
		//-----try and finally is possible
		try {
			System.out.println(5/0);
		} finally {
			System.out.println("hi");
		}
		
//---------------------------------------------------		
		
	}
}

package CustomException;

import java.util.Scanner;

public class CreateExtendException {
	public static void main(String[] args) {
		
	
	System.out.println("Enter your rollnumber :");
	Scanner sc = new Scanner(System.in);
	String rollNo = sc.next();
	if(rollNo==null||rollNo.trim().isEmpty() ||rollNo.equals("null"))
{
		try {
			throw new extendsException("Not a valid rollnumber");
		} catch (extendsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}

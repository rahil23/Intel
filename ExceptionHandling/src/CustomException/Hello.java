package CustomException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Enter your rollnumber :");
		Scanner sc = new Scanner(System.in);
		String rollNo = sc.next();
		if(rollNo==null||rollNo.trim().isEmpty() ||rollNo.equals("null"))
{
			throw new CreateCustomException("Not a valid rollnumber");
		}
	}

}

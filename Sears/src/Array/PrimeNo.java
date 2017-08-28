package Array;

import java.util.Scanner;

public class PrimeNo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		
		boolean flag=false;
		
		
		
		for (int i = 2; i < n-1; i++) {
			
			if(n%i!=0)
			{
				//
				
			}
			else
			{
				System.out.println(n+" No is not prime");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(n+"No is prime");
		}
		
	}

}
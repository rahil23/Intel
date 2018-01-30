package Array;

import java.util.Scanner;

public class OddEvenOtherCondition {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		while(n>1)
		{
			n=n-2;
		}
		if(n==0)
		{
			System.out.println("No is even");
		}
		else
		{
			System.out.println("No is odd");
		}
	}

}

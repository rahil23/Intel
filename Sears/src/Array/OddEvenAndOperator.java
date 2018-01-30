package Array;

import java.util.Scanner;

public class OddEvenAndOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if((n & 1) ==0)
		{
			System.out.println("Number is even : "+n);
		}
		else
		{
			System.out.println("Number is Odd : "+n);
		}
	}
}

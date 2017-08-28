package Rough;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Rough
{	static int a=0;


	static int b=1;
static int fibbo;
static int n;
		static int count=0;
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	 n = sc.nextInt();
	for (int i = 1; i < n; i++) {
	//	System.out.println(fibbo(i));
		
	}
	
	System.out.println(fibbo(0,1));
}

private static int fibbo(int i, int j ) {
	
	if(count==n)
	{
		return j;
	}
	System.out.println(i);
	count++; 
	return fibbo(j,i+j);
}	
}
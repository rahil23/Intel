package StringPrograms;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
	int a,t,b,c,temp,f;
	
	if(n>0)
	{
		a=n%10;
		t = n/10;
		b=t%10;
		c=t/10;
		
		f=a*a*a+b*b*b+c*c*c;
		
		if(f==n)
		{
			System.out.println("no is armstrong");
		}
		else
		{
			System.out.println("no is not armstrong");
		}
	}
	
	}

}

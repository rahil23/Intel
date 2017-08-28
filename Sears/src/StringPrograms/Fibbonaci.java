package StringPrograms;

import java.util.Scanner;

public class Fibbonaci {
	public static void main(String[] args) {
		int s1 = 0;
		int s2=1;
		int s3;
		for (int i = 0; i < 20; i++) {
			s3=s1+s2;
			System.out.println(s3);
			s1=s2;
			s2=s3;
		}
		
	}


	
/*	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nmber");
		int res = sc.nextInt();
		for (int i = 0; i < res; i++) {
			if(i==0)
			{
				System.out.println(a);
			}
			
			if(i==1)
			{
				System.out.println(b);
			}
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}*/
		
		
	}
	
	
	
	
	
	

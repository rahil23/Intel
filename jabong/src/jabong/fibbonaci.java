package jabong;

import java.util.Scanner;

public class fibbonaci {
	
	public static void main(String[] args) {
		
	int a=0,b=1;
	int c;
	
	Scanner sc  =new Scanner(System.in);
System.out.println("Enter the number");
	int n = sc.nextInt();

	for (int i = 0; i <= n; i++) {
		
		c=a+b;
	
		
	System.out.println(c);
	a=b;	
	b=c;
		
	}
	
}
}

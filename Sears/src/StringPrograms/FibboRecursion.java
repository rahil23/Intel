package StringPrograms;


	import java.util.Scanner;

	class calc
	{
	 int fibo(int n)
	 {
	  if(n==0)
	   return 0;
	  if(n==1)
	   return 1;
	  else
	   return fibo(n-1)+fibo(n-2);
	  
	  //fibo(4)+fibo(3)
	  //fibo(3)+fibo(2)+fibo(2)+fibo(1)
	  //fibo(2)+fibo(1)+fibo(1)+fibo(0)+fibo(1)+fibo(0)+1
	  //fibo(1)+fibo(0)+1+1+0+1+0+1
	  //1+0+5
	  
	 }
	}
	public class FibboRecursion
	{
	 public static void main(String[] args)
	 {  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter fibonacci Term :");
	  int n=sc.nextInt();
	  System.out.println("Fibonacci Series is :\n");  
	  calc c=new calc();  
	  for(int i=0;i<n;i++)
	  {
	  System.out.print("   "+c.fibo(i)); 
	  }
	 }


}

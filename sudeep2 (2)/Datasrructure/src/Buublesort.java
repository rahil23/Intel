import java.util.Scanner;


public class Buublesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of items to be sorted");
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]= sc.nextInt();
		}
   for(int i= 0;i<(n-1);i++){
	   for(int j=0;j<(n-1-i);j++){
		   if(arr[j]>arr[j+1]){
			   int temp= arr[j+1];
			   arr[j+1]= arr[j];
			   arr[j]= temp;
		   }
	   }
   }
   for(int i=0;i<n; i++){
	   System.out.println(arr[i]);
   }
	}
 
}

import java.util.Scanner;


public class Missingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1, 2,4,5,7,8,9};
	//	Scanner sc= new Scanner(System.in);
		//System.out.println("Enter nos");
		//int a= sc.nextInt();
		
		
		find(a);
		

	}
	private static void find(int[] a){
		for(int i=1; i<7;i++){
			
			if(1+a[i-1]<a[i]){
				System.out.println(a[i-1]+1);
			}
		}
		
	}

}

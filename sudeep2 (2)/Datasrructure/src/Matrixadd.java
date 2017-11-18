import java.util.Scanner;


public class Matrixadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows= sc.nextInt();
		
		System.out.println("enter no of col");
		int col= sc.nextInt();
		 
		
		int a[][]= new int[rows][col];
		int b[][]= new int[rows][col];
		int c[][]= new int[rows][col];
		
		System.out.println("enter 1st matrix");
		for(int i=0; i<rows;i++){
			for(int j=0;j<col;j++){
				a[i][j]= sc.nextInt();
			}
		}
System.out.println("enter 2nd matrix");
for(int i=0; i<rows;i++){
	for(int j=0;j<col;j++){
		b[i][j]= sc.nextInt();
	}
}
 System.out.println("sum is");
 for(int i=0; i<rows;i++){
	 for(int j=0;j<col;j++){
		 c[i][j]= a[i][j]+ b[i][j];
	 }
 }
 
 System.out.println("printing sum");
 for(int i=0; i<rows;i++){
	 for(int j=0; j<col; j++){
		 System.out.println(c[i][j]);
	 }
 }

	}

}

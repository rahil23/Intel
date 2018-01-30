package Array;

public class Matrix {
	public static void main(String[] args) {
		int a[][]={ {0,0},{0,1},{1,0},{1,1}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("["+i+" "+j+"] ");
				System.out.println(a[i][j]+" ");
				
			}
			System.out.println("\n");
			
		}
	}

}

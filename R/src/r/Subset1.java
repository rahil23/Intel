package r;

public class Subset1 {
	
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		int sumexpected = 9;
		for (int i = 0; i < a.length-1; i++) {
			
			{
				for (int j = 0; j < a.length-1; j++) {
					
					if(a[i]+a[j]==sumexpected)
					{
						System.out.println(a[i]+","+a[j]);
					}
				}
			}
			
		}
	}
	
	

}

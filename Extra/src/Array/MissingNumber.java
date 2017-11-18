package Array;

public class MissingNumber {
	
	/*public static void main(String[] args) {
		int a[] = {1,2,4,5,6,7};
		int len = a.length;
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] != (i+1))
			{
				System.out.println("missing no"+(i+1));
				break;
			}
			
			
		}
	}
*/
	
	
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
package jabong;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]={3,2,7,5,1,8,9,33,22,55};
		int len = a.length;
		int temp;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				
				if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
					
				}
				
			}		
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}

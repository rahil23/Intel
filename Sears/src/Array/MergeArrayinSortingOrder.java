package Array;

public class MergeArrayinSortingOrder {
	public static void main(String[] args) {
		int a[]={12,22,33,44,55,66};
		int b[]={11,32,34,45};
		int c[] =new int[a.length+b.length]; 
	
	
		int count =0;
		for (int i = 0; i < a.length; i++) {
			
			c[count]=a[i];
			count++;
			
		}
		for (int i = 0; i < b.length; i++) {
		c[count]=b[i];
			count++;
			
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		int temp=0;
		for (int i = 0; i < c.length-1; i++) {
			for (int j = 0; j < c.length-1; j++) {
				if(c[j]>c[j+1])
				{
					temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;

					}
				
			}
			
		
		}
for (int i = 0; i < c.length; i++) {
	System.out.print(c[i]+" ");
}
}
}
package intr;

public class sumSeries {
	public static void main(String[] args) {
		
		int a[]={1,2,3,3,4,5};
		int end = a.length-1;
		int sum=0;
		
		for (int i = 0; i <= a.length-1;) {
			
			sum = a[i]+a[end];
			
			if(sum>7)
			{
				end--;
			}
			else if(sum<7)
			{
				i++;
			}
			else if(sum==7)
			{
				System.out.println(a[i]+" "+a[end]);
				end--;
			}
			
		}
	}

}

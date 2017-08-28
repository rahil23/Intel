package sort;

public class rough {
	
	public static void main(String[] args) {
		int a[] = {13,2,144,22,31,12};
	int temp;
	int minValue = 0;
		
		for(int i=0;i <a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				minValue = a[j];
				if(minValue>a[j+1])
				{
					minValue=a[j+1];
				}
				
			}
			
	temp = minValue;
	minValue=a[i];
	a[i]=temp;
	
	
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}

}

package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {120,2,13,22,21,4,1,5}; 
		int len = a.length;
		int temp=0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;i<len-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		System.out.println(a[i]);
		}
		
	}
}

package sort;

public class SelectionSort {
	public static void main(String[] args) {
		
		int a[] ={11,23,4,22,12,5,2,18};
		sortDsc(a);
		int len = a.length;
		/*for (int i = 0; i < len; i++) {
			int minValue = i;
			
			for (int j = i; j < len; j++) {

				{
					if(a[j]<a[minValue])
						minValue=j;
				}
				
				int temp = a[minValue];
				a[minValue] = a[j];
				a[j]=temp;
				
			}
			//System.out.println(a[i]);
						
		}
*/		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void sortAsc(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		
		for (int i = 0; i < a.length; i++) {
			int min=i;
			for (int j = i; j < a.length; j++) {
				if(a[min]>a[j])
				{
					System.out.println(a[min]+" is greater than "+a[j]);
					min=j;
				}
			}
			if(min!=i)
			{
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			}
			
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}

	
	public static void sortDsc(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		
		for (int i = 0; i < a.length; i++) {
			int min=i;
			for (int j = i; j < a.length; j++) {
				if(a[min]<a[j])
				{
					System.out.println(a[min]+" is greater than "+a[j]);
					min=j;
				}
			}
			if(min!=i)
			{
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			}
			
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}


}

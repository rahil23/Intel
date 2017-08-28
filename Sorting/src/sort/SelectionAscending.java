package sort;

public class SelectionAscending {
	public static void main(String[] args) {
		int a1[] ={11,23,4,22,12,5,2,18};
		
			for (int i = 0; i < a1.length; i++) {
				int min=i;
				for (int j = i; j < a1.length; j++) {
					if(a1[min]>a1[j])
					{
						//System.out.println(a1[min]+" is greater than "+a1[j]);
						min=j;
					}
				}
				if(min!=i)
				{
				int temp=a1[min];
				a1[min]=a1[i];
				a1[i]=temp;
				}
				
			}
			System.out.println();
			for (int i = 0; i < a1.length; i++) {
				System.out.print(a1[i]+"\t");
			}
			System.out.println();
			
		}
	}


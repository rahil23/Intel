
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		String s = "vhbfjnckmedsjlkcmfv";
		char a[]=s.toCharArray();
		char temp=0;
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length-1; j++) 
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}

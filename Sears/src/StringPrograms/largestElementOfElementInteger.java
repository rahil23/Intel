package StringPrograms;

public class largestElementOfElementInteger {
		public static void main(String args[])
		{
			int a[]={11,88,22,77,33,66,44,55};
			int max=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				}
			}
			System.out.println("Largest Element : "+max);
		}
	}



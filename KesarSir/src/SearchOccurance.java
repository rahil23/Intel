
public class SearchOccurance 
	{
		public static void main(String args[])
		{
			int a[]={11,88,22,77,33,66,44,33,55,33};
			int k=33;
			boolean isFound=false;
			for(int i=0;i<a.length;i++)
			{
				if(k==a[i])
				{
					System.out.println("Element Found at : "+(i+1)+"Location");	
					isFound=true;
				}
			}
			if(isFound==false)
				System.out.println("Element Not Found");

		}
	}



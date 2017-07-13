
public class BubbleSort {

	
		   public static void main(String argd[])
		   {
		         int a[]=new int[] {15,9,18,2,11};
		         int temp;
		         for(int j=0;j<a.length-1;j++)
		         {
		      	   for(int i=0;i<a.length-1;i++)
		      	   {
		      	        if(a[i]>a[i+1])
		                 {
		      	        	temp=a[i];
		      	        	a[i]=a[i+1];
		                    a[i+1]=temp;
		                 }
		      	   }
		         }   
		         for(int i=0;i<a.length;i++)
		         {
		            System.out.println("sort array is" + a[i]);
		         }
		   
		}

}

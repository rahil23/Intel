import java.util.HashMap;

public class Rough {
	
	public static void main(String[] args) {
		
int a[] ={12,43,23,44,11,5};
int len = a.length;
int temp=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length; j++) 
	{
		
	if(a[j]>a[j+1])
      {
	temp = a[j];
	a[j] = a[j+1];
	a[j+1]=temp;
      }
     }
	
	
	
   }
}
}

	
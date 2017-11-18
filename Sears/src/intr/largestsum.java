package intr;

public class largestsum {
	
	public static void main(String[] args) {
		int a[] = {-2,1,3,-2,4,-1,2,3};
		
		int ii = a[0];
		int max = a[0];
		int iii = a[0];
		int len = a.length;
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]>max)
			{
				iii=ii;
				ii=max;
				max=a[i];
				
			}
			else if(a[i]>ii)
			{
				iii=ii;
				ii=a[i];
				
			}
			else if(a[i]>iii)
			{
				iii=a[i];
				
			}
		}
		System.out.println(len-1 +""+ (len-2)+""+(len-3));
		System.out.println(+max+" "+ii+" "+iii);
		
	}

}

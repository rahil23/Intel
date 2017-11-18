package jabong;

public class SortSimple {
	
	
	public static void main(String[] args) {
		int a[]={1,0,1,0,0,0,0,1,1,0,0};
		int len = a.length;
		int start=0;
		int end = len-1;
		for (int i = 0; i < len-1; i++) {
			if(a[i]==0)
			{
			a[start]=a[i];
			start++;
			}
			if(a[i]==1)
			{
				a[end]=a[i];
				end--;
			}
		}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}
	

}

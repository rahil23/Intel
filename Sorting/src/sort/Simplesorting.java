

package sort;

public class Simplesorting {

	public static void main(String[] args) {
		int a[] = {0,1,0,1,1,0,0,1,0,0};
		
		int m[]= new int[a.length];

		int start=0;
		int end=a.length-1;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==0)
			{
				m[start]=0;
				start++;
			}
			else if(a[i]==1)
			{
				m[end]=1;
				
				end--;
			}
			
		}
		
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i]+" ");
			
		}
	}
}

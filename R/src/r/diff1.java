package r;

public class diff1 {
	
	public static void main(String[] args) {
		
		int a[]={110,111,115,116,118};
		
		for (int i = 0; i <a.length-1; i++) {
			
			int diff = a[i+1]-a[i];
			if(diff>1)
			{
				System.out.print("("+a[i+1]+","+a[i]+")");
			}
		}
	}

}

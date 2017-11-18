package jabong;

public class secondLargest {
	
	public static void main(String[] args) {
		int n[]= {4,2,6,3,7,8,1,5};
		int len = n.length;
		int largest=n[0];
		int slar=n[0];
		for (int i = 0; i < n.length; i++) {
			
			if(n[i]>largest)
			{
				slar=largest;
				largest=n[i];
			}
			
			else if (n[i]>slar)
			{
				slar=n[i];
			}
			
		}
		System.out.println(slar);

}
}
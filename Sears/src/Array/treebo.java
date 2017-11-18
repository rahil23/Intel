package Array;

public class treebo {


	public static void main(String[] args) {
		int a=0,b=1;
		int c;
		int temp=0;
		for (int i = 0; i < 50; i++) {
			if(i==0)
			{
				System.out.println(0);
			}
			c=a+b;
			//System.out.println(c);
			a=b;
			b=c;
			
			if(c%2==0)
			{
				
				System.out.println("posiiton is :"+temp+"number is"+c);
				temp++;
			}
		}
	}
}


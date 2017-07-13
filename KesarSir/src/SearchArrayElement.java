
public class SearchArrayElement {
	
	public static void main(String[] args) {
		String a[]={"12","33","4","34","423","42342","4324452"};
		String d="423";
		boolean flag = false;
		int i;
		for (i = 0; i < a.length; i++) 
		{
			
				if(a[i]==d)
				{
					flag=true;
					break;
				}
		}
		if (flag) 
		{
			System.out.println("Element found"+i);
			
		}
		else{
				System.out.println("Element not found");
		}
	}
	}
			
	


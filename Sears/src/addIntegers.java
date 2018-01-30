
public class addIntegers {

	
	public static void main(String[] args) 
	{
		String s1="R1A2H3I4L5";
		int temp=0;
		
		for (int i = 0; i <= s1.length()-1; i++) 
		{
			char c = s1.charAt(i);
			
			if(c>='0' && c<='9')
			{
						int value = Character.getNumericValue(c);
				temp = temp+value;
				//System.out.println(temp);
			}
	  }
		System.out.println(temp);
   }
}


package StringPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class findDuplicate {
	
	public static void main(String[] args) {
		String s1="abcdaabccabccefgkmn";
		//o/p --> aaaabbbccccc
		
		
		Map map1 = new HashMap<>();
		char ch[]=s1.toCharArray();
		
		int temp=0;
		
		for (int i = 0; i < ch.length-1; i++) 
		{
			Integer count=(Integer) map1.get(ch[i]);
			
				if(count==null)
				{
					map1.put(ch[i], 1);
				}
				else
				{
					count++;
					map1.put(ch[i], count);
				}
			//System.out.println(count);
			/*if(ch[i]==ch[i+1])
			{
				System.out.print(ch[i]+ " "+ch[i+1]+ " "+i);
				temp++;
			}
			else
			{
				temp=0;
			}
			*/
			
		}
		System.out.println(map1);
		
		Set set=map1.keySet();
	Iterator iterator= set.iterator();
	
	while(iterator.hasNext())
	{
		//System.out.println(iterator.next());
		Character ch1=(Character) iterator.next();
		for (int i = 0; i <(int)map1.get(ch1); i++) {
			System.out.print(ch1);
		}
	}
	/*for (int i = 0; i < ch.length-1; i++) {
		for (int j = 1; j < ch.length; j++) {
			if (ch[i]==ch[j]) {
				System.out.println(ch[i]);
				
			}
			
		}
		
		
	}*/
	
	
	
	}

}

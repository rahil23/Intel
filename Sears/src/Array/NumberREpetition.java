package Array;

import java.util.HashMap;
import java.util.Map;

public class NumberREpetition {



		public static void main(String[] args) {
			int a[]={1,2,3,1,3,2,4,1,2};
			
			int len = a.length;
			Map m = new HashMap();
			for (int i = 0; i < a.length-1; i++) {
				int count=0;
				int temp = a[i];
				
			for (int j = i+1; j < a.length-1; j++) {
				
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			m.put(temp, count);
				
			}
			
		}
	}



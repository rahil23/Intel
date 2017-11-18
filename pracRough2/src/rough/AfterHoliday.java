package rough;

import java.util.ArrayList;
import java.util.Scanner;

public class AfterHoliday {
	
	
	public static void main(String[] args) {
		
		int a[]={2,5,3,1,2,6,7,3};
	
		for (int i = 0; i <= a.length-1; i++) {
			for (int j = i+1; j <= a.length-1; j++) {
				if((a[i]+a[j])==8)
				{
					System.out.println(a[i]+ " "+ a[j]);
				}
				
			}
			
		}
		
		
		
		
		}
		
}
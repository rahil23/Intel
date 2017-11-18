package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
public static void main(String[] args) {
		
		int[] arr={1,1,2,2,3,3,4,4,5,5};
		
	/*	Set set= new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);*/
		
		
		removeDuplicate(arr);
		
	}
	
	
	static void  removeDuplicate(int[] input)
	{
		//int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int current = input[0];
		boolean found = false;

		for (int i = 0; i < input.length; i++) {
		    if (current == input[i] && !found) {
		        found = true;
		    } else if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		        found = false;
		    }
		}
		System.out.print(" " + current);
	}

}

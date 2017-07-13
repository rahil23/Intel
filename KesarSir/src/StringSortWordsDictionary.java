

	public class StringSortWordsDictionary {
		public static void main(String[] args) 
	    {
	        String temp;	
	        String names[] = {"Priyanka","Kesar","Atish","Pooja","Anjali"};
	        for (int i = 0; i < names.length-1; i++) 
	        {
	            for (int j = 0; j < names.length-1; j++) 
	            {
	                if (names[j].compareTo(names[j+1])>0) 
	                {
	                    temp = names[j];
	                    names[j] = names[j+1];
	                    names[j+1] = temp;
	                }
	            }
	        }
	        System.out.print("Names in Sorted Order:");
	        for (int i = 0; i < names.length; i++) 
	        {
	            System.out.print(names[i]+" ");
	        }
	        
	    }
	}



	

package queue;

import java.util.Arrays;

public class SampleQueue {
	
	String queueArray[];
	int queueSize;
	int front;
	int end;
	int numberofitems=0;
	
	public SampleQueue(int size) {
	
		// TODO Auto-generated constructor stub
		queueSize=size;
		queueArray = new String[size];
		Arrays.fill(queueArray, "-1");
	}

	public void insert(String input)
	{
		if(queueSize>=numberofitems+1)
		{
			queueArray[end]=input;
			numberofitems++;
			System.out.println("Insert"+input+"was Added to the Queue");
		}
		else
		{
			System.out.println("Sorry the Queue is full");
		}
	}
	
	public void remove()
	{
		if(numberofitems>0)
		{
			System.out.println("REmove"+queueArray[front] + "was removed");
			queueArray[front] = "-1";
			front++;
			numberofitems--;
		}
		else
		{
			System.out.println("Queue in this sitaution is empty");
			
		}
	}
	
	public void peek()
	{
		System.out.println("The first element is"+queueArray[front]);
	}
	
	
	public void priorityInsert(String input)
	{ 
		int j;
		
		if(numberofitems == 0)
		{
			insert(input);
		}
		else
		{
			for (j = numberofitems-1; j >0 ; j--) {
				if(Integer.parseInt(input)>Integer.parseInt(queueArray[j]))
				{
					queueArray[j+1] = queueArray[j];
					 
				}
				else
				
					break;
				
				}
				queueArray[j+1]=input;
				end--;
				numberofitems++;
				
			}
		}


public void displaytheQueue()
{
	 for(int n = 0; n < 61; n++)
		 System.out.print("-");
	        System.out.println();
	
    for(int n = 0; n < queueSize; n++)
    {
	 
	     System.out.format("| %2s "+ " ", n);
     }
  System.out.println("|");
for(int n = 0; n < 61; n++)
System.out.print("-");
System.out.println();
	 
for(int n = 0; n < queueSize; n++){
	 
if(queueArray[n].equals("-1")) 
  System.out.print("|     ");
	 
else 
  System.out.print(String.format("| %2s "+ " ", queueArray[n]));
	 
}
	 
System.out.println("|");
	 
for(int n = 0; n < 61; n++)System.out.print("-");
	System.out.println();
	int spacesBeforeFront = 3*(2*(front+1)-1);

	for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");
	  
	      System.out.print("F");

	       // Number of spaces to put before the R
	 
	 int spacesBeforeRear = (2*(3*end)-1) - (spacesBeforeFront);
	
	  for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");
	 
	      System.out.print("R");
	           System.out.println("\n");

}
	public static void main(String[] args) {
		SampleQueue theQueue = new SampleQueue(10);
		
		theQueue.insert("10");
		//theQueue.insert("15");
		//theQueue.insert("11");
		theQueue.displaytheQueue();
		
	/*	theQueue.priorityInsert("10");
		theQueue.priorityInsert("11");
		theQueue.priorityInsert("15");
		theQueue.priorityInsert("11");
		*/
		/*theQueue.displaytheQueue();
		theQueue.remove();
		theQueue.remove();
		theQueue.displaytheQueue();
		theQueue.peek();*/
	}
}

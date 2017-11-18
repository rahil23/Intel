package Stack;

import java.awt.DisplayMode;
import java.util.Arrays;

public class SampleStack {
	
	String stackArray[];
	int stackSize;
	int topOfStack=-1;
	
	public SampleStack(int size) {
		// TODO Auto-generated constructor stub
		stackSize= size;
		stackArray = new String[size];
		Arrays.fill(stackArray,"-1");
	}
	
	public void push(String input)
	{
		if(stackSize > topOfStack+1)
		{
			topOfStack++;
			stackArray[topOfStack] = input;
		}
		else
		{
			System.out.println("Sorry but the stack is full");
		}
		
		displaytheStack();
		System.out.println("PUSH" + input + "was added to the stack");
	}
	
	public String pop()
	{
		 if(topOfStack>=0)
		 {
			 displaytheStack();
			 System.out.println("POP"+stackArray[topOfStack]+"was removed from the stack \n");
		     stackArray[topOfStack]="-1";
		     
		     return stackArray[topOfStack--];
			 
		 }
		 else
		 {
			 displaytheStack();
			 System.out.println("Sorry but the Stack is Empty");
			 return "-1";
		 }
	}
	
	public String peek()
	{
		displaytheStack();
		System.out.println("PEEK" +stackArray[topOfStack] + "Is at the TOp of Stack");
		return stackArray[topOfStack];
	}
	
	public void pushMany(String multiplevalues)
	{
		String tempString[] = multiplevalues.split(" ");
		for (int i = 0; i < tempString.length; i++) {
			push(tempString[i]);
			
		}
	}
	
	public void popAll()
	{
		for (int i = topOfStack; i >0; i--) {
			pop();
			
			
		}
	}
	 public void displaytheStack()
	 {
		 for(int n = 0; n < 61; n++)
			 System.out.print("-");
		        System.out.println();
		
	     for(int n = 0; n < stackSize; n++)
	     {
		 
		     System.out.format("| %2s "+ " ", n);
	      }
	   System.out.println("|");
 for(int n = 0; n < 61; n++)
	 System.out.print("-");
    System.out.println();
		 
  for(int n = 0; n < stackSize; n++){
		 
   if(stackArray[n].equals("-1")) 
	   System.out.print("|     ");
		 
   else 
	   System.out.print(String.format("| %2s "+ " ", stackArray[n]));
		 
   }
		 
   System.out.println("|");
		 
	for(int n = 0; n < 61; n++)System.out.print("-");
		System.out.println();
	 }
		       
	public static void main(String[] args) {
		
		
		SampleStack theStack = new SampleStack(10);
		theStack.push("10");
		theStack.push("15");
		theStack.peek();
		theStack.pop();
		theStack.pushMany("12 13 14 15 16");
		theStack.displaytheStack();
		theStack.pushMany("12 13 14 15 16");
		theStack.popAll();
	}

}

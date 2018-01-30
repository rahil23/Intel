package simpleINsertion;

 class ABC {
	
	int capacity = 5;
	int top = -1;
	int[] stack;
	
	public ABC() {
		// TODO Auto-generated constructor stub
		stack = new int[7];
	}
	//int stack[capacity];
	
	public void push(int ele)
	{
		if(isFull())
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			
			stack[top]=ele;
			System.out.println("Inserted Element"+ele);
		}
	}
	
	int pop()
	{
		int ele;
		if(isEmpty())
		{
			System.out.println("Element is not present. it's a empty stack");
			
		}
		else
		{
			ele=stack[top];
			top--;
			
		}
		return top;
	}
	
	boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	Boolean isFull()
	{
		if(top==capacity-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	void retreiveStack()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		for (int i = 0; i <= top; i++) {
			System.out.println(stack[i]);
			
		}
	}
	int peek()
	 {
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return 0;
		}
		else
		{
			return stack[top];
		}
		
		
	 }		
	}

 
public class Insert
{
	public static void main(String[] args) {
		
	
ABC obj = new ABC();
obj.push(3);
obj.push(4);
obj.push(5);
obj.push(6);
obj.push(7);
obj.push(8);
obj.push(9);
	

	}
}
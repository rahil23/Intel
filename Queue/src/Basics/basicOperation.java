package Basics;

public class basicOperation {
	
	int front = 0;
	int rear  = 0;
	int capacity=7;
	int queue[];
	public basicOperation() {
		// TODO Auto-generated constructor stub
		
		queue = new int[capacity];
	}
	
	void insert(int element)
	{
		if(rear==capacity)
		{
			System.out.println("Queue is full");
		}
		else
		{
			
			queue[rear]=element;
			rear++;
		}
	}
	
	void delete()
	{
		if(front == rear)
		{
			System.out.println("queue is empty");
		}
		else
		{
			for (int i = 0; i < rear-1; i++) {
				queue[i]=queue[i+1];
				rear--;
				System.out.println("deleted");
			}
		}
	}

	void traverse()
	{
		if(front == rear)
		{
			System.out.println("queue is empty");
		}
		else
		{
			for (int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
				System.out.println("traveresed");
				
			}
		}
	}
	public static void main(String[] args) {
		basicOperation obj = new basicOperation();
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.insert(6);
		obj.insert(7);
		obj.insert(8);
		obj.insert(9);
		obj.insert(0);
		obj.insert(01);
		obj.traverse();
		obj.delete();
		obj.delete();
		obj.traverse();
	}
}

package Basics;

public class CircularQueue {
	int rear=-1;
	int front = -1;
	int cqueue[];
	int capacity=6;
	
	public CircularQueue() {
		cqueue=new int[capacity];
	}

	void insert(int element)
	{
		if(rear==capacity-1|| front == capacity+1) //((rear == SIZE-1 && front == 0) || (rear == front-1))
		{
			System.out.println("Queue is full");
		}
		/*else if(rear == capacity-1)
		{
			rear = 0;
			
		}
		else if (rear== front+1)
		{
			System.out.println("queue is full");
		}*/
		else if(front == -1 && rear == -1)
		{
			front=rear=0;
			cqueue[rear]=element;
		}
		else if(rear == capacity-1)
		{
			rear=0;
			cqueue[rear]=element;
		}
		
		else
		{
			rear++;
			cqueue[rear] = element;
		}
	}
	
	void delete(int deleteEle)
	{
		if(front == -1 && rear == -1)
		{
			System.out.println("Queue is Empty");
		}
		else if(front == rear) // deleting the last element
		{
			deleteEle = cqueue[front];
		front=rear=0;	
		}
		else if(front == capacity-1)
		{
			deleteEle = cqueue[front];
			front = 0;
			
		}
		else
		{
			deleteEle = cqueue[front];
			front++;
			System.out.println("deleted item is "+deleteEle);
			
		}
	}
}

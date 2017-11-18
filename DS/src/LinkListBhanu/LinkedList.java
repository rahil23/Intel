package LinkListBhanu;

public class LinkedList {

	ListNode head;
	int len=0;
	public void insertNodeAtBegin(int data)
	{
		// in this we want to supply some data of Node which will Insert/ So we r passing data s parameter
		
		ListNode node = new ListNode(data);
		node.setNext(head);
		head=node;
		len++;
	}
	public static void main(String[] args) {
		LinkedList obj  =new LinkedList();
		obj.insertNodeAtBegin(6);
		System.out.println(obj);
		
	}
	public String toString()
	{
		String data= "[";
		data=data+head.getData();
		ListNode temp = head.getNext();
		while(temp!=null)
		{
			data =data+" "+temp.getData();
			temp=temp.getNext();
			
		}
		return data + "]";
	}
}

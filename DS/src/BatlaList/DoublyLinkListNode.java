package BatlaList;

public class DoublyLinkListNode {

	int data;
	DoublyLinkListNode next;
	DoublyLinkListNode prev;
	
	String name;
	
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyLinkListNode getNext() {
		return next;
	}
	public void setNext(DoublyLinkListNode next) {
		this.next = next;
	}
	
	
	public DoublyLinkListNode getPrev() {
		return prev;
	}
	public void setPrev(DoublyLinkListNode prev) {
		this.prev = prev;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + ", name=" + name + "]\n";
	}
	
	
	
		
	
}

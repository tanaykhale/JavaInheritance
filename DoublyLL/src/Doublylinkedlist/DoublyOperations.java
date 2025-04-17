package Doublylinkedlist;

public class DoublyOperations {
	private Node head=null;
	public void addAtStart(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		head.setPrev(newnode);
		newnode.setNext(head);
		head=newnode;
	}
	public void addAtEnd(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.getNext()!=null)
			temp=temp.getNext();
		temp.setNext(newnode);
		newnode.setPrev(temp);
	}
	public void addAtMid(int newData,int val) {
		Node newnode=new Node(newData);
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp!=null && temp.getData()!=val)
			temp=temp.getNext();
		temp.getNext().setPrev(newnode);
		newnode.setNext(temp.getNext());
		newnode.setPrev(temp);
		temp.setNext(newnode);
	}
	public int getCount() {
		if(head==null) {
			System.out.println("linked list is empty");
			return 0;
		}
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.getNext();
		}
		return count;
	}
	public void addAtIdx(int newData,int idx) {
		Node newnode=new Node(newData);
		if(head==null) {
			head=newnode;
			return;
		}
		int itr=getCount()-idx;
		Node temp=head;
		while(itr!=0) {
			temp=temp.getNext();
			itr--;
		}
		System.out.println(temp.getData());
		temp.getNext().setPrev(newnode);
		newnode.setNext(temp.getNext());
		newnode.setPrev(temp);
		temp.setNext(newnode);
		
	}
	public void deleteAtStart() {
		if(head==null) {
			System.out.println("List is empty");
			return ;
		}
		if(head.getNext()==null)
			{
			head=null;
			return;
			}
		
		head=head.getNext();
		head.getPrev().setNext(null);
		head.setPrev(null);
		
		
	}
	public void deleteAtEnd() {
		if(head==null) {
			System.out.println("List is empty");
			return ;
		}
		if(head.getNext()==null) {
			head=head.getNext();
			return;
		}
		Node temp=head;
		while(temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.getNext().setNext(null);
		temp.setNext(null);
		
	}
	public void deleteAtMid(int data) {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node temp=head;
		while(temp!=null && temp.getData()!=data)
			temp=temp.getNext();
		temp.getNext().setPrev(temp.getPrev());
		temp.getPrev().setNext(temp.getNext());
		temp.setNext(null);
		temp.setPrev(null);
	}
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		System.out.print("null<->");
		while(temp!=null) {
			System.out.print(temp.getData()+"<->");
			temp=temp.getNext();
		}
		System.out.println("null");
	}
}

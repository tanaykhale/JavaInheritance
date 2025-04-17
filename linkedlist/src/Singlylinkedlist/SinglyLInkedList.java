package Singlylinkedlist;
import java.util.*;
public class SinglyLInkedList {
	private Node head=null;
	Scanner sc=new Scanner(System.in);
	public void addData() {
		Node n=new Node();
		System.out.print("Enter the data");
		int value=sc.nextInt();
		n.setData(value);
		n.setNext(null);
		if(head==null) {
			head=n;
		}
		else {
			Node temp=head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(n);
		}
	}
	
	
	public void addEnd() {
		Node n=new Node();
		System.out.println("Enter the data");
		int value=sc.nextInt();
		n.setData(value);
		n.setNext(null);
		if(head==null) {
			head=n;
			return;
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(n);
		System.out.println("Data entered at end");
	}
	
	public void addBetween(int data) {
	if(head==null) {
		System.out.println("List is empty");
	}
	Node n=new Node();
	System.out.println("Enter the data");
	int value=sc.nextInt();
	n.setData(value);
	n.setNext(null);
	Node temp=head;
	while(temp!=null) {
		if(temp.getData()==data) {
			n.setNext(temp.getNext());
			temp.setNext(n);
			System.out.println("Node added succesfully");
			return;
		}
		temp=temp.getNext();
	}
	if(temp==null) {
		System.out.println("Value does not exist in list");
	}
	}
	
	public int countNode() {
		if(head==null) {
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
	public void deleteStart() {
		Node temp=null;
		if(head==null) {
			System.out.println("Linked list is empty");
			return;
		}
		temp=head;
		head=head.getNext();
		temp.setNext(null);
		System.out.println("Data deleted from start");
	}
	public void deleteEnd() {
		Node temp=null;
		if(head==null) {
			System.out.println("Linked list is empty");
			return;
		}
		temp=head;
		while(temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(null);
		System.out.println("Data deleted from end");
	}
	public void deleteAtValue(int value) {
		Node tag=null;
		Node temp=null;
		if(head==null) {
			System.out.println("Linked list is empty");
			return;
		}
		if(head.getData()==value) {
			temp=head;
			head=head.getNext();
			temp.setNext(null);
			System.out.println("Data delete at value "+value);
			return;
		}
		temp=head;
		while(temp!=null && temp.getData()!=value) {
			tag=temp;
			temp=temp.getNext();
		}
		if(temp==null) {
			System.out.println("Data not found..!!!");
			return;
		}
		tag.setNext(temp.getNext());
		temp.setNext(null);
		System.out.println("Data deleted at value "+value);
	}
	public void reverse() {
		if(head==null) {
			System.out.println("Linked list is empty");
			return;
		}
		Node prev=null;
		Node cur=head;
		Node next=null;
		if(prev!=null)
			cur  = head.getNext();
		if(cur!=null || cur.getNext()!=null)
			next = cur.getNext();
		while(cur!=null) {
			next=cur.getNext();
			cur.setNext(prev);
			prev=cur;
			cur=next;
			if(next!=null) {
				next=next.getNext();
			}
		}
		head.setNext(null);
		head=prev;
		System.out.println("Linkedlist reversed successfully....");
	}
	public void update(int idx,int data) {
		int count=countNode();
		if(idx>count) {
			System.out.println("Index not found");
			return;
		}
		Node temp=head;
		for(int i=1;i<=count;i++) {
			if(i==idx) {
				temp.setData(data);
			}
			temp=temp.getNext();
		}
		System.out.println("Data updated successfully...");
		
	}
	public void display() {
	if(head==null) {
		System.out.println("Linked list is empty");
		return;
	}
	 Node temp = head;
     System.out.print("Linked List: ");
     while (temp != null) {
         System.out.print(temp.getData() + " -> ");
         temp = temp.getNext();
     }
     System.out.println("NULL");
	}


	public void deleteAtIdx(int idx) {
		int count = countNode();
	    
	    if (idx < 0 || idx >= count) { 
	        System.out.println("Index not found");
	        return;
	    }

	    if (idx == 0) { 
	        deleteStart();
	        return;
	    }

	    Node temp = head;
	    Node prev = null;

	    for (int i = 1; i < idx; i++) {
	        prev = temp;
	        temp = temp.getNext();
	    }

	    if (temp != null) {
	        prev.setNext(temp.getNext()); 
	        temp.setNext(null); 
	    }
		
	}
}

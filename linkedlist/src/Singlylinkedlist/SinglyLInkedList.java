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


	
}

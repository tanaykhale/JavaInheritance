package EmployeeLinkedList;

import EmployeeLinkedList.Node;

public class EmpList {
	private Node head=null;
	public void insertData(Employee e) {
		Node n=new Node();
		n.setData(e);
		n.setNext(null);
		if(head==null) {
			head=n;
			return;
		}
		
		Node temp=head;
			
		if (head.getData().getEmpid() > e.getEmpid()) {
		        n.setNext(head);
		        head = n;
		        return;
		}
		
		while(temp.getNext()!=null && temp.getNext().getData().getEmpid() < e.getEmpid()) {
					temp=temp.getNext();
		}
		n.setNext(temp.getNext());
		temp.setNext(n);
		
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

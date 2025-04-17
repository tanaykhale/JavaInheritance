package Alphabet;

public class CharList {
	Node head;
	public void add(char data) {
		Node n=new Node();
		n.setData(data);
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

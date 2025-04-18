package Circularll;
//
//import java.util.Scanner;
//
//public class CircularllOperation {
//    private Node head = null;
//    Scanner sc = new Scanner(System.in);
//
//    public void addData() {
//        Node n = new Node();
//        System.out.print("Enter the data: ");
//        int value = sc.nextInt();
//        n.setData(value);
//
//        if (head == null) {
//            head = n;
//            n.setNext(head); 
//        } else {
//            Node temp = head;
//            while (temp.getNext() != head) { 
//                temp = temp.getNext();
//            }
//            temp.setNext(n);
//            n.setNext(head); 
//        }
//    }
//
//    public void addEnd() {
//        Node n = new Node();
//        System.out.print("Enter the data: ");
//        int value = sc.nextInt();
//        n.setData(value);
//
//        if (head == null) {
//            head = n;
//            n.setNext(head); 
//        } else {
//            Node temp = head;
//            while (temp.getNext() != head) { 
//                temp = temp.getNext();
//            }
//            temp.setNext(n);
//            n.setNext(head); 
//        }
//        System.out.println("Data entered at end");
//    }
//
//    public void addBetween(int data) {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        Node n = new Node();
//        System.out.print("Enter the data: ");
//        int value = sc.nextInt();
//        n.setData(value);
//
//        Node temp = head;
//        do {
//            if (temp.getData() == data) {
//                n.setNext(temp.getNext());
//                temp.setNext(n);
//                System.out.println("Node added successfully");
//                return;
//            }
//            temp = temp.getNext();
//        } while (temp != head);
//
//        System.out.println("Value does not exist in list");
//    }
//
//    public int countNode() {
//        if (head == null) {
//            return 0;
//        }
//
//        int count = 0;
//        Node temp = head;
//        do {
//            count++;
//            temp = temp.getNext();
//        } while (temp != head);
//
//        return count;
//    }
//
//    public void deleteStart() {
//        if (head == null) {
//            System.out.println("Linked list is empty");
//            return;
//        }
//
//        if (head.getNext() == head) {
//            head = null;
//        } else {
//            Node temp = head;
//            while (temp.getNext() != head) { 
//                temp = temp.getNext();
//            }
//            temp.setNext(head.getNext()); 
//            head = head.getNext();
//        }
//        System.out.println("Data deleted from start");
//    }
//
//    public void deleteEnd() {
//        if (head == null) {
//            System.out.println("Linked list is empty");
//            return;
//        }
//
//        if (head.getNext() == head) { 
//            head = null;
//        } else {
//            Node temp = head;
//            Node prev = null;
//            while (temp.getNext() != head) { 
//                prev = temp;
//                temp = temp.getNext();
//            }
//            prev.setNext(head); 
//        }
//        System.out.println("Data deleted from end");
//    }
//
//    public void deleteAtValue(int value) {
//        if (head == null) {
//            System.out.println("Linked list is empty");
//            return;
//        }
//
//        if (head.getData() == value) { 
//            deleteStart();
//            return;
//        }
//
//        Node temp = head;
//        Node prev = null;
//        do {
//            prev = temp;
//            temp = temp.getNext();
//            if (temp.getData() == value) {
//                prev.setNext(temp.getNext());
//                System.out.println("Data deleted at value " + value);
//                return;
//            }
//        } while (temp != head);
//
//        System.out.println("Data not found..!!!");
//    }
//
////    public void reverse() {
////        if (head == null || head.getNext() == head) { 
////            System.out.println("Linked list is empty or has only one node");
////            return;
////        }
////
////        Node prev = null;
////        Node cur = head;
////        Node next = null;
////        Node last = head;
////
////        do {
////            next = cur.getNext();
////            cur.setNext(prev);
////            prev = cur;
////            cur = next;
////        } while (cur != head);
////
////        head.setNext(prev); // Update the last node's next pointer
////        head = prev; // Update the head
////        System.out.println("Linked list reversed successfully....");
////    }
//
//    public void update(int idx, int data) {
//        int count = countNode();
//        if (idx < 0 || idx >= count) {
//            System.out.println("Index not found");
//            return;
//        }
//
//        Node temp = head;
//        for (int i = 0; i < idx; i++) {
//            temp = temp.getNext();
//        }
//        temp.setData(data);
//        System.out.println("Data updated successfully...");
//    }
//
//    public void display() {
//        if (head == null) {
//            System.out.println("Linked list is empty");
//            return;
//        }
//
//        Node temp = head;
//        System.out.print("Linked List: ");
//        do {
//            System.out.print(temp.getData() + " -> ");
//            temp = temp.getNext();
//        } while (temp != head);
//        System.out.println("(back to head)");
//    }
//
//    public void deleteAtIdx(int idx) {
//        int count = countNode();
//
//        if (idx < 0 || idx >= count) {
//            System.out.println("Index not found");
//            return;
//        }
//
//        if (idx == 0) {
//            deleteStart();
//            return;
//        }
//
//        Node temp = head;
//        Node prev = null;
//
//        for (int i = 0; i < idx; i++) {
//            prev = temp;
//            temp = temp.getNext();
//        }
//
//        prev.setNext(temp.getNext());
//        System.out.println("Data deleted at index " + idx);
//    }
//}

public class CircularllOperation{
	private Node head=null;
	public void addAtStart(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			newnode.setNext(head);
			return;
		}
		Node temp=head;
		while(temp.getNext()!=head) {
			temp=temp.getNext();
		}
		newnode.setNext(head);
		temp.setNext(newnode);
		head=newnode;
	}
	public void addAtEnd(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			newnode.setNext(head);
			return;
		}
		Node temp=head;
		while(temp.getNext()!=head) {
			temp=temp.getNext();
		}
		temp.setNext(newnode);
		newnode.setNext(head);
		
	}
	public void addAtMiddle(int data,int value) {
		
	}
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
	
//		while(temp.getNext()!=head) {
//			System.out.print(temp.getData()+"->");
//			temp=temp.getNext();
//		}
//		System.out.print(temp.getData()+"->");
//		System.out.println("Back to head");
		while(true) {
			System.out.print(temp.getData()+"->");
			if(temp.getNext()==head)
				break;
			temp=temp.getNext();
		}
		System.out.println("back to head");
	}
}



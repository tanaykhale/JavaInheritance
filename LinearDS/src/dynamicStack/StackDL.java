package dynamicStack;

public class StackDL {
	Node top=null;
	public Node createNode(int data) {
		Node newnode=new Node();
		newnode.setData(data);
		newnode.setNext(null);
		return newnode;
	}
	public void push(int data) {
		 Node newnode = createNode(data);
	        if (top == null) {
	            top = newnode;
	            return;
	        } else {
	            newnode.setNext(top); 
	            top = newnode; 
	        }
	
	}
	public int pop() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		Node temp=top;
		int val=top.getData();
		temp=top.getNext();
		top=temp;
		return val;
	}
	public void display() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		Node temp=top;
		while(temp!=null) {
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println("null");
	}
	public void display2() {
		if(top==null) {
			System.out.println("Stack is empty");
		}
		Node temp=top;
		while(temp!=null) {
			System.out.print((char)temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println("null");
	}
}

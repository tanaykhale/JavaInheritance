package dynamicqueue;

public class QueueDL {
    private Node front = null;
    private Node rear = null;
    
    public void enQueue(int data) {
    	Node newnode=new Node(data);
    	if(front==null && rear==null) {
    		front=rear=newnode;
    	}
    	else {
    		rear.setNext(newnode);
    		rear=newnode;
    	}
    }
    public int deQueue() {
    	if(front==null &&rear==null) {
    		System.out.println("Queue is empty");
    		return -1;
    	}
    	int val=front.getData();
    	front=front.getNext();
    	if(front==null)
    		rear=null;
    	return val;
    }
    public void display() {
    	Node temp=front;
    	while(temp!=null) {
    		System.out.print(temp.getData()+"->");
    		temp=temp.getNext();
    	}
    	System.out.println("null");
    }

}

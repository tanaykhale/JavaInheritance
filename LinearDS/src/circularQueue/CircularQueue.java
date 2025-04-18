package circularQueue;

public class CircularQueue {
	private int front,rear,size;
	private int arr[];
	public CircularQueue(int size) {
		super();
		// TODO Auto-generated constructor stub
		front=rear=-1;
		this.size=size;
		arr=new int[this.size];
	}
	public boolean isEmpty() {
		return front==rear;
	}
	public boolean isFull() {
		if(front==-1 && rear==size-1)
			return true;
		if(front==(rear+1)%size)
			return true;
		return false;
	}
	public void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		rear=(rear+1)%size;
		arr[rear]=data;
	}
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		front=(front+1)%size;
	}
	public void display() {
		for(int i=front+1;i!=rear;i=(i+1)%size) {
			System.out.println(arr[i]+" ");
		}
		System.out.println(arr[rear]);
	}
	
	
}

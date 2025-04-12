package queue;
import java.util.Scanner;
public class Queu {
	private int front,rear,size;
	private int q[];
	
	Scanner sc=new Scanner(System.in);
	
	public Queu() {
		super();
		front=-1;
		rear=-1;
		size=0;
		q=new int[size];
	}
	public void init() {
		System.out.println("Enter queue size");
		int s=sc.nextInt();
		size=s;
		q=new int[size];
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public boolean isEmpty() {
		return front==rear;
	}
	public void deQueue(int val) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		q[++rear]=val;
	}
	public int enQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return 0;
		}
		return q[++front];
	}
	public void display() {
		for(int i=front+1;i<=rear;i++) {
			System.out.print(q[i]+" ");
		System.out.println();
		}
	}
}

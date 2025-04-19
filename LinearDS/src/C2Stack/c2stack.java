package C2Stack;

public class c2stack {
	private int arr[];
	private int top1,top2;
	private int size;
	
	public c2stack(int size) {
		this.size=size;
		top1=-1;
		top2=size;
		arr=new int[size];
	}
	public boolean isFull() {
		return top2==(top1+1);
	}
	public boolean isEmpty() {
		return top1==-1 && top2==size;
	}
	public void push1(int data) {
		if(!isFull()) {
			arr[++top1]=data;
			System.out.println("Element added in stack1");
		}
		else 
			System.out.println("Stack is full");
	}

	public void push2(int data) {
		if(!isFull()) {
			arr[--top2]=data;
			System.out.println("Element added in stack2");
		}
		else
			System.out.println("Stack is full");
	}
	public void pop1() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else
		{
			
			top1--;
			if(top1==-1) {
				System.out.println("Stack is empty");
				return;
			}
		}
	}
	public void pop2() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			top2++;
			if(top2==size) {
				System.out.println("Stack is empty");
				return;
			}
		}
	}
	public void display1() {
		for(int i=top1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	public void display2() {
		int i;
		for(i=top2;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
}

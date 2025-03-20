import Exception.StackOverFlowException;
import Exception.StackUnderFlowException;

public class Stack {
	private static int top;
	static {
		top=-1;
	}
	private int size;
	private int  arr[]=new int[size];
	

	
	public Stack(int size) {
		super();
		this.size = size;
		arr=new int[this.size];
	}

	public void Push(int num) {
		try {
			if(top==arr.length-1)
				throw new StackOverFlowException();
			arr[++top]=num;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public int Pop() {
	
		try {
			if(top==-1)
				throw new StackUnderFlowException();
			
			return arr[top--];
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	
	

}

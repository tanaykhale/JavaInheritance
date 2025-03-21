import Exception.StackOverFlowException;
import Exception.StackUnderFlowException;

public class Stack {
	private static int top;
	static {
		top=-1;
	}
	private int size;
	private int  arr[];
	

	
	public Stack(int size) {
		super();
		this.size = size;
		arr=new int[size];
	}

//	public void Push(int num) {
//		try {
//			if(top==arr.length-1)
//				throw new StackOverFlowException();
//			arr[++top]=num;
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//	}
//	
//	public int Pop() {
//	
//		try {
//			if(top==-1)
//				throw new StackUnderFlowException();
//			
//			return arr[top--];
//			
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		return 0;
//	}
	
	public void Push(int num) throws StackOverFlowException {
		if(top==size-1) {
			throw new StackOverFlowException();
		}
		arr[++top]=num;
	}
	public int Pop() throws StackUnderFlowException{
		if(top==-1)
			throw new  StackUnderFlowException();
		return arr[top--];
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	
	
	

}

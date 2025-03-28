package threads;

public class Number implements Runnable {
	private int num;
	private Thread t;
	
	public Number(int num) {
		super();
		t=new Thread(this);
		this.num = num;
	}
	public synchronized int count(int n) {
		return n+1;
	}
	@Override
	public  void run() {
		System.out.println("Count of numbers: "+count(num));
	}

	public Thread getT() {
		return t;
	}

	

}

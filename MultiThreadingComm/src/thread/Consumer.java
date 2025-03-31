package thread;

public class Consumer implements Runnable{
	private Thread t;
	private Stock s;
	
	
	public Consumer(Thread t, Stock s) {
		super();
		this.t = t;
		this.s = s;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public Thread getT() {
		return t;
	}
	
	

}

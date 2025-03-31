package thread;

public class Producer implements Runnable{
	private Thread t;
	private Stock s;
	
	public Producer(Thread t, Stock s) {
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

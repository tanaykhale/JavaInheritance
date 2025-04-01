package thread;

public class Producer implements Runnable{
	 Thread t;
	 Stock s;
	boolean bRun;
	
	public Producer() {
		t = new Thread(this);
		bRun = true;
	}

	public Producer(Stock s) {
		super();
		t= new Thread(this);
		this.s = s;
		this.bRun = true;
	}
	public void stopNow() {
		bRun=false;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(bRun)
			s.produce();
		
	}

	public Thread getT() {
		return t;
	}

	
	

}

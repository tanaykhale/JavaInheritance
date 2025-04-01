package thread;

public class Consumer implements Runnable{
	private Thread t;
	private Stock s;
	boolean bRun;
	
	public Consumer() {
		t=new Thread(this);  //this.run
		bRun = true;
	}
	
	public Consumer( Stock s) {
		super();
		t = new Thread(this);
		this.s = s;
		bRun=true;
	}
	
	public void stopNow() {
		bRun=false;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(bRun)
			s.consume();
		
	}
	public Thread getT() {
		return t;
	}
	
	

}

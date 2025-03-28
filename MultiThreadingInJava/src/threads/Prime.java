package threads;

public class Prime implements Runnable{
	private Thread t;
	private int i,j;
	
	
	public Prime(int i, int j) {
		super();
		t=new Thread(this);
		this.i = i;
		this.j = j;
	}
	public synchronized void primeRange(int i,int j) {
		for(int a=i;a<=j;a++) {
			if(isPrime(a)) {
				System.out.print(a+" ");
			}
		}
	}

	private synchronized boolean isPrime(int a) {

		for(int i=2;i<a;i++){
			if(a%i==0)
				return false;
		}
		return true;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		primeRange(i,j);
		System.out.println();
	}
	public Thread getT() {
		return t;
	}
	

}



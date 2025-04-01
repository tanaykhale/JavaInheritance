package thread;

public class Stock {
	private int qtyProduced;
	private int qtyConsumed;
	private boolean bProduced;
	
	public synchronized void produce() {
		if(bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qtyProduced++;
		System.out.println("Produced : "+qtyProduced);
		notify();
		bProduced=true;
		
	}
	public synchronized void consume() {
		if(!bProduced) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		qtyConsumed++;
		System.out.println("Consumed : "+qtyConsumed);
		notify();
		bProduced=false;
	}
	public int getQtyProduced() {
		return qtyProduced;
	}
	
	public int getQtyConsumed() {
		return qtyConsumed;
	}
	
	
	

}

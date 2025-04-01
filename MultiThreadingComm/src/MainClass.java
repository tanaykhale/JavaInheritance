import thread.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock s=new Stock();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		p.getT().start();
		c.getT().start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.stopNow();
		c.stopNow();
		try {
			p.getT().join();
			c.getT().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total produced : "+s.getQtyProduced());
		System.out.println("Total consumed : "+s.getQtyConsumed());

	}

}

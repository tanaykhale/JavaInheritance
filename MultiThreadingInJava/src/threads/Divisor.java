package threads;

import java.io.FileWriter;
import java.io.IOException;

public class Divisor implements Runnable {
	private Thread t;
	private int num;
	private FileWriter fw;
	
	
	

	public Divisor(int num,FileWriter fw) {
		super();
		t=new Thread(this);
		this.num = num;
		this.fw=fw;
//		t.start();
	}



	@Override
	public void run() {
		synchronized (fw) {
			
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.println(i);
					try {
						fw.write(i+"\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			
		}
//		getDivisor(num);
		System.out.println("Insertion successful!!");

	}



	public synchronized  void getDivisor(int num2) {
		
		
	}



	public Thread getT() {
		return t;
	}
	

}

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

		System.out.println("Insertion successful!!");

	}






	public Thread getT() {
		return t;
	}
	

}

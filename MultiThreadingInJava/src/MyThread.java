
public class MyThread  implements Runnable{
	public void run() {
		for(int i=1;i<=6;i++) {
			System.out.println("Child Thread "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

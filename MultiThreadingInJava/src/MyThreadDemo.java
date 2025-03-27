
public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread task=new MyThread();
		Thread t=new Thread(task);
		t.start();
		for(int i=1;i<6;i++) {
			System.out.println("Main thread "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

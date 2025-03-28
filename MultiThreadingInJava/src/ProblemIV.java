import threads.Number;
public class ProblemIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n1=new Number(9);
		Number n2=new Number(10);
		Number n3=new Number(11);
		System.out.println("Process start");
		n1.getT().setPriority(10);
		n2.getT().setPriority(2);
		n3.getT().setPriority(1);
		
		n1.getT().start();
		n2.getT().start();
		n3.getT().start();
		
		
		
		try {
			n1.getT().join();
			n2.getT().join();
			n3.getT().join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Process end");
		
	}

}

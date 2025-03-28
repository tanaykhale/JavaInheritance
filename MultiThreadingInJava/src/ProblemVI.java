import java.util.*;
import threads.Prime;
public class ProblemVI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sidx,eidx;
		System.out.println("Enter the range:");
		sidx=sc.nextInt();
		eidx=sc.nextInt();
		Prime p=new Prime(sidx,eidx);
		Prime p1=new Prime(sidx,eidx);
		p.getT().setPriority(10);
		p.getT().setPriority(1);
		p.getT().start();
		p1.getT().start();
		
		try {
			p.getT().join();
			Thread.sleep(500);
			p1.getT().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

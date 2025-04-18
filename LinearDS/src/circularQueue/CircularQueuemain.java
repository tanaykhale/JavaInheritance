package circularQueue;
import java.util.*;
public class CircularQueuemain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,data;
		System.out.println("Enter the size of queue");
		int size=sc.nextInt();
		CircularQueue cq=new CircularQueue(size);
		while(true) {
			System.out.println("1.EnQueue");
			System.out.println("2.DeQueue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the data");
				data=sc.nextInt();
				cq.enQueue(data);
				break;
			case 2:
				cq.deQueue();
				break;
			case 3:
				cq.display();
				break;
			case 4:
				System.exit(0);
				break;
			}
		}

	}

}

import java.util.Scanner;

import queue.Queu;

public class queuemain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queu q=new Queu();
		while(true) {
			int ch;
			System.out.println("1. Initialize the queue");
			System.out.println("2. Dequeue the element");
			System.out.println("3. Enqueue the element");
			System.out.println("4. Display queue");
			System.out.println("5. Exit.");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				q.init();
				break;
			case 2:
				System.out.println("Enter the value");
				int val=sc.nextInt();
				q.deQueue(val);
				break;
			case 3:
				System.out.println("Element poped: "+q.enQueue());
				break;
			case 4:
				q.display();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice"); 
			
			}
			
		}
	}
}

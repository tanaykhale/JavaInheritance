package dynamicqueue;

import java.util.Scanner;

import dynamicStack.StackDL;
import queue.Queu;

public class Queuemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		QueueDL q=new QueueDL();
		while(true) {
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display queue");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the data");
				int data=sc.nextInt();
				q.enQueue(data);
				break;
			case 2:
				System.out.println("Deleted data: "+q.deQueue());
				break;
			case 3:
				q.display();
				break;
				
			default:
				System.out.println("Enter the correct choice");
				break;
			}
		}
	}

}

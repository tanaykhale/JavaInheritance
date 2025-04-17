package Doublylinkedlist;
import java.util.*;
public class Doublymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DoublyOperations dll=new DoublyOperations();
		int ch;
		int val;
		while(true) {
			System.out.println("1.Add data at start");
			System.out.println("2.Add data at end");
			System.out.println("3.Add at middle by data");
			System.out.println("4.Get count of nodes");
			System.out.println("5.Add by position");
			System.out.println("6.Delete at start");
			System.out.println("7.Delete at end");
			System.out.println("8.Delete at mid by data");
			System.out.println("99.Display");
			System.out.println("0.Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the data");
				 val=sc.nextInt();
				dll.addAtStart(val);
				break;
			case 2:
				System.out.println("Enter the data");
				 val=sc.nextInt();
				dll.addAtEnd(val);
				break;
			case 3:
				System.out.print("Enter the data of new node");
				val=sc.nextInt();
				System.out.println("Enter the data existing in list");
				int data=sc.nextInt();
				dll.addAtMid(val,data);
				break;
			case 4:
				System.out.println("Count of nodes: "+dll.getCount());
				break;
			case 5:
				System.out.println("Enter data of new node");
				val=sc.nextInt();
				System.out.println("Enter the index");
				int idx=sc.nextInt();
				dll.addAtIdx(val, idx);
				break;
			case 6:
				dll.deleteAtStart();
				break;
			case 7:
				dll.deleteAtEnd();
				break;
			case 8:
				System.out.println("Enter the data you want to delete");
				val=sc.nextInt();
				dll.deleteAtMid(val);
				break;
			case 99:
				dll.display();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the choice from above options");
				break;
			}
		}
	}

}

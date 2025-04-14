import java.util.*;

import Singlylinkedlist.SinglyLInkedList;
public class Singlylinkedlistmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SinglyLInkedList s=new SinglyLInkedList();
		while(true) {
			System.out.println("1.Add data");
			System.out.println("2.Add at the end");
			System.out.println("3.Add data in between and give value after which data should be added");
			System.out.println("4.Count of nodes");
			System.out.println("99.Display");
			System.out.println("0.Exit....");
			int ch=sc.nextInt();
			switch(ch) {
			case 0:
				System.exit(0);
				break;
			case 1:
				s.addData();
				break;
			case 2:
				s.addEnd();
				break;
			case 3:
				System.out.println("Enter the value");
				int value=sc.nextInt();
				s.addBetween(value);
				break;
			case 4:
				System.out.println("Number of nodes: "+s.countNode());
				break;
			case 99:
				s.display();
				break;
			default:
				System.out.println("Enter the correct choice");
					
			}
		}

	}

}

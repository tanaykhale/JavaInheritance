package Circularll;
import java.util.Scanner;
public class Circularmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CircularllOperation s=new  CircularllOperation();
		while(true) {
			System.out.println("1.Add data");
			System.out.println("2.Add at the end");
			System.out.println("3.Add data in between and give value after which data should be added");
			System.out.println("4.Count of nodes");
			System.out.println("5.Delete node from start");
			System.out.println("6.Delete node from end");
			System.out.println("7.Delete at value");
//			System.out.println("8.Reverse linked list");
			System.out.println("9.Update data");
			System.out.println("10.Delete at index");
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
			case 5:
				s.deleteStart();
				break;
			case 6:
				s.deleteEnd();
				break;
			case 7:
				System.out.println("Enter the value at which you want to delete the data: ");
				int val=sc.nextInt();
				s.deleteAtValue(val);
				break;
//			case 8:
//				s.reverse();
//				break;
			case 9:
				System.out.println("Enter the idex at which you want to update the data");
				int idx=sc.nextInt();
				System.out.println("Enter the data");
				int data=sc.nextInt();
				s.update(idx,data);
				break;
			case 10:
				System.out.println("Enter the idex at which you want to delete the data");
				int didx=sc.nextInt();
				s.deleteAtIdx(didx);
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

package dynamicStack;
import java.util.*;
public class Stackmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StackDL s=new StackDL();
		while(true) {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display stack");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the data");
				int data=sc.nextInt();
				s.push(data);
				break;
			case 2:
				System.out.println("Deleted data: "+s.pop());
				break;
			case 3:
				s.display();
				break;
				
			default:
				System.out.println("Enter the correct choice");
				break;
			}
		}

	}

}

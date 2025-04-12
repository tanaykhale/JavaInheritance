import java.util.*;
import stackpackage.Stack;
public class stackmain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Stack<Integer> s=new Stack<Integer>();
		while(true) {
			int ch;
			System.out.println("1. Initialize the stack");
			System.out.println("2. Push the element");
			System.out.println("3. Pop the element");
			System.out.println("4. Display stack");
			System.out.println("5. Exit.");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				s.init();
				break;
			case 2:
				System.out.println("Enter the value");
				int val=sc.nextInt();
				s.Push(val);
				break;
			case 3:
				System.out.println("Element poped: "+s.Pop());
				break;
			case 4:
				s.display();
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

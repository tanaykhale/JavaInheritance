package C2Stack;
import java.util.*;
public class c2Stackmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		c2stack s=new c2stack(size);
		int ch;
		int data;
		while(true) {
			System.out.println("1.Push in stack 1");
			System.out.println("2.Push in stack 2");
			System.out.println("3.Pop in stack 1");
			System.out.println("4.Pop in stack 2");
			System.out.println("5.Display stack 1");
			System.out.println("6.Display  stack 2");
			System.out.println("0.Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("Enter the data");
				data=sc.nextInt();
				s.push1(data);
				break;
			case 2:
				System.out.println("Enter the data");
				data=sc.nextInt();
				s.push2(data);
				break;
			case 3:
				s.pop1();
				break;
			case 4:
				s.pop2();
				break;
			case 5:
				s.display1();
				break;
			case 6:
				s.display2();
				break;
			}
		}
	}

}

import java.util.*;

import EmployeeLinkedList.EmpList;
import EmployeeLinkedList.Employee;
public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e=null;
		EmpList el=new EmpList();
		while(true) {
			System.out.println("1.Enter emp data");
			System.out.println("2.Display data");
			System.out.println("3.Exit..");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter emp id");
				int id=sc.nextInt();
				System.out.println("Enter emp name");
				String n=sc.next();
				System.out.println("Enter emp salary");
				float sal=sc.nextFloat();
				e=new Employee(id, n, sal);
				el.insertData(e);
				break;
			case 2:
				el.display();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the correct choice");
				break;
			}
			
		}

	}

}

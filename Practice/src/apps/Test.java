package apps;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import office.main.*;
import office.newstaff.Adminstrator;
import office.newstaff.Programmer;
import office.newstaff.SalesManager;
import office.staff.*;
public class Test {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Employee[] emps=new Employee[3];
		emps[0]=new SalesManager("Rohan", 1, 04, 2000, 789, 40000, 10, 1000,"234CDE9",10);
		emps[1]=new Programmer("Harry", 12, 4, 2001, 567, 80000, "Employee Management System", 4, 1000,"78ABC90",8);
		emps[2]=new Adminstrator("Kiran", 19, 3, 1890, 342, 120000, 30000);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Study material\\Java\\Practice\\sample.dat"));
		for(Employee e:emps) {
			oos.writeObject(e);
		}
		oos.close();
		Object o[]=new Object[3];
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:\\Study material\\Java\\Practice\\sample.dat"));
		for(Object a:o) {
			a=ois.readObject();
			System.out.println(a);
		}
		
		ois.close();
	}

}

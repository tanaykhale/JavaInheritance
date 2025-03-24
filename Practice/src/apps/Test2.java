package apps;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import office.staff.Employee;
import school.*;
public class Test2{
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		Student[] st=new Student[3];
		st[0]=new Student("Shubham", 1, 7, 2007, "12345TYUI", 23, 234, "DAC", 900000);
		st[1]=new Student("Parag", 1, 7, 2007, "12345TYUI", 23, 234, "DAC", 900000);
		st[2]=new Student("Sachin", 1, 7, 2007, "12345TYUI", 23, 234, "DAC", 900000);
		
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Study material\\Java\\Practice\\sample.dat"));
		for(Student e:st) {
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

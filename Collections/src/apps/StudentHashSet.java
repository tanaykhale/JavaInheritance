package apps;
import java.util.*;
import school.Student;
public class StudentHashSet {

	public static void main(String[] args) {
		Set<Student> s=new HashSet<>();
		s.add(new Student(12,"Rohan","Indore",88.3));
		s.add(new Student(43,"Isha","Delhi",88.3));
		s.add(new Student(78,"Arpit","Mumbai",83.8));
		s.add(new Student(12,"Ajay","Pune",78.3));
		s.add(new Student(12,"Tanay","Bangaluru",98.3));
		s.add(new Student(1,"Tanay","Bangaluru",98.3));
		s.add(new Student(1,"Tanay","Bangaluru",98.3));
		System.out.println(s);
	}

}

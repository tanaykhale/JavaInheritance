package apps;
import java.util.*;
import school.Employee;
public class Problem6  {

	public static void main(String[] args) {
		Set<Employee> s=new TreeSet<>();
		s.add(new Employee(2234, "Roshan", 23000));
		s.add(new Employee(32, "Abhishek", 2000));
		s.add(new Employee(89, "Shubham", 80000.9));
		s.add(new Employee(234, "Shiva", 80000.1));
		s.add(new Employee(24, "Shiva", 80000.1));
		s.add(new Employee(123, "Sourav", 105000));
		
		System.out.println(s);

	}

	
	

}

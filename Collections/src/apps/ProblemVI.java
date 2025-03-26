package apps;
import java.util.*;
import company.*;
public class ProblemVI {

	public static void main(String[] args) {
		
		Set<Emp> emp=new TreeSet<>(new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary()-o2.getSalary());
			}
		
		});
		emp.add(new Emp(123, "Rohan","DAC", 20000));
		emp.add(new Emp(123, "Raj","DBDA", 60000));
		emp.add(new Emp(123, "Ram","DAC", 90000));
		emp.add(new Emp(123, "Anjali","DAC", 50000));
		emp.add(new Emp(123, "Amar","DBDA", 70000));
		emp.add(new Emp(123, "Akbar","DAC", 40000));
		emp.add(new Emp(123, "Anthony","DBDA", 10000));
		
		
		
		Iterator<Emp> val=emp.iterator();
		while(val.hasNext()) {
			System.out.println(val.next());
		}

	}
}

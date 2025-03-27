import java.util.*;
import newcustomer.*;
public class ProblemXVIII {

	public static void main(String[] args) {
		Set<Customer> s=new LinkedHashSet<>();
		s.add(new Customer("AAA", 21000));
		s.add(new Customer("BBB", 98000));
		s.add(new Customer("CCC", 26000));
		s.add(new Customer("DDD", 2000));
		s.add(new Customer("III", 7000));
		s.add(new Customer("EEE", 42000));
		s.add(new Customer("FFF", 24000));
		s.add(new Customer("GGG", 54000));
		s.add(new Customer("AAA", 2000));
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

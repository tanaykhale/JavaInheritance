package apps;
import java.util.*;
public class ProblemI {

	public static  void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("Raja");
		l.add("Ram");
		l.add("Mohan");
		l.add("Roy");
		System.out.println(l);
		l.remove(3);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println("Iterator using advance for each loop");
		for(String s:l) {
			System.out.println(s);
		}
		System.out.println("Iterator using iterator");
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Iterate from back");
		ListIterator<String> litr=l.listIterator();
		while(litr.hasNext()) {
			litr.next();
		}
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}

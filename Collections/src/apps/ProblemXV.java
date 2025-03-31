package apps;
import java.util.*;
import java.util.Map.Entry;

public class ProblemXV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "int");
		map.put(2, "double");
		map.put(3, "float");
		map.put(4, "long");
		map.put(5, "boolean");
		map.put(6, "Comparator");
		
//		System.out.println(map);
		Set<Entry<Integer,String>> s=map.entrySet();
//		Iterator itr=s.iterator();
		for(Entry<Integer,String> i:s) {
			System.out.print(i.getValue()+" ");
		}
		System.out.println();
		for(Entry<Integer,String> i:s) {
			System.out.print(i.getKey()+" ");
		}
		
	

	}

}

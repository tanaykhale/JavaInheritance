package apps;

import java.util.*;

public class ProblemX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Set<String> s=new TreeSet<>(new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				int diff=0;
//				diff=s1.length()-s2.length();
//				if(s1.length() == s2.length())
//					diff=s2.compareTo(s1);
//				return diff;
//			}
//		});
		Set<String> s=new TreeSet<>((String s1,String s2)->{
			int diff=0;
			diff=s1.length()-s2.length();
			if(s1.length() == s2.length())
				diff=s2.compareTo(s1);
			return diff;
			
		});
		
		System.out.println("Enter five strings");
		for(int i=0;i<5;i++) {
			String str=sc.next();
			s.add(str);
		}
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

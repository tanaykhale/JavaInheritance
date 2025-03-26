package apps;
import java.util.*;
public class Assingnment {
public static int  getCapitalCount(String s) {
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			count++;
	}
	return count;
	
}
	public static void main(String[] args) {
		Set<String> words = new TreeSet<>(new Comparator<String>() {
			
			public int compare(String s1, String s2) {
				int diff = getCapitalCount(s2) - getCapitalCount(s1);
				if(diff == 0) {
					s1.compareTo(s2);
				}
				return diff;
			}
			
		});
		
		words.add("INDia");
		words.add("");
		words.add("JAPAN");
		words.add("GErmany");
		words.add("Australia");
		words.add("ENGLAND");
		System.out.println(words);

	}

}

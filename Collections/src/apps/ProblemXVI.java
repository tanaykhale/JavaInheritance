package apps;
import java.util.*;
import java.util.Map.Entry;
public class ProblemXVI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="coccacola";
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count++;
				map.replace(ch, count);
			}
			else {
				map.put(ch, 1);
			}
		}
		Set<Entry<Character,Integer>> s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

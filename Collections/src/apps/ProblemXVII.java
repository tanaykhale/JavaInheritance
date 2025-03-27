package apps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;

public class ProblemXVII {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("D:\\Study material\\Java\\Collections\\emails.txt"));
		String s;
		List<String> l=new ArrayList<>();
		Map<String,Integer> map=new HashMap<>();
		while((s=br.readLine())!=null) {
			l.add(s);
		}
		String id = "";
		for(String str:l) {
			int idx=str.indexOf('@');
			id=str.substring(idx+1);
			if(map.containsKey(id)) {
				int count=map.get(id);
				count++;
				map.replace(id, count);
			}
			else {
				map.put(id, 1);
			}
			
		}
		Set<Entry<String,Integer>> s1=map.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

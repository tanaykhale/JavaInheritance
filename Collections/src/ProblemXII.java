import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class ProblemXII {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		List<List<Integer>> l = new ArrayList<>();
		List<Integer> sum=new ArrayList<>();
		while (!(s = br.readLine()).equals("stop")) {
			List<Integer> row = new ArrayList<>();

//                if (s.charAt(i) != ' ') { 
//                    int data = s.charAt(i) - '0'; 
//                    row.add(data);
//                }
			int ssum=0;
			String arr[] = s.split(" ");
			
			for (String data : arr) {
				int res = Integer.parseInt(data);
				ssum+=res;
				row.add(res);
			}
			sum.add(ssum);
			l.add(row);
		}

		System.out.println(l);
		System.out.println(sum);
		

	}

}

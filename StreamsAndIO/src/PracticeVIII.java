import java.io.BufferedReader;
import java.io.FileReader;

public class PracticeVIII {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("D:\\Study material\\Java\\StreamsAndIO\\demo.txt"));
		String str;
		int maxlen=0;
		while((str=br.readLine())!=null) {
			if(str.length()>maxlen) {
				maxlen=str.length();
			}
		}
		
		System.out.println(maxlen);
		BufferedReader br1=new BufferedReader(new FileReader("D:\\Study material\\Java\\StreamsAndIO\\demo.txt"));
		String s;
		while((s=br1.readLine())!=null) {
			if(maxlen==s.length()) {
				System.out.println(s);
			}
		}
		br.close();
		
	}

}

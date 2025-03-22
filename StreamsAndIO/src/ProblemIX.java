import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ProblemIX {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file name");
		String str=br.readLine();
		File f=new File("D:\\Study material\\Java\\StreamsAndIO\\"+str);
		
		int maxlen=0;
		if(f.exists()) {
			br=new BufferedReader(new FileReader(f));
			String str1;
			while((str1=br.readLine())!=null) {
				if(str1.length()>maxlen) {
					maxlen=str1.length()-1;
				}
			}
		}
		System.out.println(maxlen);
		String str2;
		BufferedReader br1 = new BufferedReader(new FileReader(f));
		while((str2=br1.readLine())!=null) {
			int len=str2.length()-1;
			if(maxlen-len==0) {
				System.out.println(str2);
				continue;
			}
			for(int i=0;i<(maxlen-len);i++) {
				System.out.print("-");
			}
			System.out.println(str2);
		}
		
		
		
		
	}

}

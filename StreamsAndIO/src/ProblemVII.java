import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class ProblemVII {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file name");
		String str=br.readLine();
		File f=new File("D:\\Study material\\Java\\StreamsAndIO\\"+str);
		if(f.isFile()) {
			if(f.length()>25) {
				br=new BufferedReader(new FileReader(f));
				String s;
				while((s=br.readLine())!=null) {
					System.out.println(s);
				}
			}
		}
		
		br.close();
		
	}

}

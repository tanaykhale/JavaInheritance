import java.io.*;


public class ProblemIV {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file name");
		String str=br.readLine();
		File f=new File("D:\\Study material\\Java\\StreamsAndIO\\"+str);
		
		FileWriter fw=new FileWriter(f);
		System.out.println("Enter data and enter qu to stop");
		String str1;
		while (!((str1 = br.readLine()).equals("qu")))
			fw.write(str1+"\n");
		
		fw.flush();
		int lineno=0;
		if(f.exists()) {
			br=new BufferedReader(new FileReader(f));
			String str2;
			while((str2=br.readLine())!=null) {
				System.out.println(++lineno+" "+str2);
			}
		}
		
		
		
		br.close();
		fw.close();
		
		
		
	}

}

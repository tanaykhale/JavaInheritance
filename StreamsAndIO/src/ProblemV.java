import java.io.*;
public class ProblemV {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("D:\\Study material\\Java\\StreamsAndIO\\demo.txt");
		File f=new File("D:\\Study material\\Java\\StreamsAndIO\\dest.txt");
		FileWriter fw=new FileWriter(f);
		char []ch=new char[1000];
		int i;
		while((i=fr.read(ch))!=-1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		
		
	}

}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			char ch[]=new char[100];
			FileReader f=new FileReader("D:\\Study material\\Java\\FileHandlingJava\\sample");
			int i;
			while((i=f.read(ch))!=-1) {
				System.out.println(new String(ch));
			}
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}

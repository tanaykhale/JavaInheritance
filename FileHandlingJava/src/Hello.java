import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader bsr=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q' to quit");
			int i;
			int count=0;
			while((i=bsr.read())!='q') {
				System.out.print((char)i);
				count++;
			}
			System.out.println(count);
			
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import threads.CopyThread;

public class ProblemV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src,dest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of source file");
		src=sc.next();
		System.out.println("Enter the name of destination file");
		dest=sc.next();
		CopyThread c=new CopyThread(src,dest);
		c.getT().start();
		try {
			c.getT().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String data;
		try {
			BufferedReader br=new BufferedReader(new FileReader("D:\\Study material\\Java\\MultiThreadingInJava\\"+dest));
			while((data=br.readLine())!=null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

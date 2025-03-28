import java.io.FileWriter;
import java.io.IOException;

import threads.Divisor;

public class ProblemVIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		FileWriter fw=null;
		try {
			fw=new FileWriter("D:\\Study material\\Java\\MultiThreadingInJava\\destination.txt");
			Divisor d1=new Divisor(32,fw);
			Divisor d2=new Divisor(64,fw);
			Divisor d3=new Divisor(10,fw);
			
			d1.getT().start();
			d2.getT().start();
			d3.getT().start();
			
			try {
				d1.getT().join();
				d2.getT().join();
				d3.getT().join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}

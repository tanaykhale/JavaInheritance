package threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyThread implements Runnable{
	private String s,d;
	private Thread t;
	
	public CopyThread(String s, String d) {
		super();
		t=new Thread(this);
		this.s = s;
		this.d = d;
		
	}
	public  void copy(String src,String dest) {
		String temp;
		FileWriter fw=null;
		try {
			BufferedReader br=new BufferedReader(new FileReader("D:\\Study material\\Java\\MultiThreadingInJava\\"+src));
			fw=new FileWriter("D:\\Study material\\Java\\MultiThreadingInJava\\"+dest);
			
			while((temp=br.readLine())!=null) {
				fw.write(temp+"\n");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void run() {
		copy(s,d);
		System.out.println("Copy successful>>>>");
		
	}

	public Thread getT() {
		return t;
	}
	

}

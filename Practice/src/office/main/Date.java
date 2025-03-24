package office.main;

import java.io.Serializable;

public class Date implements Serializable {
	private int dd,mm,yyyy;
	public Date() {
		dd=mm=yyyy=0;
	}
	public Date(int d,int m,int y){
		dd=d;
		mm=m;
		yyyy=y;
	}
	public void Display() {
		System.out.println(dd+"/"+mm+"/"+yyyy);
	}
	public String toString() {
		
		return dd+ "/" +mm+ "/" +yyyy;
	}
	public int getYear() {
		return yyyy;
	}
}

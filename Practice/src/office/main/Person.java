package office.main;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private  Date dob;
	public Person(){
		name=null;
		dob=null;
	}
	 public Person(String n,int d,int m,int y){
		name=n;
		dob=new Date(d,m,y);
	}
	public void display() {
		if(name==null||dob==null) {
			System.out.println("NO values");
			dob=new Date(0,0,0);
		}
		System.out.println("Person name: "+name);
		dob.Display();
	}
	public String toString() {
		return "Name: "+name+"\n"+"Dob: "+dob.toString();
	}
	public  int getYear() {
		return dob.getYear();
	}
	
}

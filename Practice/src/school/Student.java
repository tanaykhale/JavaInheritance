package school;

import office.main.Person;

@SuppressWarnings("serial")
public class Student extends Person{
	private String PRN;
	private transient int age=2025-getYear();
	private Course course;
	public Student(String n,int d,int m,int y, String pRN, int age,int cid,String cname,double f ) {
		super(n,d,m,y);
		this.age = age;
		PRN = pRN;
		course=new Course(cid,cname,f); 
	}
	public String toString() {
		return super.toString()+"\n"+"PRN: "+PRN+"\n"+"Age: "+age+"\n"+"Course: "+course.toString();
	}
	
	
	
	
}

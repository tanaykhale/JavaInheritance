package school;

import java.io.Serializable;

public class Course implements Serializable {
	private int courseid;
	private String coursename;
	private double fees;
	
	
	
	public Course(int courseid, String coursename, double fees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.fees = fees;
	}



	public String toString() {
		return "Course ID: "+courseid+"\n"+"Course Name: "+coursename+"\n"+"Fees: "+fees;
	}
}

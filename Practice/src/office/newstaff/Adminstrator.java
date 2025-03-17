package office.newstaff;

import office.staff.Employee;

public class Adminstrator extends Employee {
	
	private double allowance;

	public Adminstrator() {
		super();
		// TODO Auto-generated constructor stub
		allowance=0;
	}

	public Adminstrator(String n, int d, int m, int y, int empid, double salary, double allowance) {
		super(n, d, m, y, empid, salary);
		this.allowance = allowance;
	}
	public void display() {
		super.display();
		System.out.println("Allowance of Adminstrator :"+allowance);
	}
	
}

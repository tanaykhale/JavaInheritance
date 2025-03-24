package office.newstaff;

import office.staff.Employee;

public  class Adminstrator extends Employee {
	
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
	public double calSalary() {
		double total=getSalary()+allowance;
		
		return total;
	}
	public void display() {
		super.display();
		System.out.println("Allowance of Adminstrator :"+allowance);
		System.out.println("Final Salary: "+calSalary());
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public String toString() {
		return super.toString()+"\n"+"Allowance: "+allowance;
	}
	
}

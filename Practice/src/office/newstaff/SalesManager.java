package office.newstaff;

import office.staff.Employee;

public  class SalesManager extends Employee {
	private double target;
	private double commision;
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesManager(String n, int d, int m, int y, int empid, double salary, double target, double commision) {
		super(n, d, m, y, empid, salary);
		this.target = target;
		this.commision = commision;
	}
	public double calSalary() {
		double total=getSalary()+commision;
		
		return total;
	}
	
	public void display() {
		super.display();
		System.out.println("Sales Target: "+target);
		System.out.println("Commision: "+commision);
		System.out.println("Final Salary: "+calSalary());
	}
}	

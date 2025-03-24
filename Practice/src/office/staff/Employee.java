package office.staff;

import office.main.Person;

public abstract class Employee extends Person {
	private int empid;
	private double salary;
	
	
	public Employee(String n, int d, int m, int y, int empid, double salary) {
		super(n, d, m, y);
		this.empid = empid;
		this.salary = salary;
	}


	public Employee() {
		
		
	}
	public void display() {
		super.display();
		System.out.println("Emplyee id :"+empid);
		System.out.println("Salary :"+salary);
	}
	public String toString() {
		return  super.toString()+"\n"+"Employee id"+empid+"\n"+"Salary: "+salary;
	}
	public double getSalary() {
		return salary;
	}
	public abstract double calSalary();

}

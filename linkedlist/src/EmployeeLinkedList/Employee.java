package EmployeeLinkedList;

public class Employee {
	private int empid;
	private String ename;
	private float salary;
	public Employee(int empid, String ename, float salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}

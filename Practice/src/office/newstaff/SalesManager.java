package office.newstaff;

import office.staff.Employee;
import travel.ITraveller;

public  class SalesManager extends Employee implements ITraveller  {
	
	private double target;
	private double commision;
	private String passportNum;
	private int travelHours;
	public SalesManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesManager(String n, int d, int m, int y, int empid, double salary, double target, double commision,String pn,int th) {
		super(n, d, m, y, empid, salary);
		this.target = target;
		this.commision = commision;
		this.passportNum=pn;
		this.travelHours=th;
	}
	public double calSalary() {
		double total=getSalary()+commision;
		
		return total;
	}
	
	public double getTarget() {
		return target;
	}
	public void display() {
		super.display();
		System.out.println("Sales Target: "+target);
		System.out.println("Commision: "+commision);
		System.out.println("Final Salary: "+calSalary());
	}
	public double calTA() {
		return calSalary()+1000;
	}
	public String  getPassportDetail() {
		return passportNum;
	}
	public int getTravelHours() {
		return travelHours;
	}
	public String toString() {
		return super.toString()+"Target: "+target+"\n"+"Commision: "+commision+"\n"+
					"Passport number: "+passportNum+"\n"+"Travel hours: "+travelHours+"\n";
	}
}	

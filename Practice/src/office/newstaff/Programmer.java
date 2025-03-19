package office.newstaff;

import office.staff.Employee;
import travel.ITraveller;

public  class Programmer extends Employee implements ITraveller {
	private String title;
	private int  extraHOurs;
	private double chargerperHour;
	private String passportNum;
	private int travelHours;
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programmer(String n, int d, int m, int y, int empid, double salary, String title, int extraHOurs,
			double chargerperHour,String pn,int th) {
		super(n, d, m, y, empid, salary);
		this.title = title;
		this.extraHOurs = extraHOurs;
		this.chargerperHour = chargerperHour;
		this.passportNum=pn;
		this.travelHours=th;
	}
	public double calSalary() {
		double total=getSalary()+extraHOurs*chargerperHour;
		
		return total;
	}
	public String getTitle() {
		return title;
	}
	public void display() {
		super.display();
		System.out.println("Project Tilte: "+title);
		System.out.println("Extra hours spend on project: "+extraHOurs);
		System.out.println("Rate per hour: "+chargerperHour);
		System.out.println("Final Salary: "+calSalary());
	}
	public double calTA() {
		return calSalary()+2000;
	}
	public String  getPassportDetail() {
		return passportNum;
	}
	public int getTravelHours() {
		return travelHours;
	}
}

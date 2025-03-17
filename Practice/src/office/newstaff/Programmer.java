package office.newstaff;

import office.staff.Employee;

public class Programmer extends Employee {
	private String title;
	private int  extraHOurs;
	private double chargerperHour;
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Programmer(String n, int d, int m, int y, int empid, double salary, String title, int extraHOurs,
			double chargerperHour) {
		super(n, d, m, y, empid, salary);
		this.title = title;
		this.extraHOurs = extraHOurs;
		this.chargerperHour = chargerperHour;
	}
	public void display() {
		super.display();
		System.out.println("Project Tilte: "+title);
		System.out.println("Extra hours spend on project: "+extraHOurs);
		System.out.println("Rate per hour: "+chargerperHour);
	}
}

package company;

public class Emp {
	int eid;
	String ename,dept;
	double salary;
	
	public Emp(int eid, String ename, String dept, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public double getSalary() {
		return salary;
	}

	public int getEid() {
		return eid;
	}

	

	public String getEname() {
		return ename;
	}

	

	public String getDept() {
		return dept;
	}

	
	
	
	
}

package school;

public   class Employee implements Comparable<Employee>  {
	int eid;
	String ename;
	double salary;
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", salary=" + salary +"\n";
	}
	@Override
	public int compareTo(Employee o) {
		int diff=0;
		if(this.salary>o.salary) {
			diff=1;
		}
		else if(this.salary<o.salary) {
			diff=-1;
		}
		else {
			diff=o.ename.compareTo(this.ename);
			if(diff==0) {
				diff=this.eid-o.eid;
			}
		}
		return diff;
	}
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	
}

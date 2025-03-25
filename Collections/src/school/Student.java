package school;

import java.util.Objects;

public class Student {
	private int sid;
	private String name,city;
	private double percentage;
	public Student(int sid, String name, String city, double percentage) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + ", percentage=" + percentage + "]"+"\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, name, percentage, sid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage) && sid == other.sid;
	}
	
	
	
	
	
	

}

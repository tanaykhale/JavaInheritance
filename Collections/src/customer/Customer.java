package customer;

import java.io.Serializable;

public class Customer implements Serializable{
	private String name,email;
	private int number;
	public Customer(String name, String email, int number) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	
	

}

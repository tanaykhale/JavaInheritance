package customer;

public class RegisteredCustomer extends Customer{
	private int regno;
	public RegisteredCustomer(String name, String email, int number ,int r) {
		super(name, email, number);
		regno=r;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"\n"+"Registered Number: "+regno;
	}
	

}

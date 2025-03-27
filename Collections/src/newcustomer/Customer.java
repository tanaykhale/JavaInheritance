package newcustomer;

public class Customer implements Comparable<Customer>{
	private String name;
	private int id;
	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Customer o) {
        // Compare by name first, then by id if names are equal
        int nameComparison = this.name.compareTo(o.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(this.id, o.id);
    }
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Customer other = (Customer) obj;
	        return this.name.equals(other.name) && this.id == other.id;
	    }
	
	
	
	
	
	
}

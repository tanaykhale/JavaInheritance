package offfice.book;

public class Book {
	private int bookno;
	private String name;
	private int cost;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookno, String name, int cost) {
		super();
		this.bookno = bookno;
		this.name = name;
		this.cost = cost;
	}
	public void display() {
		System.out.println("Book number: "+bookno);
		System.out.println("Book name: "+name);
		System.out.println("Cost of book: "+cost);
	}
	
}

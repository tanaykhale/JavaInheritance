package office.library;

import offfice.book.Book;
import office.main.Date;

public class PaperBook extends Book {
	private int numberOfPages;
	private Date publication;
	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
		numberOfPages=0;
		publication=null;
	}
	public PaperBook(int num,String name,int cost,int numberOfPages, Date publication) {
		super(num,name,cost);
		this.numberOfPages = numberOfPages;
		this.publication = publication;
	}
	
	public void display() {
		super.display();
		System.out.println("Number of pages: "+numberOfPages);
		publication.Display();
		
	}
	

}

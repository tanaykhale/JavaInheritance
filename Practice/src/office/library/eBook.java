package office.library;

import offfice.book.Book;

public class eBook extends Book {
	private String url;
	private double sizeinMB;
	public eBook() {
		super();
		url="URL Not avialable";
		sizeinMB=0.0;
	}
	public eBook(int bookno,String name,int cost,String url, double sizeinMB) {
		super(bookno,name,cost);
		this.url = url;
		this.sizeinMB = sizeinMB;
	}
	public void display() {
		super.display();
		System.out.println("URL: "+url);
		System.out.println("Size of Book: "+sizeinMB+"MB");
	}
	

}

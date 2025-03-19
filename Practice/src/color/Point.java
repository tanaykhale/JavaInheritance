package color;

public class Point {
	private int x,y;

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void display() {
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
	}
}

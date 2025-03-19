package color;

public class ColorPoint extends Point {
	private String c;
	static String colour[];
	static {
		colour=new String[4];
		colour[0]="red";
		colour[1]="blue";
		colour[2]="green";
		colour[3]="yellow";
	}
	public ColorPoint() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public ColorPoint(int x,int y,String s) {
		super(x,y);
		for(int i=0;i<4;i++) {
			if(colour[i].equals(s)) {
				c=colour[i];
				break;
			}
			else
				c="Black";
		}
	}
	public void display() {
		super.display();
		System.out.println("Colour: "+c);
	}
}

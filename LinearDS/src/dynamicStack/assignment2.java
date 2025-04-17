package dynamicStack;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDL s=new StackDL();
		String str="Bombay";
		for(int i=0;i<str.length();i++) {
			s.push(str.charAt(i));
		}
		s.display2();
	}

}

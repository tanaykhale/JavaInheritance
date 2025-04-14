
import stackpackage.Stack;
public class assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> s=new Stack<Character>();
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		s.init();
		for(int i=0;i<str.length();i++) {
				s.Push(str.charAt(i));
		}
		for(char a='A';a<='Z';a++)
		{
			s.Push(a);
		}
		s.display();	
	}

}

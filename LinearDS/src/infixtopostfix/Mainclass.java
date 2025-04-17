package infixtopostfix;
import java.util.*;
public class Mainclass {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		Stack s=new Stack(str.length());
		String postfix=s.convert(str);
		System.out.println("Postfix expression: "+postfix);
	}
}

import java.util.*;

import Exception.PasswordToLongException;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem 1
//		try {
//			int n=Integer.parseInt(args[0]);
//			int m=Integer.parseInt(args[1]);
//			System.out.println("Result "+n/m);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBound exception: ");
//		}
//		catch (ArithmeticException a) {
//			System.out.println("Second argument cannot be zero!!!!");
//		}
//		catch(NumberFormatException n) {
//			System.out.println("Enter number only");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//Problem 2
		Scanner sc=new Scanner(System.in);
//		try {
//		System.out.println("Enter the array size:");
//		int size=sc.nextInt();
//		int arr[]=new int[size];
//		for(int i=0;i<size;i++) {
//			System.out.println("Enter the array elements:");
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<size;i++) {
//			System.out.print(arr[i]+" ");
//			
//		}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		String pwd;
		try {
			System.out.println("Enter the password:");
			pwd=sc.next();
			if(pwd.length()>12)
				throw new PasswordToLongException();
			
		}
		catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}

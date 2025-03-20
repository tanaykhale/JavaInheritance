import java.util.*;

import Exception.InvalidCountryException;
import Exception.PasswordValid;
public class Registration {

public static boolean notIndia(String country) {
	return !country.equals("india");
}
public static boolean validateName(String first,String last) {
	if(first.charAt(0)<=('Z') && first.charAt(0)>='A' ) {
		for(int i=1;i<first.length()||i<last.length();i++) {
			if(first.charAt(i)>='a'&& first.charAt(i)<='z'&& last.charAt(i)>='a'&& last.charAt(i)<'z')
				return true;
		}
	}
	return false;
	
}

public static boolean checkPwd(String p) {
    boolean flagU = false; 
    boolean flagL = false; 
    boolean flagS = false;
    boolean flagN = false; 
    String special = "!@#$%^&*()_+";

    for (int i = 0; i < p.length(); i++) {
        char ch = p.charAt(i);

        if (Character.isUpperCase(ch)) {
            flagU = true;
        }
        if (Character.isLowerCase(ch)) {
            flagL = true;
        }
        if (Character.isDigit(ch)) {
            flagN = true;
        }
        if (special.contains(String.valueOf(ch))) {
            flagS = true;
        }
    }

    return flagS && flagU && flagL && flagN;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the user name");
//		String name=sc.nextLine();
//		System.out.println("Enter the country name");
//		String country=sc.nextLine();
//		try {
//			if(notIndia(country))
//				throw new InvalidCountryException();
//			else
//				System.out.println("Registration successfully");
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		//Problem 5
//		System.out.println("Enter the first name");
//		String first =sc.nextLine();
//		System.out.println("Enter the last name");
//		String last=sc.nextLine();
//		try {
//			if(validateName(first,last))
//				System.out.println("Welcome "+first+" "+last);
//			else
//				throw new InvalidCountryException();
//				
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		//Problem 6
//		System.out.println("Enter the password");
//		String pwd=sc.nextLine();
//		try {
//			if(checkPwd(pwd))
//				System.out.println("Correct Password");
//			if(!checkPwd(pwd))
//				throw new PasswordValid();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		//Problem 7
		Stack s=new Stack(4);
		s.Push(23);
		s.Push(67);
		s.Push(67);
		s.Push(78);
		
		
		s.display();
		System.out.println("Pop: "+s.Pop());
		System.out.println("Pop: "+s.Pop());
		System.out.println("Pop: "+s.Pop());
		System.out.println("Pop: "+s.Pop());
		System.out.println("Pop: "+s.Pop());

	}

}

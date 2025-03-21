import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int i = 0;
        int j = str.length() - 1;
        boolean flag = true;

        while (i < j) {
        	if(str.length()%2!=0) {
        		flag=false;
        		break;
        	}
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
		if(flag)
			System.out.println("is Palindrome");
		else
			System.out.println("Not a palindrome");
		
//		String rev="";
//		while(j>=0) {
//			rev=rev+str.charAt(j);
//			j--;
//		}
//		if(rev.equals(str))
//			System.out.println("is palindrome");
//		else
//			System.out.println("not palindrome");
		

	}

}

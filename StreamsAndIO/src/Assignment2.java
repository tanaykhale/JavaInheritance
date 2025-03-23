import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number");
		String str=sc.nextLine();
		int res=0;
		int j=0;
		if(str.length()>9) {
			System.out.println("Not a binary number");
			return;
		}
		for(int i=str.length()-1;i>=0;i--) {
			int num=str.charAt(i)-'0';
			if(num!=0)
				res=(int) (res + Math.pow(2, j));
			j++;
		}
		System.out.println("Decimal conversion: "+res);
		
	}

}

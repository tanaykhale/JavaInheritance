import java.util.*;
public class Assignment {
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Accept two number from user A<B if not exit ,if true find the prime number between A and B
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=a;i<b;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
		

	}}

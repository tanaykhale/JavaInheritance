import abstractclass.MyNumber;
import abstractclass.ScientificCalculator;
import abstractclass.SimpleCalculator;

public class CalculateMain {

	public static void main(String[] args) {
		SimpleCalculator sc=new SimpleCalculator();
		System.out.println( sc.add(2,3));		
		ScientificCalculator sc1=new ScientificCalculator();
		System.out.println(sc1.cos(0));
		MyNumber mn=new MyNumber();
		System.out.println(mn.isPrime(4));
		System.out.println(mn.calFactorial(5));
	}

}

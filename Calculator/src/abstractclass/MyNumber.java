package abstractclass;

import abstractmethod.AdvIntOperations;
import abstractmethod.BasicIntOperations;

public class MyNumber implements BasicIntOperations, AdvIntOperations {

	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

	public double calFactorial(int num) {
		// TODO Auto-generated method stub
		if(num==0||num==1)
			return 1;
		return num*calFactorial(num-1);
	}

	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return num%2!=0;
	}

	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		return num%2==0;
	}

}

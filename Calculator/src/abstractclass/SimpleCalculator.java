package abstractclass;

import abstractmethod.iCalculator;

public class SimpleCalculator implements iCalculator {
	
	public double add(int x,int y) {
		return x+y;
	}
	public double subtract(int x,int y) {
		return x-y;
	}
	public double divide(int x,int y) {
		if(y==0) {
			return 0;
		}
		return x/y;
	}
	public double multiply(int x,int y) {
		return x*y;
	}
	
}

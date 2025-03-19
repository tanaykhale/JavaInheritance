package abstractclass;

import abstractmethod.iScientificCalculator;

public  class ScientificCalculator implements iScientificCalculator {

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

	public double sin(double angle) {
		// TODO Auto-generated method stub
		return Math.sin(angle);
	}

	
	public double cos(double angle) {
		// TODO Auto-generated method stub
		return Math.cos(angle);
	}

	
	public double tan(double angel) {
		// TODO Auto-generated method stub
		return Math.tan(angel);
	}

}

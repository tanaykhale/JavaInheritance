package apps;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import company.Emp;

public class ProblemIX {

	public static void main(String[] args) {
		Set<Emp> emp=new TreeSet<>(new Comparator<Emp>() {

			@Override
			public int compare(Emp e1, Emp e2) {
				// TODO Auto-generated method stub
				int res=0;
				if(!e1.getDept().equals(e2.getDept())) {
					res=1;
				}
				else if(e1.getSalary()!= e2.getSalary()) {
					res=(int) (e2.getSalary()-e1.getSalary());
				}
				else if(!e1.getEname().equals(e2.getEname())) {
					res=e1.getEname().compareTo(e2.getEname());
				}
				else if(e1.getEid()!= e2.getEid()) {
					res=e1.getEid()-e2.getEid();
				}
				return res;
			}
		
		});
		emp.add(new Emp(123, "Rohan","DAC", 20000));
		emp.add(new Emp(13, "Rohan","DAC", 50000));
		emp.add(new Emp(16, "amit","DAC", 50000));
		emp.add(new Emp(18, "amit","DAC", 50000));
		emp.add(new Emp(18, "amit","DBDA", 50000));
		
		
		
		Iterator<Emp> val=emp.iterator();
		while(val.hasNext()) {
			System.out.println(val.next());
		}

	}

}

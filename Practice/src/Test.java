import office.main.*;
import color.ColorPoint;
import office.newstaff.Adminstrator;
import office.newstaff.Programmer;
import office.newstaff.SalesManager;
import sports.players.*;
import travel.ITraveller;
import office.staff.*;
import office.library.*;
public class Test {
	static void showMoreDetails(Employee e[]) {
		for(Employee i:e) {
			if(i instanceof SalesManager)
				System.out.println( ((SalesManager) i).getTarget());
			if(i instanceof Programmer)
			 	System.out.println(((Programmer)i).getTitle());
			if(i instanceof Adminstrator)
				System.out.println(((Adminstrator)i).getAllowance());
		}
	}
	static void showTravelDetails(Employee e[]) {
		int countTotalHours=0;
		for(Employee i:e) {
			if(i instanceof ITraveller) {
				
				if(i instanceof SalesManager) {
					System.out.println("SalesManager");
					System.out.println(("Passport number:"+((SalesManager)i).getPassportDetail()));
					System.out.println(("Travel hours: "+((SalesManager)i).getTravelHours()));
					System.out.println("*********************");
					countTotalHours+=((SalesManager)i).getTravelHours();
				}
				if(i instanceof Programmer ) {
					System.out.println("Programmer");
					System.out.println(("Passport number:"+((Programmer)i).getPassportDetail()));
					System.out.println(("Travel hours: "+((Programmer)i).getTravelHours()));
					countTotalHours+=((Programmer)i).getTravelHours();
					System.out.println("***************************");
				}
			}
		}
		System.out.println("Total number of hours travelled by all: "+countTotalHours);
	}

	public static void main(String[] args) {

		Person p=new Person("Tanay",12,1,2002);
//		p.display();
//		Person e=new Employee("Tanay",12,1,2002,654,1234567);
//		Employee[] e=new Employee[3];
//		e[0]=new Employee("Tanay",12,1,2002,654,1234567);
//		e[1]=new Employee("Tanay",12,1,2002,654,1234567);
//		e[2]=new Employee("Tanay",12,1,2002,654,1234567);
//		System.out.println(e[0]);
		
//		Employee sm=new SalesManager("Tanay",12,1,2002,543,123456,12,1000);
//		sm.display();
//		System.out.println("Total Salary: "+sm.calSalary());
		
		Employee e[]=new Employee[3];
		e[0]=new SalesManager("Rohan", 1, 04, 2000, 789, 40000, 10, 1000,"234CDE9",10);
		e[1]=new Programmer("Harry", 12, 4, 2001, 567, 80000, "Employee Management System", 4, 1000,"78ABC90",8);
		e[2]=new Adminstrator("Kiran", 19, 3, 1890, 342, 120000, 30000);
		
//		System.out.println(e[0].toString());
//		System.out.println(e[1].toString());
//		System.out.println(e[2].toString());
//		e[0].display();
//		e[1].display();
//		e[2].display();
//		double totalSalary=0;
//		for(Employee i:e) {
//			totalSalary+=i.getSalary();
//		}
//		System.out.println("Total Salary : "+totalSalary);
//		for(Employee i:e) {
//			if(i instanceof ITraveller)
//					i.display();
//		}
		showMoreDetails(e);
		showTravelDetails(e);
		
//		ColorPoint cp=new ColorPoint(2, 3, "xyz");
//		cp.display();

		
		
//		System.out.println("Book");
//		PaperBook p=new PaperBook(122,"Rich Dad, Poor Dad",700,300,new Date(17,1,2002));
//		p.display();
//		System.out.println("EBook");
//		eBook e=new eBook(123,"Fings On Fire",400,"https:\\worldfreeforbooks.com",49.5);
//		e.display();
		
//		FootballPlayer p=new FootballPlayer("Ronaldo",3,5,1999,07,1234678,100);
//		p.display();
	}
	
}

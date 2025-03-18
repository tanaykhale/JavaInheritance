import office.main.*;
import office.newstaff.Adminstrator;
import office.newstaff.Programmer;
import office.newstaff.SalesManager;
import sports.players.*;
import office.staff.*;
import office.library.*;
public class Test {

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
		e[0]=new SalesManager("Rohan", 1, 04, 2000, 789, 40000, 10, 1000);
		e[1]=new Programmer("Harry", 12, 4, 2001, 567, 80000, "Employee Management System", 4, 1000);
		e[2]=new Adminstrator("Kiran", 19, 3, 1890, 342, 120000, 30000);
		
//		System.out.println(e[0].toString());
//		System.out.println(e[1].toString());
//		System.out.println(e[2].toString());
		e[0].display();
		e[1].display();
		e[2].display();
		double totalSalary=0;
		for(Employee i:e) {
			totalSalary+=i.getSalary();
		}
		System.out.println("Total Salary : "+totalSalary);
		
		
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

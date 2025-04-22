package mergeTwoSortedList;
import java.util.*;
public class MergeMain {
	public static void merge(Node list1,Node list2) {
		Node list=new Node(0);
		Node temp=list;
		Node temp1=list1;
		Node temp2=list2;
		while(temp1!=null && temp2!=null) {
			if(temp1.getData()<temp2.getData()) {
				temp.setNext(temp1);
				temp1=temp1.getNext();
				temp=temp.getNext();
				
			}
			else {
				temp.setNext(temp2);
				temp2=temp2.getNext();
				temp=temp.getNext();
			}
			temp.setNext(null);
		
		}
		while(temp1!=null)
		{
			temp.setNext(temp1);
			temp1=temp1.getNext();
		}
		while(temp2!=null) {
			
			temp.setNext(temp2);
			temp2=temp2.getNext();
		}

		list=list.getNext();

		display(list);
	}
	public static void display(Node list) {
		Node temp=list;;
		while(temp!=null) {
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch,data;
		Merge m=new Merge();
		Merge m2=new Merge();
		while(true) {
			System.out.println("1.Add data in list1");
			System.out.println("2.Add data in list2");
			System.out.println("3.Display merge list");
			System.out.println("4.Exit");
			System.out.println("5.dispaly list1");
			System.out.println("6.dispaly list2");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter data");
				data=sc.nextInt();
				m.add1(data);
				break;
			case 2:
				System.out.println("Enter data");
				data=sc.nextInt();
				m2.add1(data);
				break;
			case 3:
				//m.display();
				merge(m.getList1(),m2.getList1());
				break;
			case 4:
				System.exit(0);
				break;
			case 5:
				m.display1();
				break;
			case 6:
				m2.display1();
				break;
			}
		}
	}

}

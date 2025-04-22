package mergeTwoSortedList;

public class Merge {
	private Node list1;

	//private Node list;
	
	public void add1(int data) {
		Node newnode=new Node(data);
		if(list1==null) {
			list1=newnode;
			return;
		}
		Node tempnew=list1;
		while(tempnew.getNext()!=null) {
			tempnew=tempnew.getNext();
		}
		tempnew.setNext(newnode);
	}
	public void display1() {
		Node temp=list1;
		while(temp!=null) {
			System.out.println(temp.getData()+"->");
			temp=temp.getNext();
		}
	}
	public Node getList1() {
		return list1;
	}
	public void setList1(Node list1) {
		this.list1 = list1;
	}
	
	
	
	
}

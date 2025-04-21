package tree;
import java.util.*;
public class treeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch,data;
		treeOperations bst=new treeOperations();
		while(true) {
			System.out.println("1.Add node");
			System.out.println("2.Pre-order traversal");
			System.out.println("3.In-order traversal");
			System.out.println("4.Post-order traversal");
			System.out.println("0.Exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the data");
				data=sc.nextInt();
				bst.add(data);
				break;
			case 2:
				bst.preOrder(bst.getRoot());
				break;
			case 3:
				bst.inOrder(bst.getRoot());
				break;
			case 4:
				bst.postOrder(bst.getRoot());
				break;
			case 0:
				System.exit(0);
			}
		}

	}

}

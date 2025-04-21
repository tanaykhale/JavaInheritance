package tree;

public class treeOperations {
	private Node root;
	
	public Node getRoot() {
		return root;
	}
	public void add(int data) {
		Node newNode=new Node(data);
		Node temp=root;
		if(root==null) {
			root=newNode;
		}
		else if(root !=null) {
			while(true) {
				if(data<temp.getData()) {
					if(temp.getLeft()==null) {
						temp.setLeft(newNode);
						break;
					}
					else
						temp=temp.getLeft();
				}
				else if(data>temp.getData()) {
					if(temp.getRight()==null) {
						temp.setRight(newNode);
						break;
					}
					else
						temp=temp.getRight();
				}
			}
		}
		else
			System.out.println("Duplicate value not allowed");
	}
	public void preOrder(Node root) {
		if(root == null)
			return;
		System.out.print(root.getData()+",degree "+degreeOfNodes(root)+"\n");
		preOrder(root.getLeft());
		preOrder(root.getRight());
		
	}
	public void inOrder(Node root) {
		if(root == null)
			return;
		preOrder(root.getLeft());
		System.out.print(root.getData()+",");
		preOrder(root.getRight());
		
	}
	public void postOrder(Node root) {
		if(root == null)
			return;
		preOrder(root.getLeft());
		preOrder(root.getRight());
		System.out.print(root.getData()+",");
		
	}
	public int degreeOfNodes(Node root) {
		Node temp=root;
		int count=0;
		if(root.getLeft()!=null)
			count++;
		if(root.getRight()!=null)
			count++;
		return count;
	}
}

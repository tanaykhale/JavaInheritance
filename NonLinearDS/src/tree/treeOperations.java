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
		System.out.print(root.getData()+",");
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
	public void delete(int value) {
		Node tag=root;
		Node temp=root;
		int flag=0;
		while(temp!=null) {
			if(temp.getData()==value) {
				flag=1;
				break;
			}
			if(value<temp.getData()) {
				tag=temp;
				temp=temp.getLeft();
			}
			if(value>temp.getData()) {
				tag=temp;
				temp=temp.getRight();
			}
		}//while
		if(flag==1) {
			if(temp.getLeft()==null && temp.getRight()==null) {
				if(temp==tag.getLeft())
					tag.setLeft(null);
				else if(temp==tag.getRight())
					tag.setRight(null);
			}
			else if(temp.getLeft()!=null && temp.getRight()==null) {
				if(tag.getLeft()==temp) {
					tag.setLeft(temp.getLeft());
				}
				else if(tag.getRight()==temp) {
					tag.setRight(temp.getLeft());
				}
				tag.setLeft(null);
				tag.setRight(null);
			}
			else if(temp.getRight()!=null && temp.getLeft()==null) {
				if(tag.getRight()==temp)
					tag.setRight(temp.getRight());
				else if(tag.getLeft()==temp)
					tag.setLeft(temp.getRight());
				
				temp.setRight(null);
			}
			else if(temp.getRight()!=null && temp.getLeft()!=null) {
				Node tag2=temp.getRight();
				while(tag2.getLeft()!=null) {
					tag2=tag2.getLeft();
				}
				if(temp==tag.getRight()) {
					tag.setRight(temp.getRight());
				}
				else if(temp==tag.getLeft()) {
					tag.setLeft(temp.getRight());
				}
				tag2.setLeft(temp.getLeft());
				temp.setLeft(null);
				temp.setRight(null);
			}
		}
		else
			System.out.println("Node not found");
	}
}

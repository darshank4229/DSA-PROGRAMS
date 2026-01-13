package BinaryTree;

class Node11{
	int value;
	Node11 left,right;
}
class BinaryTreeTraverse{
	Node11 root;
	public BinaryTreeTraverse() {
		this.root=null;
	}
	public void insert(int value) {
		root=insertion(root,value);
	}
	public  Node11 insertion(Node11 cn, int value) {
		if(cn==null) {
			Node11 n1 = new Node11();
			n1.value=value;
			System.out.println("value inserted :"+value);
			return n1;		
		}
		else if(value<=cn.value) {
			cn.left=insertion(cn.left,value);
		}
		else {
			cn.right=insertion(cn.right,value);
		}
		return cn;
	}
	
	public void preorder(Node11 root) {
		if (root == null)
			return;

		System.out.print(root.value + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public void inorder(Node11 root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.value + " ");
		inorder(root.right);
	}

	public  void postorder(Node11 root) {
		if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.value + " ");
	}
	
	
	public void BinarySearch(Node11 node,int searchvalue) {
		if(node==null) {
			System.out.println("not present ");	
			return;
		}
		else if(searchvalue==node.value) {
			System.out.println("present");
		}
		else if(searchvalue<=node.value) {
			BinarySearch(node.left, searchvalue);
		}
		else {
			BinarySearch(node.right, searchvalue);
		}
	}
}

public class Bmainclass {
public static void main(String[] args) {
	BinaryTreeTraverse btt= new BinaryTreeTraverse();

	btt.insert(8);
	btt.insert(1);
	btt.insert(2);
	btt.insert(5);
	btt.insert(4);
	btt.insert(6);
	btt.insert(3);
	btt.insert(9);
	System.out.println("\n---------------------------------------");
	System.out.println("pre-order");
	btt.preorder(btt.root);
	System.out.println("---------------------------------------");
	btt.inorder(btt.root);
	System.out.println("---------------------------------------");
	btt.postorder(btt.root);
}
}

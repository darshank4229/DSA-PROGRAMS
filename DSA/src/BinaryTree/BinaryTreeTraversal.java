package BinaryTree;

class Node {
	char value;
	Node left, right;

}

public class BinaryTreeTraversal {

	Node root;

	public static void preorder(Node root) {
		if (root == null)
			return;

		System.out.print(root.value + " ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.value + " ");
		inorder(root.right);
	}

	public static void postorder(Node root) {
		if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.value + " ");
	}

	public static void main(String[] args) {
		BinaryTreeTraversal bt = new BinaryTreeTraversal();

		Node n1 = new Node();
		n1.value = 'A';

		Node n2 = new Node();
		n2.value = 'B';

		Node n3 = new Node();
		n3.value = 'C';

		Node n4 = new Node();
		n4.value = 'D';

		Node n5 = new Node();
		n5.value = 'E';

		Node n6 = new Node();
		n6.value = 'F';

		Node n7 = new Node();
		n7.value = 'G';


		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		
		preorder(n1);
		System.out.println("\n-------------------------------------");
		inorder(n1);
		System.out.println("\n-------------------------------------");
		postorder(n1);
	}
}

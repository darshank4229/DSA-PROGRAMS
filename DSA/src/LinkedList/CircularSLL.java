package LinkedList;

class Node {
	int value;
	Node next;
}

class CircularLinkedList {
	Node head, tail;


	public void creationofCSLL(int value) {
		Node n1 = new Node();
		n1.value = value;
		n1.next = n1;
		head = tail = n1;
	}


	public void InsertionCSLL(int index, int value) {
		Node n1 = new Node();
		n1.value = value;

		if (head == null) {
			creationofCSLL(value);
			return;
		}

		if (index == 0) {
			n1.next = head;
			head = n1;
			tail.next = head;
		}

		else {
			n1.next = head;
			tail.next = n1;
			tail = n1;
		}
	}

	public void traverse() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		while (temp != head) {
			System.out.println("The value : " + temp.value);
			temp = temp.next;
		} 
	}

	public void searchValue(int searchValue) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		while (temp != head) {
			if (temp.value == searchValue) {
				System.out.println("Value found : " + temp.value);
				return;
			}
			temp = temp.next;
		}

		System.out.println("The value is not present");
	}
}

public class CircularSLL {
	public static void main(String[] args) {

		CircularLinkedList c1 = new CircularLinkedList();

		c1.creationofCSLL(11);
		c1.InsertionCSLL(1, 22);
		c1.InsertionCSLL(2, 33);
		c1.InsertionCSLL(3, 44);
		c1.InsertionCSLL(4, 55);

		c1.traverse();
		c1.searchValue(33);
		c1.searchValue(99);
	}
}

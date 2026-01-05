package LinkedList;

class Node {
	int value;
	Node next;
}

class CircularLinkedList {
	Node head, tail;

	public void creationofCSLL(int value) {
		head = new Node();
		Node n1 = new Node();
		n1.value = value;
		n1.next = n1;
		head = tail = n1;
		tail.next=head;

	}

	public void InsertionCSLL(int index, int value) {
		Node n1 = new Node();
		n1.value = value;
		if (head == null) {
			creationofCSLL(value);
		} else if (index == 0) {
			n1.next = head;
			head = n1;
			tail.next=head;
		} else {
			n1.next = head;
			tail.next = n1;
			tail = n1;		
		}
	}
	
	public void traverse() {
		Node temp=head;{
			while(temp!=null) {
				System.out.println("The value :"+temp.value);
				temp=temp.next;
			}
		}
	}
	
	public Node reverse() {
		Node prev=null,mid=null,cn=head;
		while(cn!=null) {
			prev=mid;
			mid=cn;
			cn=cn.next;
			mid.next=prev;
		}
		return mid;
		}
	
	
	public void Revtraverse() {
		Node temp=reverse();{
			while(temp!=null) {
				System.out.println("The value :"+temp.value);
				temp=temp.next;
			}
		}
	}	
	
	@SuppressWarnings("null")
	public void searchValue(int searchValue) {
		Node temp=head;{
			while(temp!=null) {
				if(temp.value==searchValue)
				System.out.println("The value :"+temp.value);
				return;
			}
			temp=temp.next;
		}
		System.out.println("The value is not present");
	}
	
}

public class CircularSLL {
	public static void main(String[] args) {
CircularLinkedList c1= new CircularLinkedList();
c1.creationofCSLL(11);
//c1.InsertionCSLL(1, 22);
//c1.InsertionCSLL(2, 33);
//c1.InsertionCSLL(3, 44);
//c1.InsertionCSLL(4, 55);
//c1.traverse();
	}
}

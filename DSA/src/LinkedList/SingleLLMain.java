package LinkedList;

class Node{
	int value;
	Node next;
}
class SingleLinkedList{
	Node head,tail;
	int size;
	public void createOfSLL(int value) {
		
		head= new Node();
		Node n1= new Node();
		n1.value=value;
		n1.next=null;
		head=tail=n1;
		size=1;
	}
	
	
}


public class SingleLLMain {
public static void main(String[] args) {
	
}
}

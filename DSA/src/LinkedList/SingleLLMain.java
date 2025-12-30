package LinkedList;

class Node{
	int value;
	Node next;
}
class SingleLinkedList{
	Node head,tail;
	int size=0;
	public void createOfSLL(int value) {   ////creation of the node 
		
		head= new Node();      ///Creating head node 
		Node n1= new Node();   ///Creating the node 
		n1.value=value;        ///Initializing the value to the node created in value place
		n1.next=null;          ///Initializing the address to the node 
		head=tail=n1;          ///Creating the connection between the Head-->Node<--Tail and 
		size++;                /// How many node has been created this will specify the size of actual node not counting head and the tail 
	}
	public void insertion(int index,int value) { ///insertion of node 
		Node n1 = new Node();  ///create a node first
		n1.value=value;  // insert the value to that node 
		if(head==null) {  // if there is no node present between head and tail first call the creation method to create a node 
			createOfSLL(value); 
		}
		else if(index==0) {/// else if the index entered is 0 1st initialize the  address to that node by head 
			n1.next=head;
			head=n1; //then point that head into the new node 
		}
		else {
			n1.next=null; //if we want to insert the node into last we initialize the address of that node into null 
			tail.next=n1; //then point the tail into new node 
			tail=n1;
		}
	}
	
}


public class SingleLLMain {
public static void main(String[] args) {
	
}
}

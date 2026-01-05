package LinkedList;
class Nodee{
	int value;
	Nodee next;
}
class SingleLinkedList{
	Nodee head,tail;
	int size=0;
	public void createOfSLL(int value) {         ///creation of the node 	
		head= new Nodee();                        ///Creating head node 
		Nodee n1= new Nodee();                     ///Creating the node 
		n1.value=value;                          ///Initializing the value to the node created in value place
		n1.next=null;                            ///Initializing the address to the node 
		head=tail=n1;                            ///Creating the connection between the Head-->Node<--Tail and 
		size++;                                  /// How many node has been created this will specify the size of actual node not counting head and the tail 
	}
	public void insertion(int index,int value) { ///insertion of node 
		Nodee n1 = new Nodee();                    ///create a node first
		n1.value=value;                          /// insert the value to that node 
		if(head==null) {                         /// if there is no node present between head and tail first call the creation method to create a node 
			createOfSLL(value); 
		}
		else if(index==0) {                      /// else if the index entered is 0 1st initialize the  address to that node by head 
			n1.next=head;
			head=n1;                             ///then point that head into the new node 
		}
		else {
			n1.next=null;                        ///if we want to insert the node into last we initialize the address of that node into null 
			tail.next=n1;                        ///then point the tail into new node 
			tail=n1;
		
		}
	}
	public void forwordtraverse() {
		Nodee temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"  ");
			temp=temp.next;
		}
	}
	
	public void revesetraverse() {
		Nodee temp=reverse();
		while(temp!=null) {
			System.out.print(temp.value+"  "
					);
			temp=temp.next;
		}
	}
	private Nodee reverse() {
		 Nodee prev=null,mid=null,cn=head;
		 while(cn!=null) {
			 prev=mid;
			 mid=cn;
			 cn=cn.next;
			 mid.next=prev;
		 }
		return mid;
	}
	public void search(int searchvalue) {
		Nodee temp=head;
		while(temp!=null) {
			if(temp.value==searchvalue) {
				System.out.println("The value is present "+" -> "+temp.next);
				return;
			}
	
			temp=temp.next;
		}
		System.out.println("value is not present ");
	}
	
	public void delete() {
		head=tail=null;
		System.out.println("Single linked list is deleted ");
	}
}
public class SingleLLMain {
public static void main(String[] args) {
	SingleLinkedList s1= new SingleLinkedList();
	s1.createOfSLL(10);
	s1.insertion(1, 20);
	s1.insertion(2, 30);
	s1.insertion(3, 40);
	s1.insertion(4, 50);
	s1.insertion(5, 60);
	s1.forwordtraverse();
	System.out.println();
	s1.search(30);
	s1.revesetraverse();
	
}
}

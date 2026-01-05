package LinkedList;

class Node1{
	int value;
	Node1 prev;
	Node1 next;
}
class DoubleLinkedLIst{
	Node1 head,tail;
	int size=0;
	public void create(int value) {
		head= new Node1(); 
			Node1 n1= new Node1();
			n1.value=value;
			n1.next=null;
			n1.prev=null;
			head=n1;
			tail=n1;
			size=1;
	}
	public void Insertion(int index,int value) {
		Node1 n1= new Node1();
		n1.value=value;
		if(head==null) {
			create(value);
		}
		else if(index==0) {
			n1.next=head;
			n1.prev=null;
			head.prev=n1;
			head=n1;	
		}
		else {
			n1.next=null;
			n1.prev=tail;
			tail.next=n1;
			tail=n1;
		}
	}
	public void forwordtraverse() {
		Node1 temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"  ");
			temp=temp.next;
		}
	}
	
	public void revesetraverse() {
		Node1 temp=reverse();
		while(temp!=null) {
			System.out.print(temp.value+"  "
					);
			temp=temp.next;
		}
	}
	private Node1 reverse() {
		 Node1 prev=null,mid=null,cn=head;
		 while(cn!=null) {
			 prev=mid;
			 mid=cn;
			 cn=cn.next;
			 mid.next=prev;
		 }
		return mid;
	}
	public void search(int searchvalue) {
		Node1 temp=head;
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
		System.out.println("Double  linked list is deleted ");
	}
}
public class DoubleLLMain {
public static void main(String[] args) {
	
}
}

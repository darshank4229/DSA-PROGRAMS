package Queue;


class Queue{
	int [] q;
	int toq,boq;
	public Queue(int size) {
		q= new int[size];
		toq=-1;
		boq=-1;
	}
	public boolean isFull() {
		return toq==q.length-1;
	}
	public boolean isEmpty() {
		return toq==-1||boq==q.length;
	}
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else if(boq==-1) {
			boq=0;
			q[++toq]=value;
			System.out.println("The Value:"+value+" Added");
		}
		else{
			q[++toq]=value;
			System.out.println("The Value:"+value+" Added");
		}
	}
	public void deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else{
			int no=q[boq];
			boq++;
			
			//if this statement is there , it is circular queue else,a normal queue
			if(boq>toq) {
				 toq=boq=-1;
			}
			
			System.out.println("The value "+no+" is deleted");
		}
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("Thepeek value is  :"+q[boq]);
		}
		
	}
	public void delete() {
		q=null;
		System.out.println("Queue is deleted");
	}
	public void traverse() {
		for (int i = 0; i < q.length; i++) {
			System.out.print(q[i]+" ");
		}
	}
}

public class Mainclass3 {
public static void main(String[] args) {
		Queue q1= new Queue(4);
		q1.enQueue(10);
		q1.enQueue(20);
		System.out.println("The Queue is Full :"+q1.isFull());
		q1.enQueue(30);
		q1.enQueue(40);
		System.out.println("The Queue is Full :"+q1.isEmpty());
	    q1.enQueue(50);
		q1.deQueue();
		q1.deQueue();
		q1.deQueue();
		q1.deQueue();
		q1.enQueue(33);
		q1.traverse();
}
}

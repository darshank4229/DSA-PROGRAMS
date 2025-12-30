package StackLogics;

class Stack_Program{
	int [] stack;
	int top;
	public Stack_Program(int size) {////  stack creation
		stack =  new int[size];
		top = -1;
	}
	public boolean isEmpty(){ ////////check stack is empty 
		return top==-1;
	}
	public boolean isFull() {   ////////check stack is full
		return top==stack.length-1;
	}
	public void push( int value) {   ///insertion or add records to stack 
		if(isFull()) {
			System.out.println("stack is full");
		}
		else {
			stack[++top]=value;
			System.out.println("the value: "+value+" is inserted ");
		}
	}
	public void pop() {   /////fetch and remove the top of the stack 
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			int value=stack[top];
			top--;
			System.out.println("the value: "+value+" is present at top of stack");
		}
	}
	public void peak() {    ////display the top of the stack 
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			
			System.out.println("the value: "+stack[top]+" is present at top of stack");
		}
	}
	public void delete() {       ///delete the stack 
		stack=null;
		System.out.println("stack is deleted ");
	}
    public void traverse() {
	for (int i = top; i >= 0; i--) {
	    System.out.println(stack[i]);
	}	
}
}
public class MainClass {
public static void main(String[] args) {
	Stack_Program s1=new Stack_Program(4);
	System.out.println("*********************INSERTION*****************");
	s1.push(10);
	s1.push(20);
	s1.push(30);
	s1.push(40);
	System.out.println("*********************FETCH AND REMOVE THE TOP OF STACK (POP) *****************");
//	s1.pop();
	System.out.println("*********************ONLY FETCH THE TOP OF THE STACK  (PEEK) *****************");
	s1.peak();
//	s1.pop();
	s1.traverse();
	System.out.println("*****************STACK DELTED ****************");
	s1.delete();
	}
}

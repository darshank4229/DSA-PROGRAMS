package StackLogics;

import java.util.Stack;

class WebHistory{
	
	private Stack<String> back,front;
	private String  current;
	
	public WebHistory() {
		back=new Stack<String>();
		front=new Stack<String>();
		this.current="HomePage";
	}
	
	public void  visit( String page) {
		back.push(current);
		current=page;
		front.clear();
	}
	public void previous() {
		if(!back.isEmpty()) {
			front.push(current);
			current=back.pop();
			
		}
	}
	public void nextpage() {
		if(!front.isEmpty()) {
			back.push(current);
			current=front.pop();		}
	}
	
	public String getCurrent() {
		return current;
	}
	public void history() {
		while(!back.isEmpty()) {
			System.out.println(back.pop());
		}
	}
	public void delete() {
		back=front=null;
	}

}
public class MainClassweb {
public static void main(String[] args) {
		WebHistory w1= new WebHistory();
		w1.visit("apple");
		w1.visit("airpods");
		w1.previous();
		w1.visit("mobiles");
		w1.visit("13 pro");
		w1.previous();
		w1.previous();
		System.out.println("Current page: "+w1.getCurrent());
		w1.nextpage();
//		w1.delete();
		w1.history();		
}
}

package tasksdaily;

import java.util.Stack;

class test{
	public static int fib(int no) {
		if(no==0) {
			return 0;
		}
		else if(no==1||no==2) {
			return 1;
		}
		else {
			 return fib(no-1)+fib(no-2);
		}
	}
	
	public  static String rev(String str) {
		if(str.equals(null)||str.length()==1) {
			return str;
		}
		else {
			return rev(str.substring(1))+str.charAt(0);
			
		}
	}
	
	public static int fact( int no) {
		if(no==0) {
			return 0;
		}
	else if(no==1) {
			return 1;
		}
		else{
			return no*fact(no-1);
		}
	}
	
	public static boolean isValid(String str) {
		Stack<Character> s1= new Stack<Character>();
		if(str.length()%2!=0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			char c= str.charAt(i);
			if(c=='{'||c=='['||c=='(') {
				s1.push(c);
			}
			else if((c=='}'&&s1.pop()!='{')||(c==']'&&s1.pop()!='[')||(c==')'&&s1.pop()!='(')) {
				return false;
			}
			
		}
		return s1.isEmpty();
	}
}



public class Samp {
public static void main(String[] args) {
System.out.println(	test.fib(4));
	System.out.println(test.rev("hello"));
	System.out.println(test.fact(5));
	if(test.isValid("{[()]]")) {
		System.out.println("valid");
	}
	else {
		System.out.println("not valid ");
	}
}
}

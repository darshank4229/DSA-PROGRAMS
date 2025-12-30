package StackLogics;
import java.util.Stack;
public class ValidBrackets {
	static boolean IsValid(String str) {
		Stack<Character> s1= new Stack<Character>();
		if(str.length()%2!=0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c =='{' || c=='(' || c =='[') {
				s1.push(c);
			}
			else if((c=='}'&&s1.pop()!='{') ||(c==']'&&s1.pop()!='[')||(c==')'&&s1.pop()!='(')) {
				return false;	
			}	
		}
		return s1.isEmpty();
	}
public static void main(String[] args) {
	String str="()";
	if(IsValid(str)) {
		System.out.println("Valid Brackets");
	}
	else {
		System.out.println("Invalid Brackets");
	}
}
}

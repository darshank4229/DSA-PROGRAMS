package dsalogics;

public class factorialofanumber {
static int fact(int no) {
	if(no==0) {
		return 0;
	}
	else if(no==1 ||no==2) {
		return 1;
		
	}
	else {
		return fact(no-1)+fact(no-2);
	}
}
public static void main(String[] args) {
	System.out.println(fact(7));
}
}

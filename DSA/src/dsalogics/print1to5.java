package dsalogics;

public class print1to5 {
	
	static void print(int no) {
		if(no<=10) {
			System.out.println(no);
			print(++no);
		}
	}
	
	static void revprint(int no) {
		if(no>=1 ) {
			System.out.println(no);
			revprint(--no);
		}
	
	}
public static void main(String[] args) {
	print(1);
	revprint(10);
}
}

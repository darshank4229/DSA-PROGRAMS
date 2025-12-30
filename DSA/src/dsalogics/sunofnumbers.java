package dsalogics;

public class sunofnumbers {

	static int sum(int no) {
		if(no==1) {
			return no;
		}
		else {
			return no+sum(no-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
}

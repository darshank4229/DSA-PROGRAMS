package Searching;

public class LinerSearch {
public static void main(String[] args) {
	int [] a= {1,4,2,5,3};
	int search=5;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==search) {
			System.out.println("Value is present");
			return;
		}
	}
	System.out.println("Value is not  present");
}
}

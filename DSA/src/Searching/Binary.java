package Searching;

public class Binary {
	public static void BinarySearch(int[] a, int search) {
	int li=0;
	int hi=a.length-1;
	while(li<hi) {
		int mid=(li+hi)/2;
		if(a[mid]==search) {
			System.out.println("Value is present");
			return ;
		}
		if(a[mid]<search) {
			li=mid+1;
		}
		else {
			hi=mid-1;
		}
	}
	System.out.println("Value is not  present");
		
	}	
	
	
	
public static void main(String[] args) {
	int [] a= {1,4,2,5,3};
	int search=5;
	BinarySearch(a,search);
}


}

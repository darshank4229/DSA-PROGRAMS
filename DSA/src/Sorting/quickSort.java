package Sorting;

import java.util.Arrays;
import java.util.Iterator;

public class quickSort {

	public static void main(String[] args) {
		int[] a = { 4, 3, 1, 2, 7, 6, 5 };
		Quicksrt(a, 0, a.length - 1);
		System.out.println("After Sorting:" + Arrays.toString(a));
	}

	private static void Quicksrt(int[] a, int li, int hi) {
		if(li<hi) {
			 int pi= find(a,li,hi);
			 Quicksrt(a, li, pi-1);
			 Quicksrt(a, pi+1, hi);
		}
		
	}

	private static int find(int[] a, int li, int hi) {
		int j=li-1;
		int pi=hi;
		for (int i = li; i <=hi; i++) {
			if(a[i]<=a[pi]) {
				j++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		return j;
	}

	

}

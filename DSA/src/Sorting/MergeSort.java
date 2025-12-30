package Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void mergerSort(int[] a, int li, int hi) {
		if (li < hi) {
			int mid = (li + hi) / 2;
			mergerSort(a, li, mid);
			mergerSort(a, mid + 1, hi);
			merge(a, li, mid, hi);
		}
	}
	public static void merge(int[] a, int li, int mid, int hi) {
		int s1=mid-li+1;
		int s2=hi-mid;
    int[] t1=new int[s1];
    int[] t2= new int[s2];
    
    for (int i = 0; i < t1.length; i++) {
		t1[i]=a[li+i];
	}
    for (int j = 0; j < t2.length; j++) {
		t2[j]=a[mid+1+j];
	}
	
    int i=0,j=0,k=li;
    while(i<s1&&j<s2) {
    	if(t1[i]<t2[j]) {
    		a[k++]=t1[i++];
    	}
    	else {
    		a[k++]=t2[j++];
    	}
    }
    while(i<s1) {
    	a[k++]=t1[i++];
    }
    while(j<s2) {
    	a[k++]=t2[j++];
    }			
	}
	public static void main(String[] args) {
		int[] a = { 8, 1, 3, 7, 2, 4, 6, 5 };
//		mergerSort(a, 0, a.length - 1);
//		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}
}

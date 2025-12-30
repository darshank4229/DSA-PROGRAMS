package tasksdaily;

import java.util.Arrays;

public class sam {
	public static void bubblesort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Bubble Sort:  " + Arrays.toString(a));
	}

	private static void MergeSort(int[] a, int li, int hi) {
		if (li < hi) {
			int mid = (li + hi) / 2;
			MergeSort(a, li, mid);
			MergeSort(a, mid + 1, hi);
			merge(a, li, mid, hi);
		}

	}

	private static void merge(int[] a, int li, int mid, int hi) {
		int s1 = mid - li + 1;
		int s2 = hi - mid;
		int[] t1 = new int[s1];
		int[] t2 = new int[s2];

		for (int i = 0; i < t1.length; i++) {
			t1[i] = a[li + i];
		}
		for (int i = 0; i < t2.length; i++) {
			t2[i] = a[mid + 1 + i];
		}

		int i = 0, j = 0, k = li;
		while (i < s1 && j < s2) {
			if (t1[i] < t2[j]) {
				a[k++] = t1[i++];
			} else {
				a[k++] = t2[j++];
			}
		}

		while (i < s1) {
			a[k++] = t1[i++];
		}
		while (j < s2) {
			a[k++] = t2[j++];
		}

	}

	private static void QuickSort(int[] a, int li, int hi) {
		if (li < hi) {
			int pi = findpi(a, li, hi);
			QuickSort(a, li, pi - 1);
			QuickSort(a, pi + 1, hi);

		}

	}

	private static int findpi(int[] a, int li, int hi) {
		int j = li - 1;
		int pi = hi;
		for (int i = li; i <= hi; i++) {
			if (a[i] <= a[pi]) {
				j++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return j;
	}

	private static void SelectionSort(int[] a, int i, int j) {
		for (int j2 = 0; j2 < a.length; j2++) {
			int min = j2;
			for (int k = j2 + 1; k < a.length; k++) {
				if (a[k] < a[min]) {
					min = k;
				}
			}
			int temp = a[j2];
			a[j2] = a[min];
			a[min] = temp;
		}
		System.out.println("Selection Sort:  " + Arrays.toString(a));
	}

	public static void main(String[] args) {
		int[] a = { 3, 1, 4, 2 };
		MergeSort(a, 0, a.length - 1);
		System.out.println("Merge Sort:  " + Arrays.toString(a));
		bubblesort(a);
		SelectionSort(a, 0, a.length - 1);
		QuickSort(a, 0, a.length - 1);
		System.out.println("QuickSort Sort:  " + Arrays.toString(a));
	}
}

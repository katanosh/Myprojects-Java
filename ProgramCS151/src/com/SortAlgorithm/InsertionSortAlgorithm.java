package com.SortAlgorithm;

public class InsertionSortAlgorithm {
	static void insertionSort(int[] a) {
		int i = 0, j=0, k=0;
		boolean sw;
		while (i<a.length - 1) {
			j = i+1;
			k = 0;
			sw = true;
			while (k<=i && sw) {
				if (a[k] < a[j])
					k++;
				else
					sw = false;
			}
			if (!sw) {
				int tmp = a[j];
				while (j>k) {
					a[j] = a[j-1];
					j--;
				}
				a[k] = tmp;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		int[] a = { 7,2,10,19,6,8,4,1,9};
		insertionSort(a);
		for (int i: a)
			System.out.println(i);

	}

}

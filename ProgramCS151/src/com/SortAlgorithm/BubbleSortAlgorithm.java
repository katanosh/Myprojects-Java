package com.SortAlgorithm;

public class BubbleSortAlgorithm {
	static void bubbleSort(int[] a) {
		boolean sw = false;
		int j;
		while (!sw) {
			sw = true;
			for (int i =0; i<a.length -1; i++) {
				j = i+1;
				if (a[i] > a[j]) {
					int tmp=a[i];
					a[i] = a[j];
					a[j] = tmp;
					sw = false;
				}// if
			} //for 
		}// while
	}
	public static void main(String[] args) {
		//int[] a = {7,6,7,5,9,2,1,15,10};
		int[] a = {12, 10, 9, 8, 6, 5, 3, 2, 1};
		bubbleSort(a);
		for ( int i:a)
			System.out.println(i);

	}

}

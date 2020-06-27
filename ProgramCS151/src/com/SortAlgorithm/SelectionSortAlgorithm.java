package com.SortAlgorithm;

public class SelectionSortAlgorithm {
		static void selectionSort(int[] a) {
			for (int i=0;i<a.length-1; i++) {
				for (int j=i+1; j<a.length; j++) {
					if (a[i]> a[j]) {
						int tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
					}
				}
			}
		}
		public static void main(String[] args) {
			int[] a = {7,6,7,5,9,2,1,15,10};
			selectionSort(a);
			for ( int i:a)
				System.out.println(i);

		}
}

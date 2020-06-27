package com.SortAlgorithm;

public class MergeSortAlgorithm {
	static void mergeSort(int[] a) {
		System.out.print("Splitting: ");
		for (int i: a)
			System.out.print(i + "  ");
		System.out.println();
		if (a.length > 1) {
			int mid = (a.length) /2;
			int[] l= new int[mid];
			int[] r = new int[a.length - mid];
			// create left part
			for (int i=0 ; i<l.length ; i++) {
				l[i] = a[i];
			}
			//create right part
			for (int i=0 ; i<r.length ; i++) {
				r[i] = a[i+mid];
			}	
			mergeSort(l);
			mergeSort(r);
			// merge two halve
			int i = 0, j=0, k=0; 
			while (i< l.length && j<r.length) {
				if (l[i] < r[j]) {
					a[k] = l[i];
					i++;
				}else {
					a[k] = r[j];
					j++;
				}
				k++;
			}
			while (i<l.length) {
				a[k] = l[i];
				i++;
				k++;
			}
			while (j<r.length) {
				a[k] = r[j];
				j++;
				k++;
			}
			
		}
		System.out.print(" Merging: ");
		for (int i: a)
			System.out.print(i + "  ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] a= {7,2,10,19,6,8,4,1};
		mergeSort(a);
		for (int i:a)
			System.out.println(i);

	}

}

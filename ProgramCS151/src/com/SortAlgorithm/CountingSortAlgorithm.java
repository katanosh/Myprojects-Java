package com.SortAlgorithm;

public class CountingSortAlgorithm {
	   static void countingSort(int[] a) {
		   Integer max = Integer.MIN_VALUE;
		   for (int i=0; i<a.length ; i++) {
			   if (a[i]>max) max = a[i];
		   }
		   int[] c = new int[max+1];
		   int[] b = new int[a.length];
		   for (int i=0; i<c.length ;i++) c[i] =0;
		   for (int i=0; i<a.length ; i++) {
			   c[a[i]]++;
		   }
		   for (int i=1; i<=max ; i++) {
			   c[i] += c[i-1];
		   }
		   for (int i = a.length-1; i>=0;i--) {
			   b[--c[a[i]]] = a[i];
		   }
		   for (int i = 0; i<a.length; i++)
			   a[i] = b[i];

	   }
	public static void main(String[] args) {
		int[] e = {2,6,4,5,9,3,14,10,15,12};
		countingSort(e);
		for (int i: e)
			System.out.println(i);

	}

}

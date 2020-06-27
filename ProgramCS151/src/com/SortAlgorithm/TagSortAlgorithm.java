package com.SortAlgorithm;

public class TagSortAlgorithm {
	static int[] tagSort(int[] a) {
		int [] tag = new int[a.length];
		for (int i=0; i<a.length; i++) {
			tag[i] = i;
		}
		for (int i =0 ; i<a.length - 1; i++) {
			for (int j = i+1; j<a.length ; j++) {
				if (a[i] > a[j]) {
					int tmp = tag[i];
					tag[i] = tag[j];
					tag[j] = tmp;
				}
			}
		}
		return tag;
		
	}
	public static void main(String[] args) {
		int[] a = {7,6,7,5,9,2,1,15,10};
		int[] tag = tagSort(a);
		for (int i:tag)
			System.out.println("Tag :" + i + " ----- > a: " + a[i]);

	}

}

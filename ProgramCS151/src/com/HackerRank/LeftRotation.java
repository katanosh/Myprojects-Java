package com.HackerRank;

public class LeftRotation {
	static int[] leftRotation_00(int[] a, int d) {
		int l = a.length;
		int[] t = new int[l];
		
		for (int i = 0; i<a.length ; i++)
			t[i] = a[(l+d+i)%l];

		return t;	
	}
	static int[] leftRotation(int[] a, int d) {
		int[] t = new int[d];
		for (int i=0; i<d; i++)
			t[i] = a[i];
		for (int i = 0; i<a.length - d ; i++)
			a[i] = a[i+d];
		for (int i=0; i<d; i++) {
			a[i+a.length - d] = t[i];
		}	
		return a;	
	}
	public static void main(String[] args) {
		//int[] a = {1,2,3,4,5};
		int[] a = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
		a = leftRotation_00(a, 10);
		//a = leftRotation(a, 10);
		for (int i:a)
		 System.out.println(i);

	}

}

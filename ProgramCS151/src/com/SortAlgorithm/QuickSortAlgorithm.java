package com.SortAlgorithm;


public class QuickSortAlgorithm {
	static int cnt=0;
	static int partition(int[] a, int  lb,int  ub) {
		int pivot = a[lb];
		int start = lb;
		int end = ub;
		int n = a.length;
		while (start < end) {
			while (a[start]<= pivot && start<n-1)
				start++;
			while (a[end]>pivot && end>0)
				end--;
			if (start < end) {
				int tmp;
				tmp = a[start];
				a[start] = a[end];
				a[end] = tmp;
				cnt++;
			}
		}
		int tmp;
		tmp = a[lb];
		a[lb] = a[end];
		a[end] = tmp;
		cnt++;
		return end;
	}
	
	static void quickSort(int[] a, int lb, int ub) {
		if (lb < ub) {
			int loc = partition(a, lb, ub);
			quickSort(a, lb, loc-1);
			quickSort(a, loc+1, ub);	
			
		}
	}

	public static void main(String[] args) {
		//int[] a= {7,6,7,5,9,2,1,15,10};
		int[] a = {100, 100, 50, 75, 150};
		quickSort(a, 0, a.length-1);
		for (int i:a)
			System.out.println(i);
		//System.out.println(cnt);

	}

}

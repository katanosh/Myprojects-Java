package com.HackerRank;

public class MarkandToys {
	static void mergeSort(int[] a) {
		int mid, k=0 , lh=0, rh=0;
		if (a.length>1) {
			mid = a.length / 2;
			int[] l = new int[mid];
			int[] r = new int[a.length - mid];
			for (int i=0; i<l.length ; i++)
				l[i] = a[i];
			for (int i=0; i<r.length; i++)
				r[i] = a[i+mid];
			mergeSort(l);
			mergeSort(r);
			while (lh<l.length && rh<r.length) {
				if (l[lh] <= r[rh]) {
					a[k] = l[lh];
					lh++;
				} else {
					a[k] = r[rh];
					rh++;
				}
				k++;
			}
			while (lh<l.length) {
				a[k] = l[lh];
				k++;
				lh++;
			}
			while (rh<r.length) {
				a[k] = r[rh];
				k++;
				rh++;
			}
		}	
	}
	static int maximumToys(int[] prices, int k) {
		int cnt=0, tmp, spent = 0;
		
		
		/*for (int i=0; i<prices.length; i++) {
			for (int j=i+1; j<prices.length-1; j++) {
				if (prices[i]>prices[j]) {
					tmp = prices[i];
					prices[i] = prices[j];
					prices[j] = tmp;
				}
				
			}
			if (spent+prices[i]<=k) {
				spent+= prices[i];
				cnt++;
			}
		}*/
		mergeSort(prices);
		
		for (int i=0; i<prices.length; i++) {
			if (spent+prices[i] <= k) {
				spent += prices[i];
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int[] prices = {9,5,4,6,7,3,2,8,1};
		System.out.println(maximumToys(prices, 10));

	}

}

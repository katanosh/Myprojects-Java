package com.HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class GreedyFlorist {
	static int minimumCost(int k, int[] c) {
		int cost = 0;
		//ArrayList<Integer> a = new ArrayList<Integer>();
		Integer[] a = new Integer[c.length];
		for( int i=0; i<c.length; i++) {
			//a.add(c[i]);
			a[i] = c[i];
		}
		//Collections.sort(a, Collections.reverseOrder());
		Arrays.sort(a, Collections.reverseOrder());
		for (int i = 0; i<a.length; i++) {
			cost += ((i/k) + 1) * a[i];
		}
		return cost;
		
	}
	public static void main(String[] args) {
		int[] c = {1,2,3,4};
		int k = 3;
		System.out.println("Costs: " + minimumCost(k, c));

	}

}

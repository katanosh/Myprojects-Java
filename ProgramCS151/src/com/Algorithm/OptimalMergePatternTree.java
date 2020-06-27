package com.Algorithm;

import java.util.*;

public class OptimalMergePatternTree {
	static void miniComputation(ArrayList<ArrayList<Integer>> array, int[] len) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		for (int i: len){
			p.add(i);
		}
		int i,j;
		while (p.size()>1) {
			i = p.poll();
			j = p.poll();
			int t1, t2, k1, k2, k=0;
			while (k<array.size()) {
				if (array.get(k).size() == i){
					t1 = i;
					k1 = k;	
					k++;
				}
				if (array.get(k).size() == j){
					t2 = j;
					k2 = k;	
					k++;
				}
				
				
					
				
				
			}
			// find corresponding arrays
			
			
			p.add(i+j);
		}
	}
	public static void main(String[] args) {
		ArrayList<ArrayList <Integer>> array = new ArrayList<>();

		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		array.add(a);
		System.out.println(array.get(0).get(0));
		
		ArrayList<Integer> b = new ArrayList<>();
		array.add(b);
		
		ArrayList<Integer> c = new ArrayList<>();
		array.add(c);
		
		ArrayList<Integer> d = new ArrayList<>();
		array.add(d);
		int[] len = {3,5,6,6};
		miniComputation(array,len);
		
		
		
		

	}

}

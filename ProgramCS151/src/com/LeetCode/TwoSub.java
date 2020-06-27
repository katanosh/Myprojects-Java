package com.LeetCode;

import java.util.Map;
import java.util.HashMap;
public class TwoSub {
	/*
	 * Brute-force algorithm: time complexity: O(n^2) , space complexity: O(1)
	 */
	public static int[] twoSub_00(int[] set, int value) {
		boolean found=false;
		int i=0, j=0;
		for (i=0; !found && i<set.length-1; i++)
			for (j= i+1; !found && j<set.length ; j++) {
				if (value - set[i] == set[j])
					found = true;
			} 
		
		if (found)
			return new int[] {i-1,j-1};
		else 
			return new int[] {-1,-1};
	}

	/*
	 * improve Brute-force algorithm: time complexity: O(n) , space complexity: O(n)
	 */
	public static int[] twoSub_01(int[] set, int value) {
		boolean found=false;
		int i=0;
		int complement = 0;
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int k =0; k<set.length; k++)
			map.put(set[k], k);
		while (i<set.length && !found) {
			complement = value - set[i];
			if (map.containsKey(complement) && map.get(complement)!=i)
				found = true;
			else
				i++;
		}
		if (found)
			return new int[] {i,map.get(complement)};
		else 
			return new int[] {-1,-1};
	}
	/*
	 * improve Brute-force algorithm : time complexity: O(n) , space complexity: O(n)
	 */
	public int[] twoSum_02(int[] set, int value) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < set.length; i++) {
	        int complement = value - set[i];
	        if (map.containsKey(complement)) {
	            return new int[] { map.get(complement), i };
	        }
	        map.put(set[i], i);
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		int[] set = {2,5,7,11};
		int[] res;
		//res = twoSub_00(set, 7);
		res = twoSub_01(set, 9);
		if (res[0] != -1)
			System.out.println("First num at: " + res[0] + " --> " + set[res[0]] + " second num at: " + res[1]
				+ " --> " + set[res[1]]);
		else
			System.out.println("No set of numbers");

	}

}

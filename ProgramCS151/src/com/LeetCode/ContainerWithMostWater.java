package com.LeetCode;


public class ContainerWithMostWater {
	/*
	 * Brute-force algorithm: time complexity: O(n^2) , space complexity:O(1)
	 */
	public static int maxContainerSize_00(int[] height) {
		//nested loop which checks all area
		return 0;
	}
	/*
	 * improve brute-force algorithm: time complexity: O(n) , space complexity: O(1)
	 */
	public static int maxContainerSize(int[] height) {
		int maximum=0, l=0, r=height.length-1;
		while (l<r) {
			maximum = Math.max(maximum, Math.min(height[l],height[r])*(r-l));
			if (height[l] <= height[r])
				l++;
			else
				r--;
		}
		return maximum;
	}
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println("Container with Most Water: " + maxContainerSize(height));

	}

}

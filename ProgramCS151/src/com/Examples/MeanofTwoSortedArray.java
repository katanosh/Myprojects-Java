package com.Examples;

public class MeanofTwoSortedArray {
	
	public static int FindMedianSortedArray(int[] input1, int[] input2) {
		int x = input1.length;
		int y = input2.length;
		int partitionX, partitionY, low = 0;
		int high = x;
		if (x>y)
			return FindMedianSortedArray(input2, input1);
		while (low<=high) {
			partitionX = (low+high)/2;
			partitionY = (x+y+1)/2 - partitionX;
			
			int maxLeftX = (partitionX ==0 ) ? Integer.MIN_VALUE: input1[partitionX-1];
			int minRightX = (partitionX ==0 ) ? Integer.MAX_VALUE: input1[partitionX];
			
			int maxLeftY = (partitionY ==0 ) ? Integer.MIN_VALUE: input2[partitionY-1];
			int minRightY = (partitionY ==0 ) ? Integer.MAX_VALUE: input2[partitionY];
			
			if (maxLeftX <= minRightY && maxLeftY<=minRightX) {
				if ((x+y)%2 == 0)
					return (Math.max(maxLeftX, maxLeftY)+Math.min(minRightX, minRightY) )/2;
				else
					return Math.max(maxLeftX, maxLeftY);
				
			}
			else {
				if (maxLeftX>minRightY)
					high = partitionX-1;
				else
					low = partitionX + 1;
			}
			
		}	
		return -1;
	}

	public static void main(String[] args) {
		int[] x = {1,3,8,9,15};
		int[] y = {7,11,18,19,21,25};
		
		System.out.println(FindMedianSortedArray(x,y));

	}

}

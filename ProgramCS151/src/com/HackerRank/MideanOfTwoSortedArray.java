package com.HackerRank;

public class MideanOfTwoSortedArray {
	public static double MideanSortedArray(int[] arr1, int[] arr2) {
		if (arr1.length > arr2.length) {
			return MideanSortedArray(arr2, arr1);
		}
		int x = arr1.length;
		int y = arr2.length;
		int low=0, high=x;
		int partitionX, partitionY;
		while (low<=high) {
			partitionX = (low+high)/2;
			partitionY=(x+y+1)/2 - partitionX;
				
			int maxLeftX = (partitionX==0) ? Integer.MIN_VALUE : arr1[partitionX-1];
			int minRightX = (partitionX== x) ? Integer.MAX_VALUE : arr1[partitionX];
				
			int maxLeftY = (partitionY==0) ? Integer.MIN_VALUE : arr2[partitionY -1];
			int minRightY = (partitionY== y) ? Integer.MAX_VALUE : arr2[partitionY];
				
 			if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
 				if ((x+y)%2 == 0) {
 					return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
 				}else {
 					return (double)  Math.max(maxLeftX, maxLeftY);
 				}
 			}	
 			else if (maxLeftX > minRightY) {
 				high = partitionX - 1;
 			}
 			else {
				low = partitionX + 1;
 			}
		}
		throw new IllegalArgumentException();
	}
	
    public static double findMedianSortedArrays(int input1[], int input2[]) {
        //if input1 length is greater than switch them so that input1 is smaller than input2.
        if (input1.length > input2.length) {
            return findMedianSortedArrays(input2, input1);
        }
        int x = input1.length;
        int y = input2.length;

        int low = 0;
        int high = x;
        while (low <= high) {
            int partitionX = (low + high)/2;
            int partitionY = (x + y + 1)/2 - partitionX;

            //if partitionX is 0 it means nothing is there on left side. Use -INF for maxLeftX
            //if partitionX is length of input then there is nothing on right side. Use +INF for minRightX
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                //We have partitioned array at correct place
                // Now get max of left elements and min of right elements to get the median in case of even length combined array size
                // or get max of left for odd length combined array size.
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                } else {
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) { //we are too far on right side for partitionX. Go on left side.
                high = partitionX - 1;
            } else { //we are too far on left side for partitionX. Go on right side.
                low = partitionX + 1;
            }
        }

        //Only we we can come here is if input arrays were not sorted. Throw in that scenario.
        throw new IllegalArgumentException();
    }
	public static void main(String[] args) {
		int[] input1= {2,5,9,12};
		int[] input2 = {1,6,8,14,16,21};
		System.out.println("Midean 1: " +  MideanSortedArray(input1,input2));
		System.out.println("Median 2: " + findMedianSortedArrays(input1, input2));

	}

}

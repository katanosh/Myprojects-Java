package com.HackerRank;
import java.util.*;

// bubble sort solution

public class MinimumSwap {
	
	static int c=0;
	static int minimumSwaps(int[] arr) {
		int cnt = 0;
		int tmp=0;
		boolean sw = true;
		while (sw) {
			sw = false;
			for (int i=0; i<arr.length-1; i++) {
				if (arr[i]>arr[i+1]) {
					tmp=arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					cnt++;
					sw = true;	
				}
			}
		}
		return cnt;
	}
	static void swap(int[] a,int lb, int ub) {
		if (lb<ub) {
			int loc = 0;
			loc = minSwap(a, lb, ub);
			swap(a, lb, loc-1);
			swap(a, loc+1, ub);
			
		}
	}
	
	static int minSwap(int[] a,int lb, int ub) {
		int p =a[lb];
		int start=lb, end=ub;
		int t=0;
		while (start < end) {
			while (p>=a[start] && start<a.length-1)
				start++;
			while (p<a[end] && end>0)
				end--;
			if (start < end) {
				t = a[start];
				a[start] = a[end];
				a[end] = t;	
				c++;
			}
		}
		t = a[end];
		a[end] = a[lb];
		a[0] = t;
		c++;
		return end;
	}
	static int selectionMinSwaps(int[] arr) {
		int cnt = 0;
		for (int i=0; i<arr.length-1; i++)
			for (int j=i; j<arr.length; j++)
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					cnt++;
				}
		return cnt;
		
	}
/*	static int minimumSwaps_01(int[] arr) {
		{ 
	        int n = arr.length; 
	  
	        // Create two arrays and use as pairs where first 
	        // array is element and second array 
	        // is position of first element 
	        ArrayList <Pair <Integer, Integer> > arrpos = 
	                  new ArrayList <Pair <Integer, Integer> > (); 
	        for (int i = 0; i < n; i++) 
	             arrpos.add(new Pair <Integer, Integer> (arr[i], i)); 
	  
	        // Sort the array by array element values to 
	        // get right position of every element as the 
	        // elements of second array. 
	        arrpos.sort(new Comparator<Pair<Integer, Integer>>() 
	        { 
	            @Override
	            public int compare(Pair<Integer, Integer> o1, 
	                               Pair<Integer, Integer> o2) 
	            { 
	                if (o1.getKey() > o2.getKey()) 
	                    return -1; 
	  
	                // We can change this to make it then look at the 
	                // words alphabetical order 
	                else if (o1.getKey().equals(o2.getKey())) 
	                    return 0; 
	  
	                else
	                    return 1; 
	            } 
	        }); 
	  
	        // To keep track of visited elements. Initialize 
	        // all elements as not visited or false. 
	        Boolean[] vis = new Boolean[n]; 
	        Arrays.fill(vis, false); 
	  
	        // Initialize result 
	        int ans = 0; 
	  
	        // Traverse array elements 
	        for (int i = 0; i < n; i++) 
	        { 
	            // already swapped and corrected or 
	            // already present at correct pos 
	            if (vis[i] || arrpos.get(i).getValue() == i) 
	                continue; 
	  
	            // find out the number of  node in 
	            // this cycle and add in ans 
	            int cycle_size = 0; 
	            int j = i; 
	            while (!vis[j]) 
	            { 
	                vis[j] = true; 
	  
	                // move to next node 
	                j = arrpos.get(j).getValue(); 
	                cycle_size++; 
	            } 
	  
	            // Update answer by adding current cycle. 
	            if(cycle_size > 0) 
	            { 
	                ans += (cycle_size - 1); 
	            } 
	        } 
	  
	        // Return result 
	        return ans; 
	    } 
	}*/
	public static void main(String[] args) {
		//int[] a = {4,3,1,2};
		int [] a = {1, 3, 5, 2, 4, 6, 7};
		swap(a, 0, a.length -1);
		System.out.println("Quick sort " + c);
		//int[] b = {4,3,1,2};
		int [] b = {1, 3, 5, 2, 4, 6, 7};
		System.out.println("Secetion sort returns min swap " + selectionMinSwaps(b));
		//System.out.println("Bubble sort " + minimumSwaps(b));
		

	}

}

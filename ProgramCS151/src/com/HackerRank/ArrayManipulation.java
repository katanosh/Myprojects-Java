package com.HackerRank;

public class ArrayManipulation {
	static long arrayManipulation_00(int n, int[][] queries) {
		long[] x = new long[n];
		long max = Long.MIN_VALUE;
		for (int q=0; q<queries.length;q++) {
			for (int i=queries[q][0]-1; i<queries[q][1]; i++) {
				x[i]+=queries[q][2];
				if (x[i] > max){
					max = x[i];
				}
			}
		}
		return max;
	}
	static long arrayManipulation(int n , int[][] queries) {
		long[] arr = new long[n];
		for(int i=0;i<n;i++) arr[i]=0;
		
		for (int q=0; q<queries.length;q++) {
			{
				arr[queries[q][0]-1]+=queries[q][2];
				if (queries[q][1] <n ){
					arr[queries[q][1]]-= queries[q][2];
				}
			}
		}	
	        
		long max=0;
		long temp=0;

		for(int i=0;i<n;i++){
		    temp += arr[i];
		    if(temp> max) max=temp;
		}
		return max;
	}
	static void add(int arr[], int N, int lo, int hi, int val) { 
			arr[lo] += val; 
			if (hi != N - 1) 
					arr[hi + 1] -= val; 
	} 

// Utility method to get actual array from  
// operation array 
	static void updateArray(int arr[], int N) { 
			// convert array into prefix sum array 
		for (int i = 1; i < N; i++) 
			arr[i] += arr[i - 1]; 
	} 

// method to print final updated array 
	static void printArr(int arr[], int N) { 
		updateArray(arr, N); 
		for (int i = 0; i < N; i++) 
			System.out.print(""+arr[i]+" "); 
		System.out.print("\n"); 
	} 
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i=0; i<a.length; i++) a[i]=0;
		int[][] q = {{1, 5, 3} , {4, 8, 7}, {6, 9, 1}};
		int[][] q1 = {{1, 2, 100},{2, 5, 100},{3, 4, 100}};
		int[][] q2 = {{2 ,6 ,8}, {3, 5, 7},{1, 8, 1},{5, 9, 15}};
		System.out.println(arrayManipulation(10, q1));
		add(a,10, 2,6,8);
		add(a,10, 3,5,7);
		add(a,10, 1,8,1);
		add(a,10, 5,9,15);
		printArr(a, 10);
		

	}

}

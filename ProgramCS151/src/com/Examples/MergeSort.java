package com.Examples;

public class MergeSort {
	public static int[] a = {15,5,24,8,1,3,16,10,20};
	
	public static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	public static void merge(int l, int m, int u) {
		int sl = m-l+1;
		int sr = u-m;
		int[] left = new int[sl];
		int[] right = new int[sr];
		
		for (int i = 0; i<sl ; i++)
			left[i]=a[i+l];
		for (int i = 0; i<sr ; i++)
			right[i]=a[i+m+1];
		int i = 0, j=0 , k=l;
		while (i<sl && j<sr) {
			if (left[i]<=right[j]) {
				a[k]= left[i];
				i++;
			}
			else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while (i<sl) {
			a[k]= left[i];
			i++;
			k++;
		}
		while (j<sr) {
			a[k]= right[j];
			j++;
			k++;
		}
	}
	
	public static void ms(int l, int u) {
			if (l<u) {
				int mid = (l+u)/2;
				ms(l,mid);
				ms(mid+1,u);
				merge(l,mid,u);
			}
		}

	   // Main function that sorts arr[l..r] using 
    // merge() 
    public static void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    }
	public static void main(String[] args) {
		ms(0,a.length-1);
		int[] aa = {9,3,7,5,6,4,8,2};
		sort(aa,0, aa.length-1);
		for(int i: aa)
			System.out.println(i);
		for(int i: a)
			System.out.println(i);

	}

}

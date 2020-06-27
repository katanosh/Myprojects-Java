package com.LeetCode;

public class CountMatrixOddValue {
	public int oddCells(int n, int m, int[][] indices) {
		int[] row = new int[n];
		int[] col = new int[m];
		for (int[] i:indices) {
			row[i[0]]++;
			col[i[1]]++;
		}
		int count=0;
		for (int i=0; i<n; i++)
			for (int j=0; j<m; j++)
				if (row[i]+col[j] % 2 ==1)
					count++;
		return count;
	}
	public static void main(String[] args) {
		CountMatrixOddValue o = new CountMatrixOddValue();
		
		int[][] matrix = {{0,1},{1,1}};
		System.out.println(o.oddCells(2,3,matrix));
		
			
	}

}

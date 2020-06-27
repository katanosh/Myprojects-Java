package com.LeetCode;

public class StraightLine {
	public boolean checkStraightLine(int[][] coordinates) {
		boolean sl = true;
		if (coordinates.length != 2) {
			int x1, y1, x2, y2, x3, y3;
			for (int i = 1; sl && i<coordinates.length - 1; i++) {
				x1 = coordinates[i-1][0]; 
				y1 = coordinates[i-1][1];
				x2 = coordinates[i][0];
				y2 = coordinates[i][1];
				x3 = coordinates[i+1][0]; 
				y3 = coordinates[i+1][1];
				if ((x2-x1)*(y3-y2) != (x3-x2)*(y2-y1))	 
					sl = false;
			}
		}
		return sl;
	}
	public static void main(String[] args) {
		StraightLine line = new StraightLine();
		//int[][] coordinates = {{1,2},{2,3}, {3,4}, {4,5}, {5,6}, {6,7}};
		//int[][] coordinates = {{1,1},{2,2}, {3,4}, {4,5}, {5,6}, {7,7}};
		//int[][] coordinates = {{1,-8}, {2,-3}, {1,2}};
		int[][] coordinates = {{-3,-2}, {-1,-2},{2,-2},{-2,-2},{0,-2}};
		if (line.checkStraightLine(coordinates))
			System.out.println("Straight Line");
		else
			System.out.println("Not Straight Line");

	}

}

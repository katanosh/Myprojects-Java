package com.LeetCode;

public class CircleRectangleOverlaping {
	public boolean checkOverlaping (int r, int x_center, int y_center, int x1, int y1, int x2, int y2) {
		int xp=0 , yp=0;
		if ((x1-x_center)*(x2-x_center)>0)
			xp = Math.min(Math.abs(x1-x_center), Math.abs(x2-x_center));
		if ((y1-y_center)*(y2-y_center)>0)
			xp = Math.min(Math.abs(y1-y_center), Math.abs(y2-y_center));
		return (xp*xp + yp*yp) <= r*r;
	}
	public static void main(String[] args) {
		CircleRectangleOverlaping cr = new CircleRectangleOverlaping();
		if (cr.checkOverlaping(1, 0, 0, 1, -2, 1, 2))
			System.out.println("TRUE");
		else
			System.out.println("False");

	}

}

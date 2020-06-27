package com.Examples;

public class Power_rec {
	static int[] memo = {-1,-1,-1,-1,-1,-1,-1};
	public static int power_memo(int x, int y) {
		if (y == 0) {
			memo[y] = 1;
			return 1;
		}
		else {
			if (memo[y] == -1) {
				if (y %2 == 0) {
					return power_memo(x,y/2)*power_memo(x,y/2);
				}
				else {
					return x* power_memo(x,y/2)* power_memo(x,y/2);
				}		
			}
			else {
				return memo[y];
			}
		}
	}
	
	public static int power(int x, int y) {
		if (y == 0)
			return 1;
		else
		{
			if (y %2 == 0)
				return power(x,y/2)*power(x,y/2);
			else
				return x*power(x,y/2)*power(x,y/2);
		}
	}
	public static void main(String[] args) {
		System.out.println(power(3,6));
		System.out.println(power_memo(3,6));

	}

}

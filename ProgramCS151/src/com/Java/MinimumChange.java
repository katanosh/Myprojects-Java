package com.Java;

public class MinimumChange {
	static int change_00(int x, int[] coins) {
		int min, c;
		if (x==0) {return 0;}
		min = x;
		for (int coin: coins) {
			if (x-coin>=0) {
				c = change(x-coin, coins);
				if (min>c+1) {min = c+1;}
			}
			
		}
		return min;
	}
	static int change(int x, int[] coins) {
		int[] cache = new int[x];
		for (int i=0;i<x;i++) {cache[i] = -1;}
		return change(x, coins, cache);
	}
	static int change (int x, int[] coins, int[] cache) {
		int min, c;
		if (x==0) {return 0;}
		min = x;
		for (int coin: coins) {
			if (x-coin>=0) {
				//System.out.println("coin: " + coin);
				if (cache[x-coin]>=0) {c = cache[x-coin];}
				else {
					c = change(x-coin, coins, cache);
					cache[x-coin] = c;
					
				}
				if (min>c+1) {min = c+1;}
			}
			
		}
		return min;
	}
	
	public static void main(String[] args) {
		int [] coins = {25,10,5,1};
		int x = 32;
		int[] cache = new int[x];
		for (int i=0;i<x;i++) {cache[i] = -1;}
		
		System.out.println(change(x, coins, cache));
		//for (int i: cache) {System.out.println(i);}

	}

}

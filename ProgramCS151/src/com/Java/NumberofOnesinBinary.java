package com.Java;

public class NumberofOnesinBinary {
	static int numberofOnes(byte x) {
		int sum = 0;
		while (x>0) {
			sum+= x & 1;
			x >>= 1;
			System.out.println(x);
		}
		return sum;
	}
	public static void main(String[] args) {
		byte x=0b1101;
		System.out.println(numberofOnes(x));
		

	}

}

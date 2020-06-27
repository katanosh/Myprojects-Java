package com.Examples;

public class reverseInt_rec {
	static int n=0;
	public static int sumInt(int x) {
		if (x==0) {
			return x;
		}
		else {
			return (x%10) + sumInt(x/10);
		}
	}	
	public static int revInt(int x) {
		if (x==0) {
			return n;
		}
		else {
			n = (x%10) + n*10;
			return revInt(x/10);
		}
	}

	public static void main(String[] args) {
		System.out.println(revInt(123));
		System.out.println(sumInt(123));

	}

}

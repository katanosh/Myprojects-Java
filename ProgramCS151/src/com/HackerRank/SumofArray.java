package com.HackerRank;

import java.util.Scanner;
import java.io.IOException;


public class SumofArray {
	static int ArraySum(int[] a) {
		int sum = 0;
		for(int i: a)
			sum+=i;
		return sum;
	}
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine().trim());
		int[] ary = new int[n];
		
		String[] arStr = scan.nextLine().split(" ");
		for (int i=0; i<arStr.length; i++) {
			int num = Integer.parseInt(arStr[i].trim());
			ary[i] = num;
		}
		
		System.out.println(ArraySum(ary));
		
		scan.close();
		
	}

}

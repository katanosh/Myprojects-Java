package com.HackerRank;

public class SpecialString {
	static long substrCount(int n, String s) {
		long counter = 0;
		for (int i = 0; i < n; i++) {
		// if the current symbol is in the middle of palindrome, e.g. aba
			int offset = 1;
			while (i - offset >= 0 && i + offset < n && s.charAt(i - offset) == s.charAt(i - 1)
				&& s.charAt(i + offset) == s.charAt(i - 1)) {
				System.out.println("i - offset: " + (i-offset) + " : " + s.charAt(i-offset));
				counter++;
				offset++;
			}
			// if this is repeatable characters aa
			int repeats = 0;
			while (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
				repeats++;
				i++;
			}
			System.out.println("Repeats : " + repeats);
			counter += repeats * (repeats + 1) / 2;
		}
		return counter + n;
	}
	public static void main(String[] args) {
		String s= "asasd";
		s = "mnonoopoo";
		s ="abcbaba";
		System.out.println(substrCount(7, s));

	}

}

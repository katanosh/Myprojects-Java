package com.HackerRank;

public class RepeatString {
	static int repeatString (String s, int n) {
		int l = s.length();
		int cnt = 0;
		char[] st = s.toCharArray();
		for (char c: st) {
			if (c == 'a') {
				cnt++;
			}
		}
		if ((n%l) == 0) {
			cnt *= (n/l);
		} else {
			cnt*= (n/l);
			for (int i=0; i< (n%l); i++)
				if (st[i] == 'a') {
					cnt++;
				}
		}
		return cnt;
	}
	public static void main(String[] args) {
		String s = "abaca";
		System.out.println(repeatString(s, 1003));
		

	}

}

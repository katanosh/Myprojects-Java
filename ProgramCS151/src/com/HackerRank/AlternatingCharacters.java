package com.HackerRank;
import java.util.*;
public class AlternatingCharacters {
	static int alternatingCharacters(String s) {
		s = s.trim();
		int dlt = 0;
		Stack stk = new Stack();
		for (char ch: s.toCharArray()) {
			if (!stk.isEmpty()){
				if ((char)stk.peek() == ch) {
					dlt++;
				}else {
					stk.push(ch);
				}
			}else {
				stk.push(ch);
			}
		}
		System.out.println(dlt);
		return dlt;
		
	}
	static int alternatingCharacters_01(String s) {
		s = s.trim();
		int dlt = 0;
		
		for (int i=0; i<s.length()- 1; i++) {
			if (s.charAt(i) == s.charAt(i+1))  dlt++;
		}	
		System.out.println(dlt);
		return dlt;
		
	}
	public static void main(String[] args) {
		String s ="AAAAA";
		s = "BABBB";
		s = "BABABA";
		s = "AAABB";
		System.out.println( alternatingCharacters_01(s));
		
	}

}

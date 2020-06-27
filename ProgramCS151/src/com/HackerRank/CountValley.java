package com.HackerRank;
import java.util.*;

public class CountValley {
	static int cValley_00 (String s) {
		Stack<String> step = new Stack<String>();
		int cnt=0;
		String tmp;
		boolean sw = true;
		for (int i=0; i<s.length(); i++) {
			if (s.substring(i, i+1).equals("D")) {
				step.push("D");
				sw = true;
				
			}else {
				if (!step.empty() ) {
					tmp = step.pop();
					if (sw) {
						cnt++;
						sw = false;
					}
				}
					
			}
		}
		return cnt;
	}
	static int cValley(String s) {
		int val=0;
		int v=0;
		for (char c:s.toCharArray()) {
			if (c=='U') val++;
			if (c=='D') val--;
			if (val == 0 && c=='U')
				v++;
		}
		return v;
	}
	static int cValley_01(String s) {
		int sum = 0, n;
		n = s.length();
		char[] st = s.toCharArray();
		  int count = 0;
		  for(int i=0;i<n;i++){
		    if(st[i]=='U'){
		      if(++sum==0)
		        count++;
		    }
		    else sum--;
		  }
		  return count;
	}
	
	public static void main(String[] args) {
		String s = "UDDDUDUU";
		s = "DDDDUUUU";

		

		System.out.println(cValley(s));
	}

}

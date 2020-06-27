package com.Examples;

public class palindrum_rec {
	
	public static boolean palindrum(String s) {
		if (s.length() == 0 || s.length() ==1)
			return true;
		if (s.charAt(0) == s.charAt(s.length()-1)) 
				return palindrum (s.substring(1, s.length()-1));
		return false;
			
	}

	public static void main(String[] args) {
		if (palindrum("ABDBA"))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}

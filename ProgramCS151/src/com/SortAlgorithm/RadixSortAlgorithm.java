package com.SortAlgorithm;

public class RadixSortAlgorithm {
	static void passes(String[][] p, String[] s, int n, int pas) {
		for (int i = 0; i<p.length; i++)
			for (int j =0; j<p[i].length; j++)
				p[i][j] = "";
		int j;
		for (int i= 0;i<s.length;i++ ) {
			j = 0;
			//System.out.println("s: " + s[i]);
			//System.out.println(String.valueOf(s[i].charAt(n-1)));
		
		    int in =Integer.parseInt(String.valueOf(s[i].charAt(n-pas)));
		    System.out.println("in: "+ in);
		    while (p[in][j] !="")
		    	j++;
			p[in][j] = s[i];
			System.out.println("in: "+ in + "j: "+j+ "s: " + s[i] + " p: " +p[in][j]);
		}
		int k=0;
		for (int i = 0;i<p.length; i++) {
			j = 0;
			while (p[i][j]!="") { // Exception out of bound
				//s[k] = p[i][j];
				//k++;
				
				System.out.println("p ---- >  " + i + " : "+ j + "  " + p[i][j]);
				j++;
			}		
		}
	}
	// pading string with 
	static String leftPad(String s, int n) {
		  String res=s;
		  if (s.length()< n)
			  res = String.format("%" + n + "s", s).replace(' ', '0');
		  System.out.println("s: " + res);
		  return res;   
	}
	static void radixSort(int[] a) {
		Integer max = Integer.MIN_VALUE;
		String[] str = new String[a.length];
		String[][] pass = new String[10][str.length];
		
		int n = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i]>=max) max = a[i];
		}

		String t = String.valueOf(max);
		n = t.length();
		System.out.println("n: "+ n);
		for (int i = 0; i<a.length; i++) {
			str[i] = leftPad(String.valueOf(a[i]), n);			
		}
		for (String s: str)
			System.out.println("str: " + s);
		// passes
		for (int i =1; i<=n ; i++)
			passes(pass, str, n, i);

		//for (int i =0; i<str.length; i++) {
		//	a[i] = Integer.parseInt(str[i]);
		//}
	}
	public static void main(String[] args) {
		int[] a = {15,1,321,10,802,2,123,90,109,11};
		radixSort(a);
		for (int i: a)
			System.out.println(i);
		

	}

}

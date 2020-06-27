package com.Examples;

public class WorkwithNumbers {
	
	public static Integer[] seperateIntFromDecimal(double n) {
		String dToS = String.valueOf(n);
		int indx = dToS.indexOf(".");
		Integer[] a=new Integer[2];
		a[0] = Integer.parseInt(dToS.substring(0, indx));
		a[1] = Integer.parseInt(dToS.substring(indx+1));
		System.out.println(a[0]);
		System.out.println(a[1]);
		return a;
		
		
		
	}

	public static void main(String[] args) {
		Integer[] b = seperateIntFromDecimal(12.345);
		double k = b[1].doubleValue();
		System.out.println(k);
		double h = 123.1234 / 1000;
		System.out.println(h);
		

	}

}

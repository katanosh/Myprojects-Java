package com.LeetCode;

public class MaximumScroeOfSubstring {
	public int maxScore_1(String s) {
		if (s==null || s.length()==1)
			throw new IllegalArgumentException();
		final long startTime = System.nanoTime();
		int cnt = 0;
		Integer max = Integer.MIN_VALUE;
		for(int l=1; l<s.length(); l++) {
			//count 0's in the first substring
			for (int i=0 ; i<l ; i++) {
				if (s.charAt(i)=='0')
					cnt++;
			}
			//count 1's in the second substring
			for (int i=l ; i<s.length() ; i++) {
				if (s.charAt(i) == '1')
					cnt++;
			}
			max = cnt >max ? cnt : max;
			cnt = 0;
			
		}
		final long duration = System.nanoTime() - startTime;
		System.out.println("Execution time: " + duration);
		return max;
	}
    public int maxScore(String s) {
    	if (s == null || s.length()==1)
    		throw new IllegalArgumentException();
    	final long startTime = System.nanoTime();
    	int cnt= 0;
    	boolean sw = true;
    	String s1 = s.substring(0, 1);
    	String s2 = s.substring(1);
    	Integer max = Integer.MIN_VALUE;
    	while (sw) {
    		for(char c : s1.toCharArray()) {
    			if (c=='0')
    				cnt++;
    		}
    		for(char c : s2.toCharArray()) {
    			if (c=='1')
    				cnt++;
    		}
    		max = cnt>max? cnt : max;
    		if ((s2.length()>1)) {
    			s1 += s2.substring(0, 1);
    			s2 = s2.substring(1);
    			cnt = 0;
    		}else {
    			sw = false;
    		}
    	}
    	final long duration = System.nanoTime() - startTime;
    	System.out.println("Execution time: " + duration);
    	return max;
        
    }
	public static void main(String[] args) {
		MaximumScroeOfSubstring ms = new MaximumScroeOfSubstring();
		System.out.println("String : 011101  ----------------------------------------");
		System.out.println("Maximum Score After Splitting String1 " + ms.maxScore("011101"));
		System.out.println("Maximum Score After Splitting String2 " + ms.maxScore_1("011101"));
		System.out.println();
		
		System.out.println("String 00111  ----------------------------------------");
		System.out.println("Maximum Score After Splitting String1 " + ms.maxScore("00111"));
		System.out.println("Maximum Score After Splitting String2 " + ms.maxScore_1("00111"));
		System.out.println();
		
		System.out.println("String 1111  ----------------------------------------");
		System.out.println("Maximum Score After Splitting String1 " + ms.maxScore("1111"));
		System.out.println("Maximum Score After Splitting String2 " + ms.maxScore_1("1111"));
		System.out.println();
		
		
		System.out.println("String 00  ----------------------------------------");
		System.out.println("Maximum Score After Splitting String1 " + ms.maxScore("00"));
		System.out.println("Maximum Score After Splitting String2 " + ms.maxScore_1("00"));
		System.out.println();
		

	}

}

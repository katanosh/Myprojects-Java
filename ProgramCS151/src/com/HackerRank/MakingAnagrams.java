package com.HackerRank;

public class MakingAnagrams {
	static long makingAnagrams(String a, String b) {
		char[] ary = a.toCharArray();
		char[] bry = b.toCharArray();
		for (char k: ary)
			System.out.println(k);
		System.out.println(" ------- ");
		for (char k: bry)
			System.out.println(k);
		
		System.out.println(ary.length + " ----- " + bry.length);
		long cnt=0;
		int i=0, j=0;
		boolean sw = true;
		while (i<ary.length) {
			if (ary[i] != '*') {
				sw = true;
				j = 0;
				while (j<bry.length && sw) {
				
					if (ary[i] == bry[j]) {
						System.out.println("EQUAL " + ary[i] +" --> " + bry[j]);
						cnt++;
						ary[i] = '*';
						bry[j] = '*';
						sw = false;				
					}
					System.out.println(ary[i] + " ------ " + bry[j]);
					j++;
				}
			}
			i++;
		}
		System.out.println(cnt);
		return (ary.length - cnt) + (bry.length - cnt); 	
	}
	public static void main(String[] args) {
		String a = "fcrxzwscanmligyxyvym";
		String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		System.out.println(makingAnagrams(a,b));

	}

}
;
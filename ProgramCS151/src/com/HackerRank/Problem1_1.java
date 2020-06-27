package com.HackerRank;
import java.util.*;

public class Problem1_1 {

	public static void main(String[] args) {
		int[] ar= {10,20,20,10,10,30,50,10,20};
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
        Integer oldVal;
        int k = 0;
        for (int i=0;i<ar.length; i++){
            if (hm.containsKey(ar[i])) {
            	k = hm.get(ar[i]);
            	oldVal = hm.replace(ar[i], ++k);
            	System.out.println("ar : " + ar[i] + "K " + k);
            	System.out.println("OldVal: " + oldVal);
            }else {
            	hm.put(ar[i], 1);
            	System.out.println("ar : " + ar[i] + "K " + hm.get(ar[i]));
            }
        }
        int total=0;
        for(Map.Entry<Integer, Integer> entry:hm.entrySet()) {
        	total += entry.getValue()/2;
        }
        
        System.out.println("TOTAL: " + total);

	}

}

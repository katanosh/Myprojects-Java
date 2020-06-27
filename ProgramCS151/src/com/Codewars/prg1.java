package com.Codewars;
//solution 1
import java.util.Comparator;
import java.util.stream.Collectors;

//solution 2
import java.util.Arrays;
import java.util.Collections;

import java.util.ArrayList;
public class prg1 {
	public static Integer sortDigits(int n) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		int d  = n%10;
		while (d>0) {
			boolean added = true;
			System.out.println("d: " + d);
			for (int i=0; added && i<num.size(); i++) {
				if (d >= num.get(i)) {
					num.add(i, d);
					added = false;
				}
			}
			if (added) {
				num.add(d);
			}
			n /=10;
			d = n%10;	
		}
		Integer number= 0;
		
		for (Integer i: num) {
			number = (number * 10) + i;
		}
		return number;
		
	}
	// solution 1
	public static int sortDesc_00(final int num) {
		
		//String s= String.valueOf(num);
		//String s1= s.chars().mapToObj(i-> String.valueOf(Character.getNumericValue(i))).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
		//return Integer.parseInt(s1);
        return Integer.parseInt(String.valueOf(num)
	                                      .chars()
	                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
	                                      .sorted(Comparator.reverseOrder())
	                                      .collect(Collectors.joining()));
	}
	// solution 2
    public static int sortDesc_01(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
	
    // solution 3
    public static int sortDesc_02(final int num) {
        if (num < 0) throw new IllegalArgumentException("Negative number: " + num);

        return Integer.parseInt(Integer.toString(num).codePoints()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .reverse()
                .toString());
    }
    //solution 4
    public static int sortDesc_03(final int num) {
        //If is only one number no need to sort it...
        if (num<10){ return num;}
        
        String str = "" + num;
        char[] arr = str.toCharArray();  
        char[] result = new char[arr.length];
        
        //Sort the array in ascending order
        Arrays.sort(arr);
        
        //Sort the array in descending order
        for (int i = 0; i<arr.length; i++){
          result[(arr.length - 1) - i] = arr[i];
        }
        return Integer.parseInt(new String(result));
      }
	public static void main(String[] args) {
			
		System.out.println(sortDigits(29867));
	}
}

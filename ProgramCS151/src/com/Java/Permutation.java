package com.Java;

import java.util.ArrayList;
public class Permutation {
	public ArrayList<String> permutations(String s){
		ArrayList<String> result = new ArrayList<String>();
		permutations("",s, result);
		return result;
	}
	public void permutations(String prefix, String suffix, ArrayList<String> result) {
		if (suffix.length() == 0) 
			result.add(prefix);
		else {
			for (int i= 0; i< suffix.length() ; i++) {
				permutations(prefix+suffix.charAt(i), suffix.substring(0, i)+suffix.substring(i+1,suffix.length()), result);
			}
		}
	}
	public ArrayList<int[]> permutationsa(int[] a){
		ArrayList<int[]> result = new ArrayList<int[]>();
		permutationsa(a,0, result);
		return result;
	}
	public void permutationsa(int[] a, int start, ArrayList<int[]> result) {
		if (start >= a.length ) {
			result.add(a.clone());	
		}
		else {
			for (int i= start; i< a.length ; i++) {
				permutationsa(a, start+1, result);
				swap(a, start, i);
			}
		}
	}
	private void swap (int[]a , int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static void main(String[] args) {
		Permutation per = new Permutation();
		String str = "abc";
		per.permutations(str);

	}

}

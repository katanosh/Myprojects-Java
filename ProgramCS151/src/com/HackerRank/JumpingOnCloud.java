package com.HackerRank;
import java.util.ArrayList;

public class JumpingOnCloud {
	static int jumpOnCloud(int[] c) {
		ArrayList<Integer> r = new ArrayList<>();
		for (int i=0; i<c.length; i++) {
			if (c[i] == 0) {
				r.add(i);
			}
		}

		
		
		for (int i=0; i<r.size(); i++)
			System.out.println(i);
		
		int i = 0 ;
		int jmp=0;
		while (i<r.size() - 2) {
			if ((r.get(i+2) - r.get(i)) == 2) {
				i+=2;
			} else {
				i+=1;
			}
			jmp++;
			System.out.println("loc: " + i + "JUMP: " + jmp);
		}
		System.out.println("JUMP: " + jmp);
		
		while (i<r.size()-1) {
			jmp++;
			i++;
		}
		return jmp;
	}
	static int jumpOnCloud_01(int[] c) {
		int n = c.length;
		int jmp = 0;
		int i;
		for (i=0; i<n-2; i++, jmp++) {
			if (c[i+2] == 0) {
				i++;
			}
		}
		while (i<n-1) {
			jmp++;
			i++;
		}
		return jmp;
	}
	public static void main(String[] args) {
		//int[] c= {0,1,0,0,0,1,0};
		int[] c = {0, 1,0,1,0,1,0,1,0};
		System.out.println(jumpOnCloud(c));
		System.out.println(jumpOnCloud_01(c));

	}

}

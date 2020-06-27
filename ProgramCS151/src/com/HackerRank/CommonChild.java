package com.HackerRank;

import java.util.Scanner;
public class CommonChild {
    /*static int commonChild(String a, String b){
        int[][] C = new int[a.length()+1][b.length()+1];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    C[i+1][j+1] = C[i][j] + 1;
                } else {
                    C[i+1][j+1] = Math.max(C[i+1][j], C[i][j+1]);
                }
            }
        }
        
        return C[a.length()][b.length()];
    }*/
	/*static int commonChild(String a, String b) {
		int size_a= a.length();
		int size_b = b.length();
		int[] a_ = new int[size_a];
		int[] b_ = new int[size_b];
		int k = 0;
		int len, max=0 ;
		String subst="", finalSubst="";
		char[] ch;
		if (size_a < size_b) {
			ch = new char[size_a+1];
		}else {
			ch = new char[size_b+1];
		}
		// find the common characters & their positions
		for (int i=0; i<a.length(); i++) {
			for (int j =0; j<b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					ch[k]= a.charAt(i);
					a_[k] = i;
					b_[k] = j;
					k++;
					
				}
			}
		}
		ch[k]='0';
		for (int l=0;ch[l]!='0'; l++) {
			System.out.println("Char : " + ch[l] + " Pos at first string "+ a_[l]+ " Pos at second string " + b_[l]);
		}
		for (int l=0; ch[l]!= '0' && k<ch.length; l++) {
			subst+=ch[l];
			len = 1;
			k = l+1;
			finalSubst = "";
			while (ch[k]!='0' && k<ch.length) {
				System.out.println("subst1: " + subst);
				
				if ((a_[l]<= a_[k]) && (b_[l]<=b_[k]) ) {
					len++;
					subst+=ch[k];
					System.out.println("subst2: " + subst);
				}
				if (len > max) {
					max = len;
					finalSubst = subst;
				}
				System.out.println("MAX : " + max + " final string "+ finalSubst);
				k++;
			}
		}
		return max;
	}*/
	static int commonChild(String str1, String str2) {
		int n1 = str1.length();
		int n2 = str2.length();
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		int T[][] = new int[n1+1][n2+1];
		        
		        int max = 0;
		        for(int i=1; i <= n1; i++){
		            for(int j=1; j <= n2; j++){
		                if(s1[i-1] == s2[j-1]){
		                    T[i][j] = T[i-1][j-1] +1;
		                }else {
		                	T[i][j] = Math.max(T[i-1][j], T[i][j-1]);
		                }
		                if(max < T[i][j]){
		                        max = T[i][j];
		                }
		           }
		       }
		        return max;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner in = new Scanner(System.in);
	        String s1 = in.next();
	        String s2 = in.next();
	        int result = commonChild(s1, s2);
	        System.out.println(result);
	        in.close();
	}

}

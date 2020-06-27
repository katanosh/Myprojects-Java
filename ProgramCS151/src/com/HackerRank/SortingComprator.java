package com.HackerRank;

import java.util.Comparator;
import java.util.Scanner;

class Player{
	String name;
	int score;
	public Player(String n, int s) {
		this.name = n;
		this.score = s;
	}
}
class Checker implements Comparator<Player>{
	public int compare(Player p1, Player p2) {
		int res=0;
		if (p1.score > p2.score ) {
			res = 1;
		}else if (p1.score < p2.score) {
			res = -1;
		}else {
			System.out.println("Here");
			if (p1.name.compareTo(p2.name) < 0) {
				res = -1;
				System.out.println("res -1");
			}else if (p1.name.compareTo(p2.name) > 0) {
				res = 1;
				System.out.println("res 1");
			}
		}
		System.out.println("res: " + res);
		return res;		
	}
	public void quickSort(Player[] a, int lb, int ub) {
		if (lb < ub) {
			System.out.println("Quick Sort");
			int loc = partition(a, lb, ub);
			quickSort(a, lb, loc-1);
			quickSort(a, loc+1, ub);	
			
		}
	}
	public int partition(Player[] p, int lb, int ub) {
		Player pvt = p[lb];
		int start = lb, end = ub;
		while (start<end) {
			while (((compare(p[start], pvt) == -1) || (compare(p[start], pvt) == 0)) && (start < p.length -1))
				start++;
			while ((compare(p[end], pvt) == 1) && (end>0))
				end--;
			if (start < end) {
				Player tmp;
				tmp = p[start];
				p[start] = p[end];
				p[end] = tmp;
				
			}
		}
		Player tmp;
		tmp = p[lb];
		p[lb] = p[end];
		p[end] = tmp;
		
		System.out.println("Location " + end );
		return end;
	}
	
}
public class SortingComprator extends Checker{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Player[] player = new Player[n];
		Checker chk = new Checker();
		String name;
		int score;
		System.out.println("N: " + n);
		for (int i=0; i<n; i++) {
			name = in.next();
			score = in.nextInt();
			player[i] = new Player(name, score);
			System.out.println("I: " + i);
		}
		System.out.println("End Loop");
		chk.quickSort(player, 0, player.length -1);
		for (Player i:player)
			System.out.println(i.name + " " + i.score);
	}

}

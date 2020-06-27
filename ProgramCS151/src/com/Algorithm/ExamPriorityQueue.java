package com.Algorithm;
import java.util.*;

class ListofArray{
	int len;
	char a;
	public ListofArray(int len, char a) {
		this.len = len;
		this.a = a;
	}
}
public class ExamPriorityQueue {
		
	public static void main(String[] args) {
		ArrayList <ListofArray> a = new ArrayList<>();
		a.add(new ListofArray(3,'A'));
		a.add(new ListofArray(6,'D'));
		a.add(new ListofArray(5,'B'));
		a.add(new ListofArray(6,'C'));
		
		
		//PriorityQueue<ArrayList<ListofArray>> p = new PriorityQueue<>();
		
		/*p.add(a);
		
		p.add(new ListofArray(3,'A'));
		p.add(new ListofArray(6,'D'));
		p.add(new ListofArray(5,'B'));
		p.add(new ListofArray(6,'C'));
		
		for (ListofArray i: p)
			System.out.println(i.len + "------>"+ i.a);*/
		
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(3);
		p.add(6);
		p.add(5);
		p.add(6);
		while (!p.isEmpty()) {
			System.out.println("----->" + p.peek());
			p.poll();
		}

	}

}

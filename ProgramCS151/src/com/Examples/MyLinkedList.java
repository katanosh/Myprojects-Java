package com.Examples;

import java.util.*;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList();
		
		
		
		lList.addFirst("A");
		lList.add("E");
		lList.add(1,"C");
		lList.addLast("Q");
		
		if (lList.contains("B")){
			System.out.println("List has 'B' ");
		} else {
			lList.add(1,"B");
		}
		
		for (int i=0; i<lList.size(); i++)
			System.out.println(lList.get(i));
		
		Iterator<String> it = lList.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		lList.addLast("R");
		lList.addLast("S");
		lList.add(5,"F");
		lList.addLast("X");
		
		it = lList.descendingIterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		lList.removeFirst();
		lList.remove(4);
		
		it = lList.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}

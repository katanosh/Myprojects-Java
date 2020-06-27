package com.Java;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
}
class SortArray implements Comparator <Person>{
	public int compare(Person a, Person b) {
			int res;
			if (a.name.compareTo(b.name) < 0)
				res = 1;
			else
				res = -1;
		return res;
	}
}
public class TestArrays {
	
	public static void main(String[] args) {
		//=====================================================
		// sort array data can be primitive data type or object
		//=====================================================
		/*
		 Scanner in = new Scanner(System.in);
		int[] array = {3,6,2, 9, 1, 8, 12, 4};
		Integer[] array0 = {4,6,9,2,1,18,5,7,3};
		Person[] persons = new Person[5];
		for(int i = 0; i<persons.length; i++)
			persons[i] = new Person(in.nextLine());
		Arrays.sort(array);	
		for (int i: array)
			System.out.println(" --- > " + i);
		Arrays.sort(array0, Collections.reverseOrder());
		//Arrays.sort(array0, new SortArray());
		Arrays.sort(persons, new SortArray());
		
		for (Person p: persons)
			System.out.println(" --- > " + p.name);
		*/
		// =================================================
		// Sorting ArrayList
		// =================================================
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(3);
		arr.add(40);
		arr.add(5);
			
		Collections.sort(arr);
		for (int i=0; i<arr.size(); i++)
			System.out.println(arr.get(i));
		
		System.out.println("Print Array List in reverse order ------ > ");
		Collections.sort(arr, Collections.reverseOrder());
		for (int i=0; i<arr.size(); i++)
			System.out.println(arr.get(i));
		
		System.out.println("Print Arrays using Array List ------ > ");
		Integer[] a = {5,6,7,2,9,4,10,12,11,1};
		List lst = new ArrayList(Arrays.asList(a));
		
		Collections.sort(lst);
		for (int i=0; i<lst.size(); i++)
			System.out.println(lst.get(i));
		
		
	}

}

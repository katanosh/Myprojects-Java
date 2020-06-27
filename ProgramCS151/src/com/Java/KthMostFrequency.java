package com.Java;
import java.util.*;
/*
class Sortbyvalue implements Comparator<Map.Entry<String,Integer>>{
	public int  compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
		Integer v1 = (Integer) (o1).getValue();
		Integer v2 = (Integer) (o2).getValue();
		return v1.compareTo(v2);
	}
}
public class KthMostFrequency {
	static String kthMostFrequent(String[] strings, int k) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String s: strings) {
			Integer x = map.get(s);
			if (x==null) x=0;
			map.put(s, ++x);			
		}
		List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
		Collection.sort(list, new Sortbyvalue());
		/*Collection.sort(list, new Comparator (){
			public int <Integer> compare(Object o1, Object o2) {
				Integer v1 = (Integer) ((Map.Entry<String, Integer>) o1).getValue();
				Integer v2 = (Integer) ((Map.Entry<String, Integer>) o2).getValue();
				return v1.compareTo(v2);
			}
		});*/
		//if (list.size() > k ) return (String) (list.get(k).getKey());
	//}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

//}

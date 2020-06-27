package com.Test.Code;

public class TestGenericClassMethod {
	static <T> void printElement(T[] array) {
		for(T element : array)
			System.out.println(element);
		
	}
	static <T> T[] showArray(T[] array) {
		return array;
	}
	public static void main(String[] args) {
		Integer[] myArrayInt = {1,2,3,4,5};
		Double[] myArrayDbl = {1.2,2.3,3.4,4.5};
		Character[] myArrayChr = {'a', 'v','b', 'r'};
		
		printElement(myArrayInt);
		printElement(myArrayDbl);
		printElement(myArrayChr);
		
		System.out.println(showArray(myArrayInt)[0]);
		

	}

}

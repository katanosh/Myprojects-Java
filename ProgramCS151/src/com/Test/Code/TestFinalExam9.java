package com.Test.Code;

class ClassA{
	public void foo(ClassA other) {
		System.out.println("Apple");
	}	
	public void foo(ClassB other) {
		System.out.println("Grapes");
	}
	
}

class ClassB extends ClassA{
	public void foo(ClassA other) {
		System.out.println("Cherry");
	}	
	public void foo(ClassB other) {
		System.out.println("Apricot");
	}
	
}
public class TestFinalExam9 {

	public static int fac(int n) {
		int p = n;
		if (n==1)
			return p;
		else
		{
			n -= 1;
			p = p*n;
			return fac(n);
		}
				
	}
	public static void main(String[] args) {
		ClassA one = new ClassA();
		ClassA two = new ClassB();
		ClassB three = new ClassB();
		
		one.foo(two);
		two.foo(three);
		three.foo(one);
		int[] arr = new int[5];
		System.out.println(fac(4));

	}

}

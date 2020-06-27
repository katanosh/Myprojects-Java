package com.Test.Code;
interface C{
	 
	public void var();
	
}
abstract class A{
	public void show() {
		System.out.println("This is Superclass");
	}
}
class B extends A implements C{
	//public void show() {
	//	System.out.println("This is Subclass");
	//}
	public void var() {
		
	}
	public void display() {
		System.out.println("This is display of Subclass");
	}	
}
public class TestInheritance {

	public static void main(String[] args) {
		A a = new B();
		//a.display();
		a.show();

	}

}

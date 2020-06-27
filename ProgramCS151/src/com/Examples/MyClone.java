package com.Examples;
class Clone_01 implements Cloneable {
	int a;
	int b;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Clone_02 implements Cloneable{
	int a;
	int b;
	Clone_01 c;
	public Object clone() throws CloneNotSupportedException{
		Clone_02 d = (Clone_02) super.clone();
		d.c = new Clone_01(); 
		return d;
	}	

}
public class MyClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone_01 c1 = new Clone_01();
		c1.a=100;
		c1.b=200;
		
		Clone_01 c2= (Clone_01) c1.clone();
		c2.a = 110;
		c2.b = 210;
		
		System.out.println("c2 is a reference variable =====>");
		System.out.println("C1 " + c1.a  +" " +c1.b);
		System.out.println("C2 " + " " +c2.a + " " +c2.b);
		
/*		Clone_01 c3 = new Clone_01();
		c3 = c1;
		c3.a=100;
		c3.b=200;
		
		System.out.println("c3 is an object =====>");
		System.out.println("C1 " + c1.a  +" " +c1.b);
		System.out.println("C3 " + " " +c3.a + " " +c3.b);		
		
*/
		Clone_02 cc1 = new Clone_02();
		cc1.a = 10;
		cc1.b = 20;
		cc1.c = c1;
		
		Clone_02 cc2 ;
		
		cc2 = (Clone_02) cc1.clone();
		cc2.a= 12;
		cc2.b=22;
		cc2.c = c2;
		

		System.out.println("cc2 is an object & has an object of Clone_01 =====>");
		System.out.println("CC1 " + cc1.a  +" " +cc1.b+ " " + cc1.c.a + " " + cc1.c.b);
		System.out.println("CC2 " + cc2.a + " " +cc2.b+ " " +cc2.c.a+" " + cc2.c.b);
		//System.out.println("C3 " + c3.a + c3.b);

	}

}

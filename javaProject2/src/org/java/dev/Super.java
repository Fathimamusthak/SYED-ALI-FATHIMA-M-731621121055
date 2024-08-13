package org.java.dev;
class A{
	int a =10;
	A(String name){
		System.out.println("Welcome "+name);
	}
	void myMethod() {
		System.out.println("I am a Super Class method");
	}
}
class B extends A{
	B(){
		super("Fathima");
	}
	void myMethod2() {
		System.out.println("Super class variable : "+super.a);
		super.myMethod();
	}
}
public class Super {

	public static void main(String[] args) {
		B b = new B();
		b.myMethod2();
	}
}

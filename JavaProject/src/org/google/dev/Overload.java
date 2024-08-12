package org.google.dev;

public class Overload {
	void myMethod(String name) {
		System.out.println("Welcome "+ name);
	}
	void myMethod(int a ,int b) {
		System.out.println("Sum: "+ (a+b));
	}
	void myMethod(int n) {
		System.out.println("Sum : "+(n+n));
	}
	public static void main(String args[]) {
		Overload obj = new Overload();
		obj.myMethod(5);
		obj.myMethod("Fathima");
		obj.myMethod(10,20);
		
		
	}
}

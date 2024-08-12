package org.google.dev;
// constructor overloading
public class Constructor {
	Constructor(String name){
		System.out.println("Welcome "+ name);
	}
	Constructor(int a ,int b) {
		this("Fathima");
		System.out.println("Sum: "+ (a+b));
	}
	Constructor(int n) {
		this(10,20);
		System.out.println("Sum : "+(n+n));
	}	
	public static void main(String[] args) {
		Constructor obj = new Constructor(5);
	}

}

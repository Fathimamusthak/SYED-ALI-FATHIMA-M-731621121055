package org.google.dev;
//types of variables in java
public class MyClass {
	int b = 20;//instance or object variable
	static int c = 30;//static or class variable
	public static void main(String args[]) {
	int a =10;//local variable
	System.out.println("Local Variable : "+ a);
	MyClass obj = new MyClass();
	System.out.println(obj.b);
	System.out.println(MyClass.c);
	
}
}

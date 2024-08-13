package org.java.dev;
import java.util.Scanner;
public class Person {
	String name;
	int age ;
Person(String name){
	System.out.println("The Name of the Person is " + name);
}
Person(int age){
	System.out.println("The age of a Person  is " + age);
}
void display() {
	System.out.println("name:"+ name);
	System.out.println("age:"+ age);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name = sc.nextLine();
		System.out.println("Enter the Age :");
		int age = sc.nextInt();
		Person p1 = new Person(name);
		Person p2 = new Person(age);
	}
}
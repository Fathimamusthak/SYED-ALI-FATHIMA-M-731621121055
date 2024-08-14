package com.javaProject3;
class Animal1{
	int a=10;
	void move() {
		System.out.println("All Animals move from one place to another");
	}
	void eat() {
		System.out.println("All Animals eat something");
	}
}
class Dog extends Animal1{
	int a=20;
	void move() {
		System.out.println("Dog will Walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");

	}
}
class Bird extends Animal1{
	void move() {
		System.out.println("Bird will Fly");
	}
	void eat() {
		System.out.println("Bird will eat nuts");

	}
}
class Fish extends Animal1{
	void move() {
		System.out.println("Fish will swim");
	}
	void eat() {
		System.out.println("Fish  will eat small fish");

	}
}
public class MyClass {
	public static void main(String args[]) {
		Animal1 animal;
		animal = new Dog();//DMD
		animal.move();
		animal.eat();
		System.out.println(animal.a);
		animal = new Dog();
		animal.move();
		animal.eat();
		
		animal = new Bird();
		animal.move();
		animal.eat();
		
		animal = new Fish();
		animal.move();
		animal.eat();
	}

}

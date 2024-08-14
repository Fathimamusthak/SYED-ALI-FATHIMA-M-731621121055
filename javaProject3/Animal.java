package com.javaProject3;
class Animals {
    public void makeSound() {
		System.out.println("The Cat Barks");


    }
    
}
class Cat extends Animals{
	@Override
	public void makeSound() {
		super.makeSound();
	}
}
   
public class Animal {
	public static void main(String[] args) {
		
	        Cat c1 = new Cat();
	        c1.makeSound(); 
	}
}

package com.javaProject3;
class Vehicles {
 public void drive() {
	    System.out.println("Repairing a Car.");

 }
}
class Car extends Vehicles {
 @Override
public void drive() {
	super.drive();

}
}
public class Vechicle {
	 public static void main(String[] args) {
	     Car c1 = new Car();
	     
	     c1.drive(); 
	 }

}


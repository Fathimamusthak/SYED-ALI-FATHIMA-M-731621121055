package org.java.dev;
class vechicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class FourWheelers extends vechicle{
	void noOfWheel() {
		System.out.println("I have four wheels");
	}
}
class Car extends FourWheelers{
	void brandName(){
		System.out.println("Brand Name is Hyundai");
	}
}
public class Multilevel {
	public static void main(String[] args) {
		Car b1 = new Car();
		b1.noOfEngine();
		b1.noOfWheel();
		b1.brandName();

	}

}

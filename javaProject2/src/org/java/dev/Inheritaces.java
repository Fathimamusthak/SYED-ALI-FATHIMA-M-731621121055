package org.java.dev;
// single inheritance
class TwoWheeler{
	void noOfWheels() {
		System.out.println(" I have two wheels");
	}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name is Honda");
	}
}
public class Inheritaces {
	public static void main(String args[]) {
		Bike b1 = new Bike();
		b1.noOfWheels();
		b1.brandName();
	}

}

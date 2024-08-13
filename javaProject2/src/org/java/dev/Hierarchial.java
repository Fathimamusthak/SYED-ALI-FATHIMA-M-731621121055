package org.java.dev;
class Vechicles{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class FourWheelerss extends Vechicles{
	void noOfWheel() {
		System.out.println("I have four wheels");
	}
}
class Auto extends FourWheelerss{
	void brandName(){
		System.out.println("Brand Name is Hyundai");
	}	
}
class Jeep extends FourWheelerss{
	void brandName(){
		System.out.println("Brand Name is Maruthi");
	}	
}
public class Hierarchial {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		a1.noOfEngine();
		a1.noOfWheel();
		a1.brandName();
		
		Jeep j1= new Jeep();
		j1.noOfEngine();
		j1.noOfWheel();
		j1.brandName();
	}
	}



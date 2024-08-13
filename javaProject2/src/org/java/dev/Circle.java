package org.java.dev;

public class Circle {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	double getRadius(){
	return radius;
	}
	void setRadius(double radius){
	this.radius=radius;
	}
	double calArea(){
	return Math.PI * radius*radius;
	}
	double calCircum(){
	return 2* Math.PI*radius;
	}
	public static void main(String[] args) {
		Circle myCircle=new Circle(5.0);
		System.out.println("Radius:"+myCircle.getRadius());
		System.out.println("Area of the Circle : "+myCircle.calArea());
		System.out.println("Circumference of the Circle :"+myCircle.calCircum());

		myCircle.setRadius(7.0);
		System.out.println("Updated Radius:"+myCircle.getRadius());
		System.out.println("Updated Area of the Circle ::"+myCircle.calArea());
		System.out.println("Updated Circumference of the Circle :"+myCircle.calCircum());
	}
}



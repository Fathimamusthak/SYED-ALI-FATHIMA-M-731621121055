package com.javaProject3;
class Shapes {
    public int  getArea() {
        return 0;
    }
}
 class Rectangle extends Shapes {
    int  length;
    int  width;

Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

 @Override
public int getArea() {
	return length * width;
}
}
public class Shape {

	public static void main(String[] args) {
		 Rectangle r = new Rectangle(5, 10);
	        int  area = r.getArea();
	        System.out.println("The area of the rectangle is: " + area);

	}

}















package org.java.dev;

import java.util.Scanner;

public class Rectangle {
	int width,height;
	int perimeter;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Width: ");
		int width = sc.nextInt();
		System.out.println("Enter the Height :");
		int height = sc.nextInt();
		int perimeter = width * height;
		System.out.println("The Perimeter of the Rectangle is " + perimeter);
	}
}

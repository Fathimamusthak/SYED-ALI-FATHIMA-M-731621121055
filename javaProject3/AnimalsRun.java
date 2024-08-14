package com.javaProject3;
class Animalss{
    public void move() {
        System.out.println("The Cheetah Runs");
    }
}
class Cheetah extends Animalss{
	@Override
	public void move() {
		super.move();
	}
}
public class AnimalsRun {
	public static void main(String[] args) {
		Cheetah ch = new Cheetah();
        ch.move();
    }
}
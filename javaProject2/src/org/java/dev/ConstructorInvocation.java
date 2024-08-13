package org.java.dev;
class X{
	X(){
		this(5);
		System.out.println("X");
	}
	X(int a ){
		super();
		System.out.println("X 1");
	}
}
class Y extends X{
	Y(){
		super(5);
		System.out.println("Y");
	}
	Y(int a){
		System.out.println("Y 1");
	}
}
public class ConstructorInvocation {
	public static void main(String args[]) {
		Y y = new Y(5);
	}

}

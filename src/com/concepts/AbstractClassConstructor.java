package com.concepts;


abstract class Shape{
	
	abstract void draw();
	public Shape() {
		System.out.println("Shape constructor called");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println(" Drawing a Circle");
		
	}
	
	
}
public class AbstractClassConstructor {

	public static void main(String[] args) {
		
		Circle c = new Circle ();
		c.draw();

	}

}

package com.company;

public class Main {

    public static void main(String[] args) {
	    Shapes circle = new Circle();
	    circle.getArea();
	    circle.getPerimeter();

	    Shapes square = new Square();
	    square.getPerimeter();
	    square.getArea();

	    Shapes triangle = new Triangle();
	    triangle.getPerimeter();
	    triangle.getArea();

	    Shapes rectangle = new Rectangle();
	    rectangle.getPerimeter();
	    rectangle.getArea();
    }
}

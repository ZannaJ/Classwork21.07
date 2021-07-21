package com.company;

public class Circle implements Shapes {
    int radius = 5;
    public void getPerimeter() {
        double circumference = 2 * (Math.PI) * (radius);
        System.out.println("The Circumference is " + circumference);
    }
    public void getArea() {
        double area = (Math.PI) * (radius) * (radius);
        System.out.println("The area of circle is " + area);
    }
}

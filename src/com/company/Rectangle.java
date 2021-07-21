package com.company;

public class Rectangle implements Shapes{

    int a = 8;
    int b = 6;

    public void getPerimeter(){
        int perimeter = 2 * (a + b);
        System.out.println("The perimeter of rectangle is " + perimeter);
    }
    public void getArea() {
        int area = a * b;
        System.out.println("The area of rectangle is " + area);
    }
}

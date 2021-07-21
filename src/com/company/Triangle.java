package com.company;

public class Triangle implements Shapes {
    int a = 7;
    int b = 9;
    int c = 2;
    public void getPerimeter() {
        int perimeter = a + b + c;
        System.out.println("The perimeter of triangle is " + perimeter);
    }
    public void getArea(){
        int area = a * b * c;
        System.out.println("The area of triangle is " + area);
    }

}

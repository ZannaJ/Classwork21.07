package com.company;

public class Square implements Shapes{
    int a = 5;
    public void getPerimeter() {
        int perimeter = a * 4;
        System.out.println("The perimeter of square is " + perimeter);
    }
    public void getArea(){
        int area = a * a;
        System.out.println("The area of square is " + area);
    }

}

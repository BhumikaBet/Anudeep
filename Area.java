package com.demo;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//area of rectangle
        int length = 5;
		int breadth = 10;
		int area_rectangle = (length * breadth);
		System.out.println("Area of Rectangle : "+ area_rectangle );
	//area of square
		int side = 4;
        int area_square = side * side;
        System.out.println("Area of Square : " + area_square);
     //area of triangle
        int base = 6;
        int height = 8;
        double area_triangle = 0.5 * base * height;
        System.out.println("Area of Triangle : " + area_triangle);
      //area of circle
        double radius = 7;
        double area_circle = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + area_circle);

	}

}

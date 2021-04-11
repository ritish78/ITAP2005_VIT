package com.company.tutorial.tutorial7;

public class TriangleTest {

    public static void main(String[] args) {
        Triangle firstTriangle = new Triangle();
        Triangle secondTriangle = new Triangle(22.6, 23, 29.2);

        firstTriangle.setSide1(12.3);
        firstTriangle.setSide2(19.6);
        firstTriangle.setSide3(9.4);
        firstTriangle.setColor("Red");
        firstTriangle.setFilled(true);

        System.out.println("\t\t First triangle");
        System.out.println(firstTriangle);
        System.out.println("Area: " + firstTriangle.getArea());
        System.out.println("Perimeter: " + firstTriangle.getPerimeter());
        System.out.println("Color: " + firstTriangle.getColor());
        System.out.println("Is filled: " + firstTriangle.isFilled());


        System.out.println("\n\t\t Second triangle");
        System.out.println(secondTriangle);
        System.out.println("Area: " + secondTriangle.getArea());
        System.out.println("Perimeter: " + secondTriangle.getPerimeter());
        System.out.println("Color: " + secondTriangle.getColor());
        System.out.println("Is filled: " + secondTriangle.isFilled());

    }
}

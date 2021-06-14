package OOP.Circle;

import OOP.Circle.Circle;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        circle.setRadius(radius);
        circle.setColor("Red");
//        System.out.println("Radius: "+radius);
//        System.out.println("circle color: "+circle.getColor());
//        System.out.println("Area: "+circle.getArea());
        System.out.print(circle.toString());
    }
}

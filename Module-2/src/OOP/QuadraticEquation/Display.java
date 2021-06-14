package OOP.QuadraticEquation;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        System.out.print(quadraticEquation.check());
    }
}

package ExceptionAndDebug.IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class illegalTriangleException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a :");
            double a = sc.nextDouble();

            System.out.println("Enter a :");
            double b = sc.nextDouble();

            System.out.println("Enter a :");
            double c = sc.nextDouble();

            checkTriangle(a,b,c);
        }
        catch (InputMismatchException e){
            System.out.println("is not excption!");
        }
    }

    public static void checkTriangle(double a, double b, double c) {
        try {
            if (a < 0 || b < 0 || c < 0) {
                System.out.println("a, b, c must be positives");
            }
            if (a + b < c || a + c < b || b + c < a) {
                System.out.println("a, b, c are not sides of triangle");
            }
        }
        catch (InputMismatchException e){
            System.out.println("a, b, c are sides of triangle");
        }
    }

}

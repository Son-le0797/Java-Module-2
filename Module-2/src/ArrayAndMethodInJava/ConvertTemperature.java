package ArrayAndMethodInJava;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit,celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Farenheit to Celsius: "+fahrenheitToCelius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: "+cesiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
    public  static double cesiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5)* celsius + 32;
        return fahrenheit;
    }
    public  static double fahrenheitToCelius(double fahrenheit) {
        double celsius = (5.0/9)* (fahrenheit-32);
        return celsius;
    }
}


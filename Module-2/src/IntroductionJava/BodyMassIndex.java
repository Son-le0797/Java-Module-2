package IntroductionJava;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;

        System.out.println("Enter weight(in kilogram): ");
        weight = scanner.nextDouble();

//        System.out.println("Enter height(in metes): ");
//        height = scanner.nextDouble();
        System.out.print("Your height (in meter): ");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height,2);
//        System.out.printf("%-20.2f%s","bmi","2","3");

//        if(bmi<18.0)
//            System.out.printf("%-20.2f%s", bmi,  "UnderWeight");
//        else if(bmi < 25.0)
//            System.out.printf("%-20.2f%s", bmi ,"Normal");
//        else if (bmi < 30.0 )
//            System.out.printf("%-20.2f%s", bmi, "Overweight");
//        else
//            System.out.printf("%-20.2f%s", bmi, "Obese");
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}

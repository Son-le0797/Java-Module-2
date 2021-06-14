package IntroductionJava;

import java.util.Scanner;

public class ChangeCurency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rate = 23000,USD,VND;
        System.out.println("Enter USD: ");
        USD = input.nextDouble();
        VND = USD*rate;
        System.out.println(VND);

    }
}

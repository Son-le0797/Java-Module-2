package LoopInJava;

import java.util.Scanner;

public class LoanInvestment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double investment, interest = 0.06;
        int month;
        double total_interest = 0;
        System.out.println("Enter investment amount you want: ");
        investment = input.nextDouble();
        System.out.println("Enter number of month: ");
        month = input.nextInt();

        for(int i = 0; i<month;i++){
            total_interest += (investment*interest/12*month)/12;
        }
        System.out.println("Total of interest is: "+total_interest);
    }
}

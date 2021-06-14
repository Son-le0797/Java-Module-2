package LoopInJava;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num ;
        System.out.println("Enter a number for check: ");
        num = input.nextInt();
        boolean check = true;
        if(num < 2) {
            check = false;
        }else{

            for(int i = 2;i <=Math.sqrt(num);i++) {
                if (num % i == 0) {
                check = false;
            }
            }
                if(check == true){
                    System.out.println(num+" is Prime");
                }else{
                    System.out.println(num+" is not Prime");
            }
        }
    }
}

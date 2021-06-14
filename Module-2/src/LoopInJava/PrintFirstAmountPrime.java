package LoopInJava;

import java.util.Scanner;

public class PrintFirstAmountPrime {
    public static void main(String[] args) {
        int count = 0,num = 2;
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount of Prime you want:");
        amount = sc.nextInt();
        while(count <= amount){
            boolean check = true;

            for(int i = 2; i <=Math.sqrt(num);i++){
                if(num % i == 0){
                    check = false;
                }
            }if(check){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
}

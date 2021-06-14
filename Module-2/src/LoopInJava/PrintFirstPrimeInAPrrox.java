package LoopInJava;


import java.util.Scanner;

public class PrintFirstPrimeInAPrrox {
    public static void main(String[] args) {
    int Number,num = 2,count = 0;
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number u want to show all Prime in that aprrox: ");
    Number = sc.nextInt();

        while(num <= Number){
            boolean check = true;

            for(int i = 2; i <=Math.sqrt(num);i++){
                if(num % i == 0){
                    check = false;
                }
            }if(check){
                System.out.print(num+" ");

            }
            num++;
        }

    }
    }


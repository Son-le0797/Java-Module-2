package IntroductionJava;

import java.util.Scanner;

public class ReadNumberIntoChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;

        while (num<0 || num >1000){
            System.out.println("Enter a number: ");

            num = input.nextInt();
            if(num>=0 && num <10){
                switch(num){
                    case 0:
                        System.out.println("Zero");
                    case 1:
                        System.out.println("One");
                    case 2:
                        System.out.println("Two");
                    case 3:
                        System.out.println("Three");
                    case 4:
                        System.out.println("Four");
                    case 5:
                        System.out.println("Five");
                    case 6:
                        System.out.println("Six");
                    case 7:
                        System.out.println("Seven");
                    case 8:
                        System.out.println("Eight");
                    case 9:
                        System.out.println("Nine");
                }
            }
            else if (num<20){

            }
        }
    }
}

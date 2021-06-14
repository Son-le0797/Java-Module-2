package test;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MoblieSentMessage {
    public static void main(String[] args) {
        TestMoblie Nokia = new TestMoblie("message");
        TestMoblie Iphone = new TestMoblie("message");
        Scanner sc = new Scanner(System.in);
        String msg;

        int choice = -1;
        while (choice <0) {
            System.out.println("1. Sent message to Iphone ");
            System.out.println("2. Sent message to Nokia");

            System.out.println("Choose a choice");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Sent message: ");
                    msg = sc.nextLine();

                    break;
                case 2:
                    System.out.println("Sent message: ");
                    break;
            }
        }
    }

}

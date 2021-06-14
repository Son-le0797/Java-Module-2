package LoopInJava;

import java.util.Scanner;

public class DrawInLoop {
    public static void main(String[] args) {
        int choice =-1;
        Scanner input = new Scanner(System.in);

        while (choice !=0){
            System.out.println("1. Draw a rectangle");
            System.out.println("2. Draw a square triangle");
            System.out.println("3. Draw isosceles triangle");
            System.out.println("4. Exit");

            choice = input.nextInt();
            switch (choice) {
                case 1:
                    String rectangle[][] = new String[3][6];
                    for (int a = 0; a < rectangle.length; a++) {
                        for (int b = 0; b < rectangle[a].length; b++) {
                            rectangle[a][b] = "*";
                            System.out.print(rectangle[a][b]);
                        }
                        System.out.println();

                    }
                    break;
                case 2:
                    String squareTriangle[][] = new String[5][5];
                    for (int a = 0; a <5; a++) {
                        for (int b = 0; b <= a; b++) {
                            squareTriangle[a][b] = "*";
                            System.out.print(squareTriangle[a][b]);
                        }
                        System.out.println();
                    }break;
                case 3:
//                    String isoscelesTriangle[][]= new String[4][7];
                    for (int a = 0; a <5 ; a++ ){
                        for (int b = 5; b>a;b--){
                            System.out.print(" ");
                        }for(int c = 0; c<a+1;c++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }break;
                case 4:
                    System.exit(4);
            }
        }
    }
}

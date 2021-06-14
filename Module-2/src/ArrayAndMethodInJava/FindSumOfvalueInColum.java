package ArrayAndMethodInJava;

import java.util.Scanner;

public class FindSumOfvalueInColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height=4,width=5;
        int[][] arr = new int[height][width];
        int sum = 0;
        System.out.print("Enter value for elements in array");
        for(int i = 0; i<height;i++){
            System.out.println("");
            for(int j = 0; j<width;j++){
                System.out.print("Element in row"+(j+1)+" and col "+(i+1)+ " ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Which colum you want to sum all element's value: ");
        int colum = sc.nextInt();
        for(int i = 0; i<height;i++){
            for(int j = 0; j< width;j++){
                if(j == colum){
                    sum += arr[i][j];
                }
            }

        }System.out.print("Sum of elements in colum "+colum+": "+sum);
    }
}

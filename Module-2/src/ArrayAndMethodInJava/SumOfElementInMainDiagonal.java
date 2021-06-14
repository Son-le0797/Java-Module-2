package ArrayAndMethodInJava;

import java.util.Scanner;

public class SumOfElementInMainDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square array: ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        int sum = 0;

        for(int i = 0; i < size;i++){
            System.out.println("");
            for(int j = 0; j < size;j++){
                System.out.print("Enter value for element in row "+(i+1)+" col "+(j+1)+": ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < size;i++) {
            for (int j = 0; j < size; j++){
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }System.out.print("Sum of elements in main diagonal is: "+sum);
    }
}

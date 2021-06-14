package ArrayAndMethodInJava;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class findMaxValueInTwoDimensionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size: \n");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        int max = arr[0][0];

        for(int i = 0;i < size;i++){
            for(int j = 0; j < size;j++){
                System.out.printf("Enter value to row %d and col %d: \n",i+1,j+1);
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i < size;i++){
            for(int j = 0; j < size;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        System.out.printf("Max value in 2-dimensional array is: %d",max);
    }

}

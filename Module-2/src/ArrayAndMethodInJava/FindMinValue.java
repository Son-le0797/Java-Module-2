package ArrayAndMethodInJava;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<arr.length;i++){
            System.out.println("Enter value of element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.print("min value in array is: "+min);
    }
}

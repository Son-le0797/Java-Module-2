package SortAlgorithm;

import java.util.Scanner;

public class BubbleSort {
//    public static void bubbleSort(int[] arr){
//        boolean checkPassed = true;
//        int count = 0;
//        for(int i = 1; i < arr.length && checkPassed; i++){
//            checkPassed = false;
//            for(int j = 0; j < arr.length - i - 1; j++){
//                if(arr[i] > arr[i + 1]){
//                    System.out.printf("\nSwap %d with %d",arr[i],arr[i + 1]);
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//
//                    count++;
//
//                    checkPassed = true;
//                }
//            }
//
//            if(checkPassed == false){
//                System.out.println("Array is sorted");
//
//            }
//
//            System.out.printf("Array after %d step sort: ",count);
//            for(int m = 0; m < arr.length; m++){
//                System.out.printf("%d\t",arr[m]);
//            }
//
//
//        }
//    }
public static void bubbleSort(int[] arr) {
    boolean checkPass = true;
    for (int k = 1; k < arr.length && checkPass; k++) {
        checkPass = false;
        for (int i = 0; i < arr.length - k; i++) {
            if (arr[i] > arr[i + 1]) {

                System.out.printf("\nSwap %d with %d",arr[i],arr[i + 1]);
//                System.out.println("Swap " + arr[i] + " with " + arr[i + 1]);
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                checkPass = true;
            }
        }

        if (checkPass == false) {
            System.out.println("Array is fully sorted.");
            break;
        }

        System.out.print("\nList after the  " + k + "' sort: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        System.out.println("\n");
    }
}
}

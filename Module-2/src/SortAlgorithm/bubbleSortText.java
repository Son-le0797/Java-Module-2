package SortAlgorithm;

import java.util.Scanner;

import static SortAlgorithm.BubbleSort.bubbleSort;

public class bubbleSortText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array's size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.printf("\nEnter %d values of array: ",size);
        for(int i = 0; i < size; i++){
            System.out.print("\nValue " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i = 0; i < size; i++){
            System.out.printf("%d\t",arr[i]);
        }
        System.out.println("\nSorting array...");
        bubbleSort(arr);
    }
}

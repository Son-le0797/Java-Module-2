package ArrayAndMethodInJava;

import java.util.Scanner;

public class RemoveAnElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("the array is: ");
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter a number: ");
        int check = sc.nextInt();
        int count = 0;

        for(int i = 0; i< size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array: ");
        for(int i = 0; i<size;i++){
            System.out.printf(arr[i]+" ");
        }
        for(int i = 0; i<size;i++){
            if(arr[i] == check){
                count++;
            }
        }
        for(int i = 0; i<size-1;i++){
            for(int j = i;j<size-1;j++){
                if(arr[j] == check){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        if(count == 0){

        }
    }
}


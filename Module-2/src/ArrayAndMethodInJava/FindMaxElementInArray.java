package ArrayAndMethodInJava;

import java.util.Scanner;

public class FindMaxElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if(size > 20)
                System.out.print("size should not exceed 20");
        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter elemet"+ (i+1)+ ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("property list: ");
        for(int k = 0; k< array.length;k++){
            System.out.print(array[k]+"\t");
        }
        int max = array[0];
        int index = 1;
        for(int j = 0; j< array.length;j++){
            if(array[j]>max){
                max = array[j];
                index = j+1;
            }
        }
        System.out.print("The biggest property value in this list is: "+max+" ,at position: "+index);

    }
}

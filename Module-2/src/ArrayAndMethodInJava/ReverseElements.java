package ArrayAndMethodInJava;

import java.util.Scanner;

public class ReverseElements {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        int size;
        do{                                                             //Kiểm tra dk <20 của size
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if(size > 20)
                System.out.println("size does not exceed 20");
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i<array.length){                                           // NHập element
            System.out.print("Enter element " + (i+1)+ ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Elements in array: ");    // In ra array
        for( int j = 0; j< array.length; j++){
            System.out.print(+array[j]+ "\t");
        }
        for(int k = 0; k<array.length/2;k++){        //đảo ngược array
            int temp = array[k];
            array[k] = array[size - 1 - k];
            array[size -1 - k] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");        //in ra array ngược
        for( int h = 0; h< array.length;h++){
            System.out.print(array[h] + "\t");
        }
    }
}

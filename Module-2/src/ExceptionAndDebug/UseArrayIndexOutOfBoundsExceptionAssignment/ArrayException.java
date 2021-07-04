package ExceptionAndDebug.UseArrayIndexOutOfBoundsExceptionAssignment;

import java.util.Random;
import java.util.Scanner;

public class ArrayException {
    public Integer[] createRandomArray() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        int count = 0;
        System.out.println("List of element in random array");
        for (int i = 0; i < 100; i++){

            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + "\t");
            count++;
            if (count == 20) {
                System.out.print("\n");
                count = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayException arrayException = new ArrayException();
        Integer[] arr = arrayException.createRandomArray();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index: ");
        int index = sc.nextInt();

        try {
            System.out.printf("Value of element at index %d is %s",index,arr[index]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("The index is out of array's length");
        }
    }
}

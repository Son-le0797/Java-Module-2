package ArrayAndMethodInJava;

import java.util.Scanner;

public class CountPassedStudent {
    public static void main(String[] args) {
        int size;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if(size>30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);

        int[] arr = new int[size];
        for(int i = 0; i<size;i++){
            do {
                System.out.print("ENter a mark for Student " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
                if(arr[i]<0 || arr[i]>10)
                    System.out.println("Mark should in range 0 to 10");
            }while ( arr[i] < 0 || arr[i]>10);
        }
        int count = 0;
        System.out.print("List of mark: ");
        System.out.println("");
        for(int j = 0; j<size;j++){
            System.out.print(arr[j]+"  ");
            if(arr[j] >=5 && arr[j]<=10)
                count++;
        }
        System.out.println("Number of passed student is: "+ count);
    }

}

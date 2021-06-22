package ArrayAndMethodInJava;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter for size of array A: ");
        int size1 = sc.nextInt();
        System.out.print("Enter for size of array B: ");
        int size2 = sc.nextInt();

        int[] A = new int[size1];
        int[] B = new int[size2];
        int[] C = new int[size1 + size2];

        System.out.println("Enter value for array A:");
        for(int a = 0; a < size1; a++){
            A[a] = sc.nextInt();
        }

        System.out.println("Enter value for array B");
        for(int b = 0; b < size2; b++){
            B[b] = sc.nextInt();
        }

        System.out.print("\nArray A: ");
        for(int q = 0; q < size1; q++){
            System.out.print(A[q]+"\t");
        }

        System.out.print("\nArray B: ");
        for(int w = 0; w < size2; w++){
            System.out.print(B[w]+"\t");
        }

        for(int i = 0; i < size1; i++){
            C[i] = A[i];
        }
        for(int j = 0; j < size2; j++){
            C[j + size1] = B[j];
        }

        System.out.print("\nArray C: ");
        for(int e = 0; e < C.length; e++){
            System.out.print(C[e]+"\t");
        }
    }
}

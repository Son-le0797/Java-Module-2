package JavaCollectionFramework.Stack.ReverseStack;

import JavaCollectionFramework.Stack.ReverseStack.ReverseElement;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class ReverseElementClient {
    public static void main(String[] args) {
        int[] arr = {12,2,24,7,97,36,6,4};
        String str = "Chuc mung nam moi!";
        System.out.println("Array of number: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nAfter reverse: ");

        System.out.println(Arrays.toString(ReverseElement.ReverseNumberByStack(arr)));

        System.out.println("");
        System.out.printf("String: %s",str);
        System.out.print("\nAfter reverse: ");
        System.out.println(ReverseElement.ReverseStringByStack(str));
    }
}

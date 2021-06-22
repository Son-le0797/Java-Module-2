package ArrayAndMethodInJava;

import java.util.Scanner;

public class FindCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Enter the character you want to find: ");
        char a = sc.next().charAt(0);

        int count = 0;
        int size = str.length();

        for(int i = 0; i < size; i++ ){
            if(str.charAt(i) == a){
                count++;
            }
        }
        if(count < 1){
            System.out.printf("There's no character '%c' in String.",a);
        }
        else if(count == 1){
            System.out.printf("There's 1 character '%c' in String.",a);
        }
        else {
            System.out.printf("There're %d characters '%c' in String.",count,a);
        }
    }
}


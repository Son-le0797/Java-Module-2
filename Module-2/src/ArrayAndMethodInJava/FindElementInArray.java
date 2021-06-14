package ArrayAndMethodInJava;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] student = {"Sơn","Phước","Đạt","Bình","Chương","Nhi","Lộc"};
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        name = sc.nextLine();
        boolean isExist = false;
        for(int i = 0; i< student.length; i++) {
            if (student[i].equals(name)) {
                System.out.print("Position of the students in the list: " +name+ " is "+(i+1));
                isExist = true;
            }
        }
        if(!isExist)
            System.out.println("Nor found "+name+"in the list.");
    }
}

package Student;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        Student student = new Student();
        student.setName(name);
        student.setClasses("C0421K1");
        System.out.println("Name: "+student.getName());
        System.out.println("Classes: "+student.getClasses());
    }
}

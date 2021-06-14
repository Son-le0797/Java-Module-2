import java.io.InputStream;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String halo ;
        System.out.println("Enter your name: ");
        halo = scanner.nextLine();

        System.out.println("Hello: " + halo);
        System.out.println("Have a good day");

    }
}

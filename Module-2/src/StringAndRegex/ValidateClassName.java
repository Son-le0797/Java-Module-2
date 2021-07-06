package StringAndRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {

    public static boolean checkPassword(String str){
        String regex = "^[A|C|P]{1}[0-9]{4}[G|H|I|K|L|M]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        String str = new Scanner(System.in).nextLine();
        if (checkPassword(str)) {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}

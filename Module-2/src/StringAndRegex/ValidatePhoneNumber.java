package StringAndRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
//    static int a = 0;
//
//    public static void main(String[] args) {
//
//        System.out.println(a);
//    }

    public static boolean checkPhoneNumber(String phoneNumber){
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Enter a phone: ");
        String phone = new Scanner(System.in).nextLine();
        if (checkPhoneNumber(phone)) {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}

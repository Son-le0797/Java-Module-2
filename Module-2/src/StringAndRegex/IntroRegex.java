package StringAndRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntroRegex {
    public static void main(String[] args) {
//        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
//
//        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
//
//        Matcher matcher = pattern.matcher(text1);
//
//        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
//
//        while (matcher.find()) {
//
//            System.out.println(text1.substring(matcher.start(), matcher.end()));
//
//        }


//        System.out.println("Java Java Java".replaceAll("v\\w", "wi"));
//
//        System.out.println("Java Java Java".replaceFirst("v\\w", "wi"));
//
//        System.out.println("Java Java Java".replaceAll("\\w", "wi"));
//
//        System.out.println("Java Java Java".replaceFirst("\\w", "wi"));

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(checkDoB(str)) {
            System.out.println("true");
        }
        else
            System.out.println("false");

    }

    public static boolean checkDoB(String dob){
        String regex = "^[A-Z]+[a-zA-Z0-9._]{4,256}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dob);
        return matcher.matches();
    }
}

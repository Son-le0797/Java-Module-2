package test;

import java.util.Scanner;

public class MonOfYear {
    public static void main(String[] args) {
//        String monthOfYear[] = new String[12];
//        monthOfYear[0] = "January";
//        monthOfYear[1] = "February";
//        monthOfYear[2] = "March";
//        monthOfYear[3] = "April";
//        monthOfYear[4] = "May";
//        monthOfYear[5] = "June";
//        monthOfYear[6] = "July";
//        monthOfYear[7] = "August";
//        monthOfYear[8] = "September";
//        monthOfYear[9] = "October";
//        monthOfYear[10] = "November";
//        monthOfYear[11] = "December";
//
//        for (int i = 0; i < 12; i++) {
//            System.out.println( monthOfYear[i]);
//        }
        monthOfYear(6);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }

    public static void monthOfYear(int m){
        String monthOfYear[] = new String[12];
        monthOfYear[0] = "January";
        monthOfYear[1] = "February";
        monthOfYear[2] = "March";
        monthOfYear[3] = "April";
        monthOfYear[4] = "May";
        monthOfYear[5] = "June";
        monthOfYear[6] = "July";
        monthOfYear[7] = "August";
        monthOfYear[8] = "September";
        monthOfYear[9] = "October";
        monthOfYear[10] = "November";
        monthOfYear[11] = "December";

        System.out.println(monthOfYear[m]);
    }


}

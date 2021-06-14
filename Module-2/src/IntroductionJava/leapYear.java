import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();

        boolean isLeapYear = false;
        if(year%4 == 0){
            if(year%100 ==0){
                if(year%400 == 0){
                    isLeapYear = true;
                }//isLeapYear = false;
            }else{
                isLeapYear = true;
            }//isLeapYear = false;
        }

        if(isLeapYear){
            System.out.printf("%d is leap year",year);
        }else{
            System.out.printf("%d is not leap year", year);
        }
    }
}

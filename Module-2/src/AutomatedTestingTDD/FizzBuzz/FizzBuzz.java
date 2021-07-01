package AutomatedTestingTDD.FizzBuzz;

import java.security.InvalidParameterException;

public class FizzBuzz {

    public static String checkFizzBuzz(int number){
        String check;

        if(number > 0){
            if(number % 3 == 0 && number % 5 == 0){
                check = "FizzBuzz";
            }
            else if(number % 3 == 0){
                check = "Fizz";
            }
            else if(number % 5 == 0){
                check = "Buzz";
            }
            else {
                if(number / 10 == 3 || number % 10 == 3) {
                    check = "Fizz";
                }
                else if (number / 10 == 5 || number % 10 == 5)
                    check = "Buzz";
//                else {
//                    if(number < 10) {
//                        switch (number){
//                            case 1:
//                                System.out.println("một");
//                                break;
//                            case 2:
//                                System.out.println("hai");
//                                break;
//                            case 4:
//                                System.out.println("bốn");
//                                break;
//                            case 7:
//                                System.out.println("bảy");
//                                break;
//                            case 8:
//                                System.out.println("tám");
//                                break;
//                        }
//                    }
//                    else {
//
//                    }
//                }
            }
        }
        throw new InvalidParameterException(number+" is Invalid");
    }
}

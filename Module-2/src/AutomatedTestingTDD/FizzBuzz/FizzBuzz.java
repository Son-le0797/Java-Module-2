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
//            else if()
        }
        throw new InvalidParameterException(number+" is Invalid");
    }
}

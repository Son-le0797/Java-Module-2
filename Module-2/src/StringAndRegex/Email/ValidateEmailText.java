package StringAndRegex.Email;

public class ValidateEmailText {

    private static EmailExample emailExample;
    public static final String[] validateEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validateEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.printf("\nEmail: %s is valid: %b",email,isvalid);
//            System.out.println("Email: " + email + " is valid: " + isvalid);
        }

        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.printf("\nEmail: %s is valid: %b",email,isvalid);
        }
    }
}

package Regex;

public class ValidateEmailTest {
    public static void main(String[] args) {

        String[] emailString = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        String[] emailString1= {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

        ValidateEmail validateEmail = new ValidateEmail();
        for(String s: emailString) {
            System.out.println("Email "+ s + " is :" + (validateEmail.checkValidateEmail(s) ? " valid": " invalid"));
        }
        System.out.println("--------------------------------");
        for(String s: emailString1) {
            System.out.println("Email "+ s + " is :" + (validateEmail.checkValidateEmail(s) ? " valid": " invalid"));
        }
    }

}

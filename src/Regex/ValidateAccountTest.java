package Regex;
import java.util.Scanner;
public class ValidateAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountRegex accountRegex = new AccountRegex();
//        System.out.println("Input account: ");
//        String accountStringInput = scanner.nextLine();
//        System.out.println("Inputted account is " + (accountRegex.isValidAccount(accountStringInput) ? "valid" : "invalid"));
        String[] validAccount = {"123abc_", "_abc123", "______", "123456","abcdefgh"};
        String[] invalidAccount = {".@", "12345", "1234_", "abcde"};
        for(String string : validAccount) {
            System.out.println("Account -->" + string + " is-->" + (accountRegex.isValidAccount(string) ? " valid" : " invalid"));
        }
        for(String string : invalidAccount) {
            System.out.println("Account -->" + string + " is-->" + (accountRegex.isValidAccount(string) ? " valid" : " invalid"));
        }
    }


}

package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static Pattern pattern;
    private static Matcher matcher;

    final static String EMAIL_REGEX = "^[a-zA-Z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)";

    public ValidateEmail() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean checkValidateEmail(String string){
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}

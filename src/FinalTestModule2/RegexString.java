package FinalTestModule2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexString {
    private String regex;

    public RegexString(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
    public Matcher getMatcher(String regex, String string){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(string);
        return m;
    }
}

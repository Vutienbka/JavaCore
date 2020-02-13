package CaseStudy_EnglishVietNameseDictionary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValueCompare implements RegexCompare {
    private String regexValueString;

    public String getRegexValueString() {
        return regexValueString;
    }

    public void setRegexValueString(String regexValueString) {
        this.regexValueString = regexValueString;
    }


    @Override
    public String getString(String regexValueString, String fileContent) {
        Pattern p = Pattern.compile(regexValueString);
        Matcher m = p.matcher(fileContent);
        return m.group(1);
    }
}

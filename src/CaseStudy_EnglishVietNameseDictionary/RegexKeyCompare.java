package CaseStudy_EnglishVietNameseDictionary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexKeyCompare implements RegexCompare {
    private String regexKeyString;

    public String getRegexKeyString() {
        return regexKeyString;
    }

    public void setRegexKeyString(String regexKeyString) {
        this.regexKeyString = regexKeyString;
    }

    @Override
    public String getString(String regexKeyString, String fileContent) {
        Pattern p = Pattern.compile(regexKeyString);
        Matcher m = p.matcher(fileContent);
        while (m.find()) {
            return m.group(1);
        }
        return m.group(1);
    }
}

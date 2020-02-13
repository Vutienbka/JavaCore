package CaseStudy_EnglishVietNameseDictionary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExpression {
   private String regex;

    public RegexExpression() {
       regex = "@(.*?)_/(.*?)\\*(.*?)__";
    }

    public RegexExpression(String regex) {
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
    public String makeStringToRegex(String firstString, String secondString, String thirdString){
        String regexString = "@" + firstString + "_/" + secondString + "\\_" + thirdString + "__";
        return regexString;
    }
    public String makeStandardVocabulary(String vocabulary){
        vocabulary = "@" + vocabulary + " ";
        return vocabulary;
    }
    public String makeStandardPhonetic(String phonetic){
        return "/" + phonetic + "/";
    }
    public String makeStandardMeaning(String meaning){
        meaning = "\n" + meaning + "\n\n";
        return meaning;
    }
    public String makeToStandardString(String string){
        string= string.replaceAll("\\*\\*","\n\\*");
        string = string.replaceAll("\\*","\n*");
        string = string.replaceAll("--","\n-");
        string = string.replaceAll("\\n\\n","\n");
        string = string.replaceAll("\\=","\n=");
        return string;
    }
    public String makeSequenceString(String string){
        string = string.replaceAll("\\n{2}", "__");
        string = string.replaceAll("\\n", "");
        string = string.replaceAll("-", "--");
        string = string.replaceAll("\\*", "**");
        string = string.replaceAll("\\s/", "_//");
        return string;
    }
}

package CaseStudy_EnglishVietNameseDictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class DicManage {
    Map<String,String> wordList = new TreeMap<>();
    MyWord myWord = new MyWord();
    RegexExpression regexExpression;
    FileIO fileIO;
    public Boolean addNewWord(String vocabulary, String phonetic, String meaning){
        regexExpression = new RegexExpression();
        String regex = regexExpression.makeStringToRegex(vocabulary,phonetic,meaning);
        String keyString = regexExpression.makeStandardVocabulary(vocabulary);
        String valueString = keyString + regexExpression.makeStandardPhonetic(phonetic) + regexExpression.makeStandardMeaning(meaning);
        Iterator<Map.Entry<String, String>> wordEntryKey = wordList.entrySet().iterator();
        try {
            while (wordEntryKey.hasNext()) {
                Map.Entry<String, String> currentEntry = wordEntryKey.next();
                if (currentEntry.getKey().equalsIgnoreCase(keyString)) {
                    return false;
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        wordList.put(keyString,valueString);
        return true;
    }
    public String searchFullMeaning(String searchingWord) {
        regexExpression= new RegexExpression();
        searchingWord = regexExpression.makeStandardVocabulary(searchingWord);
        Iterator<Map.Entry<String, String>> wordEntryKey = wordList.entrySet().iterator();
        try {
            while (wordEntryKey.hasNext()) {
                Map.Entry<String, String> currentEntry = wordEntryKey.next();
                if (currentEntry.getKey().equalsIgnoreCase(searchingWord))
                    return currentEntry.getValue();
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return "Null";
    }
    public String searchVerbMean(String searchingWord) {
        fileIO = new FileIO();
        fileIO.readFile();
        regexExpression = new RegexExpression("@(.*?)_/(.*?)\\*(.*?)__");
        String verbMean = null;
        String regex = regexExpression.getRegex();
        searchingWord = regexExpression.makeStandardVocabulary(searchingWord);
        Iterator<Map.Entry<String, String>> wordEntryKey = wordList.entrySet().iterator();
        try {
            while (wordEntryKey.hasNext()) {
                Map.Entry<String, String> currentEntry = wordEntryKey.next();
                if (currentEntry.getKey().equalsIgnoreCase(searchingWord)) {
                    String string = currentEntry.getValue().replaceAll("\\n","");
                    string = regexExpression.makeSequenceString(string);
                    string = string + "__";
                    Matcher m = regexExpression.getMatcher(regex,string);
                    while (m.find()){
                        // in tu moi va phat am
                        verbMean = currentEntry.getKey() + m.group(2);
                        String subVerbMeaning = m.group(3);
                        subVerbMeaning = subVerbMeaning.replaceAll("nội động từ", "động từ* nội động từ");
                        System.out.println(subVerbMeaning);
                        {
                            //regexExpression = new RegexExpression("\\*  (.*?)\\*\\*  động từ(.*?)$");
                            regexExpression = new RegexExpression("(\\*  động từ(.*?)$)|(\\*  (.*?)\\*\\*  động từ(.*?)$)");
                            String subRegex = regexExpression.getRegex();
                            Matcher m1;
                            m1 = regexExpression.getMatcher(subRegex,subVerbMeaning);
                            while (m1.find()){
                                verbMean += m1.group(2);
                                verbMean=regexExpression.makeToStandardString(verbMean);
                                //System.out.println(verbMean);
                            }
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return verbMean;
    }

    public String searchNounMean(String subVerbMeaning){
        // Tim danh tu
        //subVerbMeaning = subVerbMeaning.replaceAll("danh từ", "động từ* nội động từ");
        fileIO = new FileIO();
        fileIO.readFile();
        regexExpression = new RegexExpression("@(.*?)_/(.*?)\\*(.*?)__");
        String verbMean = null;
            regexExpression = new RegexExpression("^(.*?)[()(\\\\*\\\\*  động từ)]$");
            String subRegex = regexExpression.getRegex();
            //System.out.println(subVerbMeaning);
            Matcher m1 = regexExpression.getMatcher(subRegex,subVerbMeaning);
            while (m1.find()){
                //System.out.println(m1.group(1));
                verbMean = verbMean + m1.group(1);
                //System.out.println(verbMean);
                verbMean=regexExpression.makeToStandardString(verbMean);
                System.out.println(verbMean);
            }
            return verbMean;
    }
    public Map<String,String> putMapFromFile() {
        fileIO = new FileIO();
        regexExpression = new RegexExpression();
        String fileContent = fileIO.readFile();
        String regex = regexExpression.getRegex();
        Matcher m = regexExpression.getMatcher(regex,fileContent);
        while (m.find()) {
            String keyString= "@"+ m.group(1) + " ";
            keyString = keyString.replaceAll("\\-\\-","-");
            String valueString = (keyString + m.group(2) + m.group(3));
            valueString= regexExpression.makeToStandardString(valueString);
            wordList.put(keyString,valueString);
        }
        return wordList;
    }
    public void displayMap(){
        int count =0;
        Iterator<Map.Entry<String,String>> entry = wordList.entrySet().iterator();
        try {
            while (entry.hasNext()){
                count++;
                Map.Entry<String,String> currentEntry = entry.next();
                System.out.println(currentEntry.getValue());
                if(count==10)
                    break;
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
    public void deleteWord(String removingWord){
        regexExpression= new RegexExpression();
        removingWord = regexExpression.makeStandardVocabulary(removingWord);
        Iterator<Map.Entry<String, String>> wordEntryKey = wordList.entrySet().iterator();
        try {
            while (wordEntryKey.hasNext()) {
                Map.Entry<String, String> currentEntry = wordEntryKey.next();
                if (currentEntry.getKey().equalsIgnoreCase(removingWord)) {
                    System.out.println("Found");
                    wordList.remove(removingWord);
                    break;
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}

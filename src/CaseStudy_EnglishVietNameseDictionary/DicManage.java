package CaseStudy_EnglishVietNameseDictionary;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class DicManage {
    Map<String,MyWord> wordList = new TreeMap<>();
    final int EXIST = 0, NULL = -1, OK = 1;
    MyWord myWord;
    RegexExpression regexExpression;
    FileIO fileIO;

    public int addNewWord(String vocabulary, String phonetic, String meaning) {
        fileIO = new FileIO();
        regexExpression = new RegexExpression();

        if ((vocabulary.compareTo("") == 0) || (phonetic.compareTo("") == 0) || (meaning.compareTo("") == 0))
            return NULL;
        else {
            if (wordList.containsKey(vocabulary))
                return EXIST;
            else {
                phonetic = regexExpression.makeStandardPhonetic(phonetic);
                meaning = regexExpression.makeStandardMeaning(meaning);
                String keyString = regexExpression.makeStandardVocabulary(vocabulary);
                String valueString = keyString + phonetic + meaning;
                valueString = regexExpression.makeToStandardString(valueString);
                myWord = new MyWord(keyString,valueString);
                try {
                    fileIO.writeFile(myWord);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return OK;
    }

    public String searchFullMeaning(String searchingWord) {
        regexExpression= new RegexExpression();
        searchingWord = regexExpression.makeStandardVocabulary(searchingWord);
        Iterator<Map.Entry<String, MyWord>> wordEntryKey = wordList.entrySet().iterator();
        try {
            while (wordEntryKey.hasNext()) {
                Map.Entry<String, MyWord> currentEntry = wordEntryKey.next();
                if (currentEntry.getKey().equalsIgnoreCase(searchingWord))
                    return currentEntry.getValue().getMeaning();
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return "Null";
    }

    public Map<String, MyWord> putMapFromFile() {
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
            myWord = new MyWord(m.group(1),valueString);
            wordList.put(m.group(1),myWord);
        }
        return wordList;
    }
    public void displayMap(){
        int count =0;
        Iterator<Map.Entry<String,MyWord>> entry = wordList.entrySet().iterator();
        try {
            while (entry.hasNext()){
                count++;
                Map.Entry<String,MyWord> currentEntry = entry.next();
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
        Iterator<Map.Entry<String, MyWord>> wordEntryKey = wordList.entrySet().iterator();
        try {
            while (wordEntryKey.hasNext()) {
                Map.Entry<String, MyWord> currentEntry = wordEntryKey.next();
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

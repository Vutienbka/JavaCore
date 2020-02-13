package CaseStudy_EnglishVietNameseDictionary;

public class MyWord {
    private String englishWord;
    private String meaning;

    public MyWord() {
    }

    public MyWord(String englishWord, String meaning) {
        this.englishWord = englishWord;
        this.meaning = meaning;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}

package MapInJava;

import java.util.*;
import java.lang.String;
import java.util.Comparator;
public class DictionaryManage {
    Map<String, String> dictionaryMap = new HashMap<>();
    //Convert map to list


    public void addFirstData() {
        EnglishVietNameseDic twinWords1 = new EnglishVietNameseDic("Hello","xin chao" );
        dictionaryMap.put(twinWords1.getEnglish(), twinWords1.getVietnamese());

        EnglishVietNameseDic twinWord2 = new EnglishVietNameseDic("English", "tieng anh");
        dictionaryMap.put(twinWord2.getEnglish(),twinWord2.getVietnamese());

        EnglishVietNameseDic twinWord3 = new EnglishVietNameseDic("Vietnamese", "tieng viet");
        dictionaryMap.put(twinWord3.getEnglish(), twinWord3.getVietnamese());

        EnglishVietNameseDic twinWord4 = new EnglishVietNameseDic("Person", "con nguoi, ca nhan");
        dictionaryMap.put(twinWord4.getEnglish(), twinWord4.getVietnamese());

        EnglishVietNameseDic twinWord5 = new EnglishVietNameseDic("Man", "dan ong, con trai");
        dictionaryMap.put(twinWord5.getEnglish(), twinWord5.getVietnamese());
    }

    public void showMap() {
        //Map la mot interface nen ta phai khai bao: Map.Entry<String, String> entry
        for (Map.Entry<String, String> entry : dictionaryMap.entrySet()) {
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
    }

    public void findWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Searching word:");
        String searchingWord= scanner.nextLine();
        Iterator<Map.Entry<String,String>> iteratorKey = dictionaryMap.entrySet().iterator();
        while (iteratorKey.hasNext()) {
            Map.Entry<String, String> currentEntry = iteratorKey.next();
            if (currentEntry.getKey().equalsIgnoreCase(searchingWord))
            {
                System.out.println("meaning: " + currentEntry.getValue());
                return;
            }
        }
        System.out.println("Not Found");
    }
    public void removeAllMap(){
        dictionaryMap.clear();
    }

    public void sortMap(){

        // convert Map to List
        List<Map.Entry<String, String>> list = new ArrayList<>(dictionaryMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String,String>>() {
            @Override
            public int compare(Map.Entry<String,String> entry1, Map.Entry<String,String> entry2) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });
        //convert list to map
        Map<String, String> sortedMap= new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        //Sao chep vap Map ban dau
        dictionaryMap = sortedMap;
        System.out.println("Map after Sorted: ");
        System.out.println("---------------------------------------------");
        for (Map.Entry<String, String> entry : dictionaryMap.entrySet()) {
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
    }

}

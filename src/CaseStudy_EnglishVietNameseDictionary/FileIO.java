package CaseStudy_EnglishVietNameseDictionary;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileIO {
    RegexExpression regexExpression;
    public String FILE_PATH = "anhviet.txt";

    public FileIO() {
    }

    public String readFile() {
        regexExpression = new RegexExpression();
        File file = new File(FILE_PATH);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        content = regexExpression.makeSequenceString(content);
       // System.out.println(content);
        scanner.close();
        return content;
    }


}


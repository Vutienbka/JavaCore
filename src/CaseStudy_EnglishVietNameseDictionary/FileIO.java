package CaseStudy_EnglishVietNameseDictionary;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
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

    public void writeFile(MyWord myWord) throws IOException{
        regexExpression = new RegexExpression();
        File file = null;
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(FILE_PATH); // neu muon ghi noi tiep vao file FileWriter writer = new FileWriter("fileWriterExample.txt",true)
            // mac dinh la FileWriter writer = new FileWriter("fileWriterExample.txt",false) tuc la ghi de
            if(!file.exists())
                file.createNewFile();
            writer = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(writer);//Moi lan writer vao buffer cho den khi buffer day thi du lieu se khi vao file
           bufferedWriter.write(myWord.getMeaning());
        } catch (FileNotFoundException e){
            return ;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            bufferedWriter.close();
            writer.close();
        }
        System.out.println("Write file Successful");
        return ;
    }
}


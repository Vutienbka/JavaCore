package FinalTestModule2;

import CaseStudy_EnglishVietNameseDictionary.RegexExpression;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    RegexExpression regexExpression;
    private String FILE_PATH;

    public FileIO() {
    }

    public String readFile() {
        FILE_PATH = "/home/vutienbka/IdeaProjects/absolute-number-caculattor/src/FinalTestModule2/textfile/sinhvien.txt";
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
        content = content.replaceAll("\\n","_");
        // System.out.println(content);
        scanner.close();
        return content;
    }

    public void writeToFile(ArrayList<Student> students, String filePath) throws IOException {
        FILE_PATH = filePath;
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(FILE_PATH);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for(Student student : students) {
                String string = student.getId() + "; " + student.getName() + "; " + student.getEmail() + "; "
                        + student.getGrade().toString() + "\n";
                //System.out.println(string);
                bufferedWriter.write(string);
            }
            System.out.println("write file success");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            bufferedWriter.close();
            fileWriter.close();
        }

    }

}

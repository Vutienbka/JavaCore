package SumOfNumberInFile;

import java.io.*;

public class SumOfNumberInFile {
    public static void main(String[] args) throws IOException{
        File newFile = new File("ReadFileForCountingSumOfNumber.txt");
        if (!newFile.exists()) {
            newFile.createNewFile();
        }
        FileReader fileReader= new FileReader(newFile);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        int sum=0;
        int read = fileReader.read();
        int count =0;
        String string = "";
        while (read!=-1) {
            if(48<=read && read<=57){
                string += String.valueOf((char)read);
                count++;
            }
            else {
                if(count >0) {
                    if (string != "") {
                        //System.out.println(string);
                        sum += Integer.parseInt(string);
                        string = "";
                    }
                }
                count --;
                if(count <0)
                    count =0;
            }
            read = fileReader.read();
            if(read==-1)
                if (string != "") {
                    sum += Integer.parseInt(string);
                }
        }
//        System.out.println(count);
        System.out.println("Sum Of Number In File is: " + sum);
//        System.out.println((char)(sum - (count-1)*48));
    }
}

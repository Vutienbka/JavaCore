package FileIO;

import java.io.*;
import java.io.IOException;
public class FileReader_BufferWriter {
    public static void main(String[] args) {
        File file;
        FileReader fileReader;
        BufferedReader bufferedReader = null;

        try {
            // Open file
            file = new File("fileWriterExample3.txt");
//            if(!file.exists())
//                file.createNewFile();
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader); //BufferedReader(java.io)
            System.out.println("-->Start reading file and content of file as below<--");
            String contentLine = bufferedReader.readLine();
            while (contentLine != null){
                System.out.println(contentLine);
                contentLine = bufferedReader.readLine();//Chay sang dong tiep theo
            }
            //Close file
            bufferedReader.close();
            fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e){
            // if the file not existing
            e.printStackTrace();
            System.out.println("file not found");
        }
        System.out.println("-->read file end<--");
    }
}

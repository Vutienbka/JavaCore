package FileIO;
import java.io.*;

public class FileWriter_BufferWriter {
    private static final String fileName = "fileWriterExample3.txt";
    public static void main(String[] args) throws IOException {
        File file = null;
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(fileName); // neu muon ghi noi tiep vao file FileWriter writer = new FileWriter("fileWriterExample.txt",true)
            // mac dinh la FileWriter writer = new FileWriter("fileWriterExample.txt",false) tuc la ghi de
            if(!file.exists())
                file.createNewFile();
            writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);//Moi lan writer vao buffer cho den khi buffer day thi du lieu se khi vao file
            String newString = "Hello World";
            bufferedWriter.write(newString);
            System.out.println("Success");

        } catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            bufferedWriter.close();
            writer.close();
        }
    }
}

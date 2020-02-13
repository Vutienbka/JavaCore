package FileIO;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException{
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("fileWriterExample.txt");
            int i = fin.read();
            // Neu doc den cuoi tep tin thi se tra ve gia tri -1
            while (i != -1){
                System.out.printf("%c",(char)i);
                i= fin.read();
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            fin.close();
        }

    }
}

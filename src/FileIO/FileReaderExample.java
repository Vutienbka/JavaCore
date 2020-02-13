package FileIO;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader("fileWriterExample.text");
        int i = fileReader.read(); // Doc tung ky tu va tra ve -1 neu doc den cuoi file moi ky tu se co gia tri nguyen trong bang ma ASCII
        try{
            while (i != -1){
                System.out.println((char) i);
            }
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}


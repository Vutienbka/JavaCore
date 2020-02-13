package FileIO;
import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException{
        int[] arr = {1, 2, 3, 4, 5};
        try {
            FileOutputStream fout = new FileOutputStream("fileWriterExample1.txt");
            java.io.DataOutputStream dout = new java.io.DataOutputStream(fout);
            for (int i = 0; i < arr.length; i++)
                fout.write(i);
            fout.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

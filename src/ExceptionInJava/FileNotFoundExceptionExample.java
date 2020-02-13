package ExceptionInJava;

import java.io.*;

public class FileNotFoundExceptionExample{
    private static final String filename = "fileWriteExample.txt";
    public static void main(String[] args) {
        BufferedReader rd = null;
        try {
            // Open the file for reading.
            rd = new BufferedReader(new FileReader(new File(filename)));
            // Read all contents of the file.
            String inputLine = null;
            while((inputLine = rd.readLine()) != null)
                System.out.println(inputLine);
        }
        catch(IOException ex) {
            System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }
        finally {
            // Close the file.
            try {
                rd.close();
            }
            catch (IOException ex) {
                System.err.println("An IOException was caught!");
                ex.printStackTrace();
            }
        }
    }
}
//In case the file is missing, the following output is produced:
//An IOException was caught!
//java.io.FileNotFoundException: input.txt (No such file or directory)
//at java.io.FileInputStream.open(Native Method)
//at java.io.FileInputStream.(FileInputStream.java:146)
//at java.io.FileReader.(FileReader.java:72)
//at main.java.FileNotFoundExceptionExample.main(FileNotFoundExceptionExample.java:16)
//Exception in thread "main" java.lang.NullPointerException
//at main.java.FileNotFoundExceptionExample.main(FileNotFoundExceptionExample.java:30)
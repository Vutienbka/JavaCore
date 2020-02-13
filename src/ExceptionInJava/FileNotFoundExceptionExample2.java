package ExceptionInJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotFoundExceptionExample2 {

    private static final String filename = "input.txt";

    public static void main(String[] args) {
        BufferedWriter wr = null;
        try {
            // Open the file for writing, without removing its current content.
            wr = new BufferedWriter(new FileWriter(new File(filename), true));

            // Write a sample string to the end of the file.
            wr.write("A sample string to be written at the end of the file!\n");
        }
        catch(IOException ex) {
            System.err.println("An IOException was caught!");
            ex.printStackTrace();
        }
        finally {
            // Close the file.
            try {
                wr.close();
            }
            catch (IOException ex) {
                System.err.println("An IOException was caught!");
                ex.printStackTrace();
            }
        }
    }
}
/*If the file exists and is a directory, the following exception is thrown:
An IOException was caught!
java.io.FileNotFoundException: input.txt (Is a directory)
at java.io.FileOutputStream.open(Native Method)
at java.io.FileOutputStream.(FileOutputStream.java:221)
at java.io.FileWriter.(FileWriter.java:107)
at main.java.FileNotFoundExceptionExample_v2.main(FileNotFoundExceptionExample_v2.java:16)
Exception in thread "main" java.lang.NullPointerException
at main.java.FileNotFoundExceptionExample_v2.main(FileNotFoundExceptionExample_v2.java:28)

If the file exists, but it doesn’t have the appropriate permissions for writing, the following exception is thrown:
An IOException was caught!
java.io.FileNotFoundException: input.txt (Permission denied)
at java.io.FileOutputStream.open(Native Method)
at java.io.FileOutputStream.(FileOutputStream.java:221)
at java.io.FileWriter.(FileWriter.java:107)
at main.java.FileNotFoundExceptionExample_v2.main(FileNotFoundExceptionExample_v2.java:16)
Exception in thread "main" java.lang.NullPointerException
at main.java.FileNotFoundExceptionExample_v2.main(FileNotFoundExceptionExample_v2.java:28)
 */

/*
--------------->>>>> How to deal with the FileNotFoundException
If the message of the exception claims that there is no such file or directory, then you must verify that the specified is correct
and actually points to a file or directory that exists in your system.
If the message of the exception claims that permission is denied then,
you must first check if the permissions of the file are correct and second,
if the file is currently being used by another application.
If the message of the exception claims that the specified file is a directory,
then you must either alter the name of the file or delete the existing directory (if the directory is not being used by an application).
 */
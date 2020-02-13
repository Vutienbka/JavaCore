package ListSubfoldersAndFiles;
import java.io.*;
import java.util.Scanner;

public class ListSubfolderAndFiles {
    // exist() : Kiem tra thu muc hoac file co ton tai hay khong
    // isDirectory() : Kiem tra doi tuong co phai la thu muc hay khong
    // listFiles() : để lấy danh sách thư mục hoặc file trong một thư mục
    // getCanonicalPath() : để lấy đường dẫn của thư mục hoặc file

    public static void main(String[] args) throws IOException {
        System.out.println("The program shows the directory tree");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the directory: ");
        String path = scanner.nextLine();
        //code below here
        directoryTree(path);
    }
    public static void directoryTree(String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Folder " + path + " does not exist");
        }
        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null) {
                for (File f : list) {
                    System.out.println(f.getCanonicalPath());
                    directoryTree(f.getCanonicalPath());
                }
            }
        }
    }
}

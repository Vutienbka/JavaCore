package ExceptionInJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException5 {

    public static void main(String[] args) {
        try{
            checkTriangle();
        }catch (InputMismatchException e){
            System.out.println("Exception content: " + e);
        }
        catch (Exception e){
            System.out.println("Exception content: " + e);
        }
        System.out.println("Cac ban moi thuc hien xong chuong trinh kiem tra tam giac");
    }

    public static void checkTriangle() throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba canh mot tam gia tu ban phim");
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();
        try {
            if (a < 0 || b < 0 || c < 0) {
                throw new InputMismatchException("Thong so canh nhap vao khong hop le");
            }
        }catch (InputMismatchException e){
            System.out.println("Exception content:" +e);
        }
        if((a + b) < c || (a + c) < b || (b +c) < a){
            throw new Exception("Khong thoa man dieu kien cua mot tam giac");
        }
    }
}

package ExceptionInJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException2 {
    public static void main(String[] args) {
            checkTriangle();
    }

    public static void checkTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ba canh mot tam gia tu ban phim");
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("c = ");
        int c = scanner.nextInt();
        try {
            if (a < 0 || b < 0 || c < 0 || (a + b) < c || (a + c) < b || (b + c) < a) {
                throw new InputMismatchException("Tam giac khong hop le");
            }
        }catch (InputMismatchException e){
            System.out.println("Exception content: " + e);
        }
    }
}

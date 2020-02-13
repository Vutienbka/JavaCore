package ExceptionInJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException3 {
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
        // Khong the tao 2 throw new duoc
        try {
            if (a < 0 || b < 0 || c < 0 ) {
                throw new InputMismatchException("Thong so nhap vao co so khong hop le");
            }
//            if((a + b) < c || (a + c) < b || (b + c) < a){
//                throw new Exception("khong thoa man dieu kien 3 canh cua tam giac");
            }catch (InputMismatchException e){
                System.out.println("Exception content: " + e);
            }
//            catch (Exception e){
//                System.out.println(" ");
//            }
//        }
    }
}

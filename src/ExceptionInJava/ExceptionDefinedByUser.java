package ExceptionInJava;
import java.util.Scanner;
// Dinh nghia mot ngoai le va ne ngoai le

public class ExceptionDefinedByUser {
    public static void main(String[] args) {
        try {
            divideNumber(1,0);
        }catch (MyException e) {
            System.out.println(e.getError());
        }
    }
    public static void divideNumber(int a, int b) throws MyException{
        try {
            System.out.println("Result: " + a / b);
        }catch ( Exception e){
            throw new MyException("Loi so hoc");
        }
    }

}

// Trong bai nay ta da su dung try long nhau
// ban dau ta dinh nghia try con de dinh nghia mot exception moi
// Sau so exception nay se dc thuc hien trong try cha
// phuong thuc nao muon ne ngoai le thi khai bao throws
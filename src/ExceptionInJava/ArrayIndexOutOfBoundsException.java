package ExceptionInJava;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] arr = input();
        System.out.println("Nhap phan tu bat ky: ");
        try {
            int index = scanner.nextInt();
            System.out.printf("arr[%d] = %d", index, arr[index]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Chi so vuot qua kich thuoc cua mang");
        }
        catch (NumberFormatException e){
            System.out.println("So nhap vao khong dung dinh dang ve kieu du lieu");
        }
        catch (InputMismatchException e){
            System.out.println("So nhap vao khong dung dinh dang ve kieu so");
        }
        System.out.println();
        System.out.println("Tiep tuc chay chuong trinh");
    }
    public static Integer[] input(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
//String index = scanner.nextLine();
//float i = parseInt(index);
//Neu khai bao nhu tren se sinh ra ngoai le NumberFormatException
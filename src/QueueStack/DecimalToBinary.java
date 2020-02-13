package QueueStack;

import java.util.Stack;
import java.util.Scanner;
public class DecimalToBinary {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N = ");
        int N = scanner.nextInt();
        while (N>0) {
            stack.push(N % 2);
            N =N/2;
        }
        while(!stack.isEmpty()) {
            //System.out.print(stack.peek() + "   ");
            System.out.print(stack.pop());
        }

    }


}

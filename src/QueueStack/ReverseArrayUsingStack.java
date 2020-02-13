package QueueStack;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        int[] array = {1,2,3,4,5,6};
        for(int i=0; i<array.length; i++)
            stack.push(array[i]);
        System.out.println("Array after reversed:");
        while (!stack.isEmpty())
            System.out.printf("%d",stack.pop());
    }
}

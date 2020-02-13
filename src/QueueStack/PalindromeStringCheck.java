package QueueStack;

import java.util.Stack;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "Able was I ere I saw Elba";
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        for(int i = 0; i<ch.length;i++)
            stack.push(ch[i]);
        int i =0;
        while (!stack.isEmpty()){
            if(stack.pop()==ch[i])
                i++;
            else {
                System.out.println("is not Palindrome String");
                return;
            }
        }
        System.out.println("is Palindrome String");
    }
}

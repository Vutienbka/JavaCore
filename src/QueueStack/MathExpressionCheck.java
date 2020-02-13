package QueueStack;

import java.util.Stack;

public class MathExpressionCheck {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack();
        //String s= "3+(2+3-6*2) - (12+3)";
        //String s = "s * (s – a) * (s – b) * (s – c) ";
        //String s = "(– b + (b2 – 4*a*c)^0.5) / 2*a ";
        //String s = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String s = "s * (s – a) * s – b) * (s – c)";
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length;i++) {
            if(ch[i]=='(')
            stack.push(ch[i]);
            else if(stack.isEmpty()) {
                if (ch[i] == ')')
                stack.push(ch[i]);
            }
            else stack.pop();
        }
        if(stack.isEmpty())
            System.out.println("is right string");
        else System.out.println("is not right string");
    }
}

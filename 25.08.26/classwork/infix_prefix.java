package practise;

import java.util.*;

public class infix_prefix {

    static String reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    static int precedence_check(char c) {

        if (c == '*' || c == '/' || c == '%') {
            return 2;
        }

        if (c == '+' || c == '-') {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {

        String s = "A*B+(C-D)/E%F";

        StringBuilder res = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String rev = reverse(s);


        for (int i = 0; i < rev.length(); i++) {

            char c = rev.charAt(i);

    
            if (c>='A'&&c<='Z') {
                res.append(c);
            }


            else if (c == ')') {
                stack.push(c);
            }

            else if (c == '(') {

                while (!stack.isEmpty() && stack.peek() != ')') {
                    res.append(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {

                while (!stack.isEmpty()
                        && stack.peek() != ')'
                        && precedence_check(c) < precedence_check(stack.peek())) {

                    res.append(stack.pop());
                }

                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        String prefix = reverse(res.toString());

    
        System.out.println( prefix);
    }
}

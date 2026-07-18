import java.util.*;

class Main {
    static String prefixToPostfix(String exp) {
        Stack<String> stack = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                stack.push(ch + "");
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                String temp = op1 + op2 + ch;

                stack.push(temp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "*+AB-CD";
        System.out.println(prefixToPostfix(exp));
    }
}
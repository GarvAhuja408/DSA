import java.util.*;

class Main {
    static int precedence(char ch) {
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return -1;
    }
    public static String reverse(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (ch == '(') {
                ans.append(')');
            } else if (ch == ')') {
                ans.append('(');
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static String infixToPostfix(String exp) {

        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                ans.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }

                stack.pop();
            }
            else {

                while (!stack.isEmpty() &&
                        ((ch != '^' && precedence(ch) <= precedence(stack.peek())) ||
                         (ch == '^' && precedence(ch) < precedence(stack.peek())))) {

                    ans.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.toString();
    }

    static String infixToPrefix(String exp) {
        String reversed = reverse(exp);
        String postfix = infixToPostfix(reversed);
        return reverse(postfix);
    }
    public static void main(String[] args) {
        String exp = "(A-B/C)*(A/K-L)";

        System.out.println(infixToPrefix(exp));
    }
}
import java.util.Stack;
class Main {
    static String postfixToInfix(String exp) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {

                stack.push(ch + "");

            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();

                String temp = "(" + op1 + ch + op2 + ")";

                stack.push(temp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "AB+CD-*";
        System.out.println(postfixToInfix(exp));
    }
}
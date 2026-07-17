class Main {

    static String prefixToInfix(String exp) {

        String[] stack = new String[exp.length()];
        int top = -1;

        for (int i = exp.length() - 1; i >= 0; i--) {

            char ch = exp.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {

                stack[++top] = String.valueOf(ch);

            } else {

                String op1 = stack[top--];
                String op2 = stack[top--];

                String temp = "(" + op1 + ch + op2 + ")";

                stack[++top] = temp;
            }
        }

        return stack[top];
    }

    public static void main(String[] args) {

        String exp = "*+AB-CD";

        System.out.println(prefixToInfix(exp));
    }
}
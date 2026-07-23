import java.util.Stack;

class Main {

    static String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }

            stack.push(ch);
        }

        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        ans.reverse();

        int i = 0;

        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        if (i == ans.length()) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (i < ans.length()) {
            result.append(ans.charAt(i));
            i++;
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String num = "1432219";
        int k = 3;

        System.out.println(removeKdigits(num, k));
    }
}
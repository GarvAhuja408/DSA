class Main {

    static String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();

        int start = 0;

        while (start < s.length()) {

            int end = start;

            while (end < s.length() && s.charAt(end) != ' ') {
                end++;
            }

            for (int i = end - 1; i >= start; i--) {
                ans.append(s.charAt(i));
            }

            if (end < s.length()) {
                ans.append(' ');
            }

            start = end + 1;
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
}

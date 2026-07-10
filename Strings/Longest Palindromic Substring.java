class Main {

    static String longestPalindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {

            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() &&
                    s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() &&
                    s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLen) {
                    maxLen = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = start; i < start + maxLen; i++) {
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        String s = "babad";

        System.out.println(longestPalindrome(s));
    }
}

class Main {

    static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int j = i;

            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            for (int k = j + 1; k <= i; k++) {
                ans.append(s.charAt(k));
            }

            ans.append(' ');
            i = j;
        }

        if (ans.length() > 0) {
            ans.deleteCharAt(ans.length() - 1);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "  the   sky is   blue  ";
        System.out.println(reverseWords(s));
    }
}

class Main {

    static String largestOddNumber(String s) {

        int index = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';

            if (digit % 2 != 0) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i <= index; i++) {
            ans.append(s.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "354270";
        System.out.println(largestOddNumber(s));
    }
}
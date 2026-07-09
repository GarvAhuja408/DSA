class Main {

    static int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        long ans = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            ans = ans * 10 + (s.charAt(i) - '0');

            if (sign == 1 && ans > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -ans < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (ans * sign);
    }

    public static void main(String[] args) {

        String s = "   -42";

        System.out.println(myAtoi(s));
    }
}

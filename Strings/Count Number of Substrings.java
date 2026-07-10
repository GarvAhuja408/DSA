class Main {

    static int countSubstrings(String s) {

        int n = s.length();

        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        String s = "abcd";

        System.out.println(countSubstrings(s));
    }
}

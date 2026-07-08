class Main {

    static int maxDepth(String s) {

        int open = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                open++;

                if (open > max) {
                    max = open;
                }
            } else if (ch == ')') {
                open--;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(maxDepth(s));
    }
}
class Solution {

    public static boolean isSet(int n, int i) {

        if((n & (1 << i)) != 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 13;
        int i = 2;

        System.out.println(isSet(n, i));
    }
}
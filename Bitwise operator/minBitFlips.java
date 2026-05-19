class Solution {

    public static int minBitFlips(int start, int goal) {

        int xor = start ^ goal;
        int count = 0;

        while(xor != 0) {

            count += (xor & 1);
            xor = xor >> 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int start = 10;
        int goal = 7;

        System.out.println(minBitFlips(start, goal));
    }
}

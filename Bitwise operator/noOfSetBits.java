public class Main {

    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            count += (n & 1);
            n = n >> 1;
        }

        return count;
    }
    public static void main(String[] args) {

        int n = 13;

        int result = countSetBits(n);

        System.out.println("Number of set bits = " + result);
    }
}
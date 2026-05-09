public class Main {

    static int xorTillN(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }

    static int findXOR(int L, int R) {
        return xorTillN(R) ^ xorTillN(L - 1);
    }
    public static void main(String[] args) {
        int L = 3, R = 5;

        System.out.println(findXOR(L, R));
    }
}